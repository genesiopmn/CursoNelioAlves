package application;

import java.util.Scanner;

import entities.Calculator;

public class Program {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Calculator calc = new Calculator();
				 
		 System.out.println("Insert a float number: ");
		 calc.n1 = sc.nextDouble();
		 
		 System.out.println("Insert an operator: ");
		 calc.operator = sc.next().charAt(0);
		 
		 System.out.println("Insert another float number: ");
		 calc.n2 = sc.nextDouble();
		 
		 System.out.println(calc.resultado());
		 
		 sc.close();

	}

}
