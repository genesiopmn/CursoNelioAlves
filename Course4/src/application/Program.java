package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Insert n value");
//		int n = sc.nextInt();
//		double[] vect = new double[n];
//		
//		for (int i=0; i<n; i++) {
//					
//			vect[i] = sc.nextDouble();
//		}
		
		double sum = 0.0;
		System.out.println("Insert n value");
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i =0; i<n; i++) {
			System.out.println("Insert heiht on position: "+i);	
			vect[i] = sc.nextDouble();			
			sum += vect[i];			
		}
		double avg = sum / n;
		System.out.printf("AVARAGE HEIGHT: %.2f", avg);		
		
		sc.close();
		

	}

}
