package application;


import java.util.Scanner;


public class teste {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("insira o numero de casas");
		int n = sc.nextInt();
		
		double resultado = 0.0;
		double[] list = null;
		double[] list1 = null;
		double sum1 = 0.0;
		double sum2 = 0.0;
		char operador;
			System.out.println("Insira primeiros numeros: ");
			for(int i=0; i<n; i++) {
				list = new double[n];
				list[i] = sc.nextDouble();
				sum1 += list[i];
			}			
			System.out.println("Qual opera��o: ");
			operador = sc.next().charAt(0);				
				
			System.out.println("Insira segundos numeros: ");
			for(int j=0; j<n; j++) {
				list1 = new double[n];
				list1[j] = sc.nextDouble();
				sum2 += list1[j];
			}
			sc.close();
			if(operador == '+') {
				resultado = sum1 + sum2;
			}
			else if(operador == '-') {
				resultado = sum1 - sum2;
				}
			else if(operador == '*') {
				resultado = sum1 * sum2;
				}
			else if(operador == '/') {
				resultado = sum1 / sum2;
				}
		
			System.out.println("resultado: " +resultado);
			
		}
			
	}





		
	