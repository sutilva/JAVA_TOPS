package com.a310;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEx {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://java123.txt"));
		Student s = (Student) in.readObject();
		
		System.out.println(s.id+ " "+ s.name);
		
		in.close();
	}
}
