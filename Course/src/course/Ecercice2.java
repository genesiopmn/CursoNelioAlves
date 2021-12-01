package course;

import java.util.Locale;
import java.util.Scanner;

public class Ecercice2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		System.out.println("Enter your full name:");		
		String q1 = sc.nextLine();		
		System.out.println("How mane bedrooms are there in your house?");
		int q2 = sc.nextInt();		
		System.out.println("Enter product price");		
		double q3 = sc.nextDouble();
		System.out.println("Enter your las name, age and height (same line)");
		//sc.nextLine();
		String q4 = sc.next();
		int q5 = sc.nextInt();
		double q6 = sc.nextDouble();
		System.out.println(q1);
		System.out.println(q2);
		System.out.printf("%.2f",q3);
		System.out.println();
		System.out.println(q4);
		System.out.println(q5);
		System.out.printf("%.2f",q6);		
		
		
		sc.close();

	}

}
