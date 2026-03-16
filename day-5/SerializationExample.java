package com.abc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student1 implements Serializable{
	int id;
	String name;
	int salary;
	String designation;
	public Student1(int id, String name, int salary, String designation) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
	}	
}

public class SerializationExample {
	public static void main(String[] args) {
		Student1 ob1=new Student1(101, "yd5",10000,"Engineer");
		try {
			FileOutputStream fo = new FileOutputStream("C:\\Users\\YD5\\Desktop\\Day2\\day5\\src\\com\\abc\\students1.txt");
			ObjectOutputStream os = new ObjectOutputStream(fo);
			os.writeObject(ob1);
			os.close();
			fo.close();
			System.out.println("Object serialized successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fi = new FileInputStream("C:\\Users\\YD5\\Desktop\\Day2\\day5\\src\\com\\abc\\students1.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Student1 s=(Student1) oi.readObject();
			System.out.println("ID : " + s.id);
            System.out.println("Name : " + s.name);
            System.out.println("Salary : "+ s.salary);
            System.out.println("Designation : "+s.designation);
			oi.close();
			fi.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
