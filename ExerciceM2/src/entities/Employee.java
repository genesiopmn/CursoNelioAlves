package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreasSalary(double percentage) {
		grossSalary += grossSalary * (percentage / 100);
		
	}
	public String toString() {
		return 	name
				+ String.format("%nGross Salary: $%.2f%n", grossSalary)
				+ String.format("Net Salary: $%.2f%n", NetSalary());
	}	

}
