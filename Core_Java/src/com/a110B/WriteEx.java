package com.a110B;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteEx {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		String file_address = "C:\\Users\\tilva\\Desktop";
		
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		
		FileOutputStream fout = new FileOutputStream(file_address);
		fout.write(str.getBytes());
		System.out.println("Successfully file created");
	}
}
