/*
 * W.A.J.P to find all interleaving of given strings. The given strings are: WX YZ 
 * The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ 
 */


package com.string;

public class Task_10 {
	
	// Function to find all interleavings of str1 and str2
    public static void findInterleavings(String str1, String str2, String result) {
        // If both strings are empty, we have an interleaving
        if (str1.isEmpty() && str2.isEmpty()) {
            System.out.println(result);
            return;
        }

        // If str1 is not empty, append its first character and recurse
        if (!str1.isEmpty()) {
            findInterleavings(str1.substring(1), str2, result + str1.charAt(0));
        }

        // If str2 is not empty, append its first character and recurse
        if (!str2.isEmpty()) {
            findInterleavings(str1, str2.substring(1), result + str2.charAt(0));
        }
    }

    public static void main(String[] args) {
        String str1 = "WX";
        String str2 = "YZ";

        System.out.println("The interleaving strings are:");
        findInterleavings(str1, str2, "");
    }
}
