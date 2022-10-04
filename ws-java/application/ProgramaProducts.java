package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaProducts {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product Data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in Stock: ");
        product.quantity = sc.nextInt();

        System.out.print("Produc data: " + product);

        // UPDATE
        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");

        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Update data: " + product);

        // EXIT
        System.out.println();
        System.out.print("Enter the number of products to be remove from stock: ");

        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Update data: " + product);

        sc.close();
    }

}
