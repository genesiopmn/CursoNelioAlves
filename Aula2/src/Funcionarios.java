
//classe abstrata, n�o pode ser instanciada, apenas herdada.
public abstract class Funcionarios {
	public Funcionarios(String ctps, double salario) {
		CTPS = ctps;
		Salario = salario;
		
	}	
	public double Salario;
	public String CTPS;
	public abstract void AumentarSalario(); 
//	{
//		
//	public void AumentarSalario(double aumento) {
//		Salario += aumento;
//	};

}
