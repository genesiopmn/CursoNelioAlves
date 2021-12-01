package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class CurrencyProgram {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Locale.setDefault(Locale.ROOT);
		 
		 CurrencyConverter calc = new CurrencyConverter();
		 System.out.println("Quanto está a cotação do dollar?:");
		 calc.dollarvalue = sc.nextDouble();
		 
		 System.out.println("Quantos dolares você quer comprar?");
		 calc.quantity = sc.nextDouble();
		 System.out.printf("Valor em real: R$%.2f%n", calc.dollarconvert());
		 System.out.printf("Valor em real + IOF: R$%.2f%n", calc.dollarconvert() + calc.ioftax());
		 System.out.printf("Taxa IOF: R$%.2f%n", calc.ioftax());
		 
		 System.out.printf("RealValue: R$%.2f ",calc.realvalue());
		 
		 
		 
		 
		 sc.close();
	}

}
