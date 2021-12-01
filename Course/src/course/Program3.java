package course;

import java.util.Locale;

public class Program3 {

	public static void main(String[] args) {
		
		char gender = 'F';
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";
		
		System.out.print("Hello");
		System.out.printf("Good Morning%n");
		System.out.println("Good afternoon!"); // println ln = line next quebra de linha
		System.out.println("Good Night!");
		System.out.println("---------------------");
		System.out.printf("%.2f%n", balance);
		Locale.setDefault(Locale.US); // formatação separação float padrão americano
		System.out.printf("%.4f%n", balance); //printf imprime formatado %.2 casas decimais %n quebra de linha
		System.out.println("---------------------");
		System.out.printf("%s is %d years old, gender %c, and got balance = %.5f bitcoins%n", name, age, gender, balance);
		
		

	}

}
