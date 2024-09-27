// Write a java program to make addition, Subtraction and multiplication of two matrix using 2-D Array 



package com.array;

import java.util.Scanner;

public class Task_4 {
	
	public static int[][] addition (int [][] matrix_A, int [][] matrix_B, int row, int col) {
		
		int [][] matrix_C = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix_C [i][j] = matrix_A[i][j] + matrix_B[i][j];
			}
		}
		
		return matrix_C;
	}
	
	public static int[][] subtraction (int [][] matrix_A, int [][] matrix_B, int row, int col) {
		
		int [][] matrix_C = new int[row][col];
		for(int i = 0; i < row; i++) {			
			for(int j = 0; j < col; j++) {
				matrix_C [i][j] = matrix_A[i][j] - matrix_B[i][j];
			}
		}
		
		return matrix_C;
	}
	
	public static int[][] multiplication (int [][] matrix_A, int [][] matrix_B, int row, int col) {
		
		int [][] matrix_C = new int[row][col];
		for(int i = 0; i < row; i++) {			
			for(int j = 0; j < col; j++) {
				matrix_C[i][j] = 0;
				for(int k = 0; k < col; k++) {
					matrix_C[i][j] += matrix_A[i][k] * matrix_B[k][j];
				}
			}
		}
		
		return matrix_C;
	}
	
	
	public static void displayMatrix(int [][] matrix, int row, int col) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows of 2D-Matrix: ");
		int row = sc.nextInt();
		
		System.out.println("Enter number of columns of 2D-Matrix: ");
		int col = sc.nextInt();
		
		System.out.println("Enter values for Matrix-A: ");
		int [][] matrix_A = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix_A [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter values for Matrix-B: ");
		int [][] matrix_B = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				matrix_B [i][j] = sc.nextInt();
			}
		}
		
		int [][] matrix_C = new int[row][col];
		
		System.out.println("Enter 1 for Addition: ");
		System.out.println("Enter 2 for Subtraction: ");
		System.out.println("Enter 3 for Multiplication: ");
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			if(row == col) {
			matrix_C = addition(matrix_A, matrix_B, row, col);
			displayMatrix(matrix_C, row, col);
			}
			else {
				System.out.println("Number of rows and columns is not equal:");
			}
			break;
			
		case 2:
			if(row == col) {
				matrix_C = subtraction(matrix_A, matrix_B, row, col);
				displayMatrix(matrix_C, row, col);
				}
				else {
					System.out.println("Number of rows and columns is not equal:");
				}
				break;
		
		case 3:
			if(row == col) {
				matrix_C = multiplication(matrix_A, matrix_B, row, col);
				displayMatrix(matrix_C, row, col);
				}
				else {
					System.out.println("Number of rows and columns is not equal:");
				}
				break;
			
		default:
			System.out.println("Enter Valid choice !!");
			break;
		}
		
		
	}
}
