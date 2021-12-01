
public class Diretor extends Funcionarios {
	
	public Diretor(String ctps){
		super(ctps, 3000);
		
	}
	
	public void AprovarConrato(){			
		System.out.println("Contrato Aprovado");
	}
	
	public void AumentarSalario() {
		Salario += Salario * 0.15;
//		super.AumentarSalario(aumento);
	}


}
