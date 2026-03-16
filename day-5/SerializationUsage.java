package com.abc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}	
}

public class SerializationUsage {
	public static void main(String[] args) {
		Student ob1=new Student(101, "yd5");
		try {
			FileOutputStream fo = new FileOutputStream("C:\\Users\\YD5\\Desktop\\Day2\\day5\\src\\com\\abc\\students.txt");
			ObjectOutputStream os = new ObjectOutputStream(fo);
			os.writeObject(ob1);
			os.close();
			fo.close();
			System.out.println("Object serialized successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fi = new FileInputStream("students.txt");
			ObjectInputStream oi = new ObjectInputStream(fi);
			Student s=(Student) oi.readObject();
			System.out.println("ID          : " + s.id);
            System.out.println("Name        : " + s.name);
			oi.close();
			fi.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
