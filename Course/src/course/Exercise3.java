package course;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter 3 integer with space between numbers (same line)");
		 
		 int x = sc.nextInt();		 
		 int y = sc.nextInt();		 
		 int z = sc.nextInt();
		 
		 if (x >= y && x >= z) {
			 System.out.println("Higher: "+ x);	 
		 }
		 else if(y >= x && y >= z) {
			 System.out.println("Higher: "+ y);	 
		 }
		 else if(z >= y && z >= x) {
			 System.out.println("Higher: "+ z);	 
		 }
		 sc.close();

	}
}
