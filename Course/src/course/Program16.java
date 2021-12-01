package course;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		System.out.println("Enter three numbers");
		Scanner sc = new Scanner(System.in);		 
		 		
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 
		 int higher = max(a, b, c);
		 
		 showResult(higher);
		 
		 sc.close();

	}
	
	public static int max(int x, int y, int z) {
		int aux = 0;
		if (x >= y && x >= z) {
			 aux = x;
		 }
		 else if(y >= x && y >= z) {
			 aux = y;	 
		 }
		 else if(z >= y && z >= x) {
			 aux = z;	 
		 }
		return aux;
	}
	
	public static void showResult(int val) {
		System.out.println("Higher = " + val);
	}
	
}


