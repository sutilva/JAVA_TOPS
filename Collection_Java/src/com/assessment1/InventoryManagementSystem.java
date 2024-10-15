package com.assessment1;

import java.util.ArrayList;
import java.util.Scanner;

//Inventory Management System class
public class InventoryManagementSystem {
 private ArrayList<Product> productList;
 private Scanner sc;

 public InventoryManagementSystem() {
     productList = new ArrayList<>();
     sc = new Scanner(System.in);
 }

 // Main method to run the inventory management system
 public static void main(String[] args) {
     InventoryManagementSystem ims = new InventoryManagementSystem();
     ims.showMenu();
 }

 // Method to display the main menu
 public void showMenu() {
     while (true) {
         System.out.println("\n--- Inventory Management System ---");
         System.out.println("1 -> Add Stock");
         System.out.println("2 -> View Stock");
         System.out.println("3 -> Search Stock");
         System.out.println("4 -> Edit Stock");
         System.out.println("5 -> Delete Stock");
         System.out.println("6 -> Exit");
         System.out.print("Select an option (1-6): ");
         int choice = sc.nextInt();
         sc.nextLine(); // Consume newline

         switch (choice) {
             case 1:
                 addStock();
                 break;
             case 2:
                 viewStock();
                 break;
             case 3:
                 searchStock();
                 break;
             case 4:
                 editStock();
                 break;
             case 5:
                 deleteStock();
                 break;
             case 6:
                 System.out.println("Exiting...");
                 System.exit(0);
                
             default:
                 System.out.println("Invalid option. Please try again.");
         }
     }
 }

 // Method to add stock
 public void addStock() {
     System.out.print("Enter Product ID: ");
     String id = sc.nextLine();
     System.out.print("Enter Product Name: ");
     String name = sc.nextLine();
     System.out.print("Enter Product Price: ");
     double price = sc.nextDouble();
     System.out.print("Enter Product Quantity: ");
     int quantity = sc.nextInt();
     sc.nextLine(); // Consume newline
     System.out.print("Enter Product Company: ");
     String company = sc.nextLine();

     Product product = new Product(id, name, price, quantity, company);
     productList.add(product);
     System.out.println("Product added successfully!");
 }

 // Method to view stock
 public void viewStock() {
     if (productList.isEmpty()) {
         System.out.println("No products available.");
         return;
     }
     System.out.println("\n--- Product List ---");
     for (int i = 0; i < productList.size(); i++) {
         System.out.println(productList.get(i));
     }
 }

 // Method to search stock
 public void searchStock() {
     System.out.print("Enter Product ID to search: ");
     String id = sc.nextLine();
     
     for (int i = 0; i < productList.size(); i++) {
         if (productList.get(i).getProductId().equals(id)) {
             System.out.println("Product found: " + productList.get(i));
             return;
         }
     }
     System.out.println("Product not found.");
 }

 // Method to edit stock
 public void editStock() {
     System.out.print("Enter Product ID to edit: ");
     String id = sc.nextLine();
     for (int i = 0; i < productList.size(); i++) {
         if (productList.get(i).getProductId().equals(id)) {
             System.out.print("Enter new Product Name: ");
             productList.get(i).setProductName(sc.nextLine());
             System.out.print("Enter new Product Price: ");
             productList.get(i).setProductPrice(sc.nextDouble());
             System.out.print("Enter new Product Quantity: ");
             productList.get(i).setProductQuantity(sc.nextInt());
             sc.nextLine(); // Consume newline
             System.out.print("Enter new Product Company: ");
             productList.get(i).setProductCompany(sc.nextLine());
             System.out.println("Product updated successfully!");
             return;
         }
     }
     System.out.println("Product not found.");
 }

 // Method to delete stock
 public void deleteStock() {
     System.out.print("Enter Product ID to delete: ");
     String id = sc.nextLine();
     for (int i = 0; i < productList.size(); i++) {
         if (productList.get(i).getProductId().equals(id)) {
             productList.remove(i);
             System.out.println("Product deleted successfully!");
             return;
         }
     }
     System.out.println("Product not found.");
 }
}
