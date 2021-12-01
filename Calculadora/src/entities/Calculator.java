package entities;

public class Calculator {
	public double n1;
	public double n2;
	public double result;
	public char operator;
	

	public double soma() {
		return n1 + n2;
	}
	
	public double subtracao() {
		return n1 - n2;
	}
	
	public double multiplicacao() {
		return n1 * n2;
	}
	
	public double divisao() {
		return n1 / n2;
	}
	
	public double resultado() {
		if (operator == '+' ){
			result = soma();
		}
		else if(operator == '-' ){
			result = subtracao();
		}
		else if(operator == '*') {
			result = multiplicacao();
		}
		else if(operator == '/') {
			result = divisao();
		}
		return result;
		
		
	}
}
