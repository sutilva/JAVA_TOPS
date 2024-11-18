/*
 * W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch block. try {
try
{//code}
catch (Exception e)
{//code}
catch (Exception e)
{//code}
 */


package com.exception;

public class Task_3 {
	
	public static void main(String[] args) {
		
		int a[] = new int [5];
		int res = 0;
		
		try {
									
			try {
				res = 30/0;				
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			a[5] = res;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
