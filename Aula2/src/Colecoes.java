import java.util.ArrayList;
import java.util.LinkedList;

public class Colecoes {

	public static void main(String[] args) {
		// bom prar intera��es, e acesso dos dados e consulta.
		// n�o adeuado para altera��es da estrutura, como dele��o de elementos
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("joao");
		lista.add("jose");
		lista.add("maria");
		
		for(String nome : lista) {
			//System.out.println(nome);		
		}
		System.out.println(lista);
		
		// bom para altera��es dos elementos
		// n�o adequado para consultas e obbten��o de elementos por indice.
		
		//var nome2 = new LinkedList<String>();
		//LinkedList<String> lista2 = new LinkedList<Sring>();
		var lista2 = new LinkedList<String>();
		lista2.add("Maria");
		lista2.add("Jos�");
		lista2.add("Jo�o");
		
		for(String nome2 : lista2) {
			//System.out.println(nome2);			
		}		
		System.out.println(lista2);

	}

}
