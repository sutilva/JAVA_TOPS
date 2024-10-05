package com.a210;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D://java123.txt");
		fw.write("Hello");
		
		System.out.println("Executed");
		fw.close();
		
		FileReader fr = new FileReader("D://java123.txt");
		
		int i = 0;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
		fr.close();
	}
}
