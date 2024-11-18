/*
 * W.A.J.P to create a class Student with attributes roll no, name, age and course. 
 * Initialize values through parameterized constructor. If age of student is not in between 15 
 * and 21 then generate user defined exception "AgeNotWithinRangeException". If name contains 
 * numbers or special symbols raise exception "NameNotValidException". Define the two exception classes.
 * 
 * 
 */


package com.exception;


//Custom Exception for Age Validation
class AgeNotWithinRangeException extends Exception {
 public AgeNotWithinRangeException(String message) {
     super(message);
 }
}

//Custom Exception for Name Validation
class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}

class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 // Parameterized constructor
 public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
     if (age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
     }
     if (!name.matches("[a-zA-Z ]+")) {  // checks if the name contains only alphabets and spaces
         throw new NameNotValidException("Name must contain only alphabets and spaces.");
     }
     
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 @Override
 public String toString() {
     return "Student [Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course + "]";
 }
}

public class Task_7 {
 public static void main(String[] args) {
     try {
         // Create a student with valid data
         Student student1 = new Student(1, "Shiv", 19, "Computer Science");
         System.out.println(student1);

         // Create a student with invalid age
         Student student2 = new Student(2, "Devang", 22, "Mathematics");

     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }

     try {
         // Create a student with invalid name
         Student student3 = new Student(3, "Shiv$123", 18, "Physics");

     } catch (AgeNotWithinRangeException | NameNotValidException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}
