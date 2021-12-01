package course;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter an ineger number: ");
		 int n = sc.nextInt();		 
		 if(n % 2 == 0) {
			 System.out.printf("par",n);
			 }
		 else{
			 System.out.printf("Impar!",n);
			 
		 }
		 sc.close();
		 

	}

}
