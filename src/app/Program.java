package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int aux = -1;
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		product.setName(sc.nextLine());
		System.out.println("Price: ");
		product.setPrice(Double.parseDouble(sc.nextLine()));
		System.out.println("Quantity in stock: ");
		product.setQuantity(Integer.parseInt(sc.nextLine()));
		
		
		while(aux != 0) {
			System.out.println("[1] Insert Product\n[2] Remove Product\n[3] Show Stock\n[0] Exit");
			aux = sc.nextInt();
			
			switch(aux) {
			case 1:
				System.out.println("Enter the number of products to be added in stock: ");
				int add = Integer.parseInt(sc.next());
				product.addProducts(add);
				break;
				
			case 2:
				System.out.println("Enter the number of products to be removed from stock: ");
				int remove = Integer.parseInt(sc.next());
				product.removeProducts(remove);
				break;
			case 3:
				System.out.println("Product data: " + product);
				break;
			case 0:
				aux = 0;
				break;
			default:
				System.out.println("Error.");
				break;
			}
		}
		
		
		sc.close();
	}

}
