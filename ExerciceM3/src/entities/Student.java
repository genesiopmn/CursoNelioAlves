package entities;

public class Student {
	public String name;
	public String resultado;
	public double n1;
	public double n2;
	public double n3;
	public double percentagem = 60;
	
	
	public double Notas() {		
		double notaFinal = n1 + n2 + n3;			
		return notaFinal;
	}
		
	public String FinalGrade() {
		if ( Notas() < percentagem) {
			resultado = "FAILED";
		}
		else {
			resultado = "PASS";
		}
		return resultado;
	}
	
	public double missingNote() {
		return percentagem - Notas();
		
	}
		
	
	public String toString() {			
			if(FinalGrade() == "FAILED") {	
			return 
			name
			+ String.format("%nFINAL GRADE: %.2f", Notas())
			+ String.format("%n%s", FinalGrade())
			+ String.format("%nMISSING: %.2f POINTS", missingNote());
			}
			else {
				return
				name
				+ String.format("%nFINAL GRADE: %.2f", Notas())
				+ String.format("%n%s", FinalGrade());
			}
	}
					
		
}	

