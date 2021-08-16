package com.lc.Serializable;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
		Student stu=new Student();
		//Witer(stu);
        //read(stu);
		 Array(stu);
	}

	private static void read(Student st) throws IOException, ClassNotFoundException, CloneNotSupportedException {
		InputStream in=new FileInputStream("E:\\text\\st.stu");
		ObjectInputStream oi=new ObjectInputStream(in);
		Student stu = (Student)oi.readObject();
		System.out.println(stu.name+"  "+stu.age);
		System.out.println(st==stu);
		Student stu1 = (Student)stu.clone();
		System.out.println(stu==stu1);
		System.out.println(stu1.name+"  "+stu1.age);
		oi.close();
		in.close();
		
	}

	private static void Witer(Student stu) throws IOException {
		OutputStream out=new FileOutputStream("E:\\text\\st.stu");
		ObjectOutputStream o=new ObjectOutputStream(out);
		o.writeObject(stu);
		o.flush();
		o.close();
	}
	
	public static void Array(Student stu) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream os=new ObjectOutputStream(bos);
		os.writeObject(stu);
		os.flush();
		os.close();
		
		ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream o=new ObjectInputStream(bis);
		Student s = (Student)o.readObject();
		System.out.println(s.name+"  "+s.age);
		o.close();
		bis.close();
	}

}
