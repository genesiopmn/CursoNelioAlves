import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {

		
		var enc = new Encanador("123"); 
//		System.out.println(enc.CTPS);
		
		var dir = new Diretor("456");
//		System.out.println(dir.CTPS);
		
		enc.caixaDeFerramentas.add("grifo");		
		enc.caixaDeFerramentas.add("chave de boca");
		
//		System.out.println(enc.caixaDeFerramentas);
		
		enc.AumentarSalario();
		dir.AumentarSalario();
		
		System.out.println(enc.Salario);
		System.out.println(dir.Salario);
		
		
		
		
//		var f1 = new Funcionarios();
//		f1.CTPS = "123";
//		System.out.println(f1.CTPS);
//		
//		var d1 = new Diretor();
//		d1.CTPS = "456";		
//		// Método exclusivo do diretor
//		d1.AprovarConrato();
//		System.out.println(d1.CTPS);	
		
//		implementado método construtor na classe encanador
//		não necessario instanciar no main.
//		enc.caixaDeFerramentas = new ArrayList<String>();		
	
//		f1.Salario = 100;
//		var f2 = new Funcionarios();
//		f2.Salario = 200;
		
		//f2 = f1;		
//		f2.Salario = 200;
//		
//		System.out.println(f1.Salario);
//		System.out.println(f2.Salario);	
		
//		System.out.println(f1 == f2);
		


	}

}
