package course;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Insira a senha: ");
		 int senha = 2002;
		 int pass = sc.nextInt();
		 
		 while(!(pass == senha)) {
			 System.out.println("Senha inválida");
			 System.out.println("Insira a senha: ");
			 pass = sc.nextInt();
			 
		 }
		 System.out.println("Acesso Permitido");
		 
		 sc.close();
		 

	}

}
