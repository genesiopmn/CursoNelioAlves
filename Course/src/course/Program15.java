package course;

public class Program15 {

	public static void main(String[] args) {
		 double preco = 34.5;
		 double desconto;
		 double descontot = (preco < 20.0) ? preco * 0.1: preco * 0.05; //Express�o condicional tern�ria
		 if (preco < 20.0) {
			 desconto = preco * 0.1;
		 }
		 else {
			 desconto = preco * 0.05;
		 }
		 System.out.println(desconto);
		 System.out.println(descontot);
		 
		 

	}

}
