// ── helpers ──────────────────────────────────────────────────────────────────
function escapeHtml(str) {
    return String(str)
        .replace(/&/g,'&amp;').replace(/</g,'&lt;')
        .replace(/>/g,'&gt;').replace(/"/g,'&quot;');
}

function showStatus(msg, type) {
    const s = document.getElementById('status');
    if (!s) return;
    s.textContent = msg;
    s.className = 'alert alert-' + (type || 'info');
    s.style.display = 'block';
    setTimeout(() => s.style.display = 'none', 3500);
}

// ── employees list ────────────────────────────────────────────────────────────
async function fetchEmployees() {
    const res = await fetch('/getAllEmployee', { credentials: 'same-origin' });
    if (!res.ok) { showStatus('Failed to load employees (status ' + res.status + ')', 'danger'); return; }
    const data = await res.json();
    const tbody = document.querySelector('#employeesTable tbody');
    tbody.innerHTML = '';
    if (data.length === 0) {
        tbody.innerHTML = '<tr><td colspan="6" class="text-center text-muted">No employees found</td></tr>';
        return;
    }
    data.forEach(e => {
        const tr = document.createElement('tr');
        tr.innerHTML =
            `<td>${e.id}</td>
             <td>${escapeHtml(e.name)}</td>
             <td>${e.age}</td>
             <td><span class="badge bg-secondary">${e.designation}</span></td>
             <td>&#8377;${e.salary.toLocaleString()}</td>
             <td>
                <button class="btn btn-sm btn-success me-1" onclick="openRaiseModal(${e.id},'${escapeHtml(e.name)}',${e.salary})">Raise</button>
                <button class="btn btn-sm btn-danger" onclick="deleteEmployee(${e.id})">Delete</button>
             </td>`;
        tbody.appendChild(tr);
    });
}

async function deleteEmployee(id) {
    if (!confirm('Delete employee #' + id + '?')) return;
    const res = await fetch('/deleteEmployee/' + id, { method: 'DELETE', credentials: 'same-origin' });
    res.ok ? (showStatus('Employee deleted', 'success'), fetchEmployees())
           : showStatus('Delete failed', 'danger');
}

async function deleteAll() {
    if (!confirm('Delete ALL employees? This cannot be undone.')) return;
    const res = await fetch('/deleteAllEmployee', { method: 'DELETE', credentials: 'same-origin' });
    res.ok ? (showStatus('All employees deleted', 'success'), fetchEmployees())
           : showStatus('Failed to delete all', 'danger');
}

// ── raise modal ───────────────────────────────────────────────────────────────
let bsModal = null;
let modalTargetId = null;

window.openRaiseModal = function(id, name, salary) {
    modalTargetId = id;
    document.getElementById('modalInfo').textContent =
        name + '  —  current salary \u20b9' + salary.toLocaleString();
    document.getElementById('modalPercentage').value = '';
    bsModal.show();
};

// ── init ──────────────────────────────────────────────────────────────────────
document.addEventListener('DOMContentLoaded', () => {

    // employees page ─ only wire when modal exists
    const modalEl = document.getElementById('raiseModal');
    if (modalEl) {
        bsModal = new bootstrap.Modal(modalEl);

        document.getElementById('modalConfirm').addEventListener('click', async () => {
            const p = parseInt(document.getElementById('modalPercentage').value);
            if (isNaN(p) || p <= 0) { showStatus('Enter a valid percentage', 'danger'); return; }
            const res = await fetch('/raiseSalary/' + modalTargetId, {
                method: 'PUT',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify({ percentage: p }),
                credentials: 'same-origin'
            });
            if (res.ok) {
                showStatus('Salary raised successfully', 'success');
                bsModal.hide();
                fetchEmployees();
            } else {
                const txt = await res.text();
                showStatus('Raise failed: ' + txt, 'danger');
            }
        });

        document.getElementById('refresh').addEventListener('click', fetchEmployees);
        document.getElementById('deleteAll').addEventListener('click', deleteAll);
        fetchEmployees(); // auto-load on page open
    }

    // add page
    const addForm = document.getElementById('addForm');
    if (addForm) {
        addForm.addEventListener('submit', async (e) => {
            e.preventDefault();
            const body = {
                name:        addForm.querySelector('[name=name]').value,
                age:         parseInt(addForm.querySelector('[name=age]').value),
                designation: addForm.querySelector('[name=designation]').value
            };
            const res = await fetch('/addEmployee', {
                method: 'POST',
                headers: { 'Content-Type': 'application/json' },
                body: JSON.stringify(body),
                credentials: 'same-origin'
            });
            if (res.ok) {
                location.href = '/employees';
            } else {
                const txt = await res.text();
                const err = document.getElementById('formError');
                err.textContent = txt || 'Add failed'; err.style.display = 'block';
            }
        });
    }
});

