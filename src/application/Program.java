package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product1;

        System.out.println("Enter the product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity: ");
        int quantity = sc.nextInt();
        product1 = new Product( name, price, quantity);
        System.out.println();
        System.out.println(" Product data: " + product1);

        System.out.print("Enter the number of products to be added in stock: ");
        product1.addProduct(sc.nextInt());
        System.out.println("Updated data: " + product1);

        System.out.print("Enter the number of products to be removed from stock: ");
        product1.removeProduct(sc.nextInt());
        System.out.println("Updated data: " + product1);

        sc.close();
    }
}
