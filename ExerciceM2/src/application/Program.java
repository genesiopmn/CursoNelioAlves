package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		
		System.out.println();
		System.out.println("Employee data: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");		
		employee.IncreasSalary(sc.nextDouble());
		System.out.println();
		System.out.println("Updated data: " + employee);
//		System.out.print("Updated data: " + employee.name + ", " + " $"  + employee.grossSalary);
		sc.close();

	}

}