import java.util.ArrayList;

public class Encanador extends Funcionarios {
	public ArrayList<String> caixaDeFerramentas;
	
	public Encanador(String ctps){
		super(ctps, 1000);		
		
		caixaDeFerramentas = new ArrayList<String>();		
	}
	
	public void AumentarSalario() {
		Salario +=  Salario *0.1;
		
	}
//	public void AumentarSalario() {
//		var aumento =  Salario *0.1;
//		super.AumentarSalario(aumento);
//	}

}
