package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert number of products");
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println("Insert name product");
			String name = sc.nextLine();
			System.out.print("Insert price to: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
			
		}
		
		double avg = sum / vect.length;
		System.out.printf("Avarage price: %.2f", avg);
				
		
		sc.close();

	}

}
