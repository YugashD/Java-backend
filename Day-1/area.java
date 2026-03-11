package march10Todo.payrollManagement;

import java.util.Scanner;

public class area {
    double areaOfCircle(int radius){
        double area=0;
        area=Math.pow(radius,2)*3.14;
        return area;
    }
    double areaOfTriangle(int height,int base){
        double area;
        area=0.5*height*base;
        return area;
    }
    void fibonacci(int n){
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2);
        for(int i=0;i<n-2;i++){
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    int factorial(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for area of circle\nEnter 2 for area of triangle\nEnter 3 for finbonacci series\nEnter 4 for factorial");
        area a=new area();
        System.out.print("Enter your option: ");
        int op=sc.nextInt();
        switch (op) {
            case 1:
                System.out.println("Enter radius of circle:");
                int radius = sc.nextInt();
                System.out.println("Area of circle is: " + a.areaOfCircle(radius));
                break;
            case 2:
                System.out.println("Enter height of triangle:");
                int height = sc.nextInt();
                System.out.println("Enter base of triangle:");
                int base = sc.nextInt();
                System.out.println("Area of triangle is: " + a.areaOfTriangle(height, base));
                break;
            case 3:
                System.out.println("Enter n for finbonacci series:");
                int n = sc.nextInt();
                a.fibonacci(n);
                break;
            case 4:
                System.out.println("Enter n for factorial:");
                int n2 = sc.nextInt();
                System.out.println("Factorial of " + n2 + " is: " + a.factorial(n2));
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
