package com.a310;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
	public static void main(String[] args) throws IOException {
		
		try {
		Student s1 = new Student(101, "Shiv");
		
		FileOutputStream fout= new FileOutputStream("D://java123.txt");
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		
		out.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
