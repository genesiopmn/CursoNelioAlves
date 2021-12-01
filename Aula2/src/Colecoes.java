import java.util.ArrayList;
import java.util.LinkedList;

public class Colecoes {

	public static void main(String[] args) {
		// bom prar interações, e acesso dos dados e consulta.
		// não adeuado para alterações da estrutura, como deleção de elementos
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("joao");
		lista.add("jose");
		lista.add("maria");
		
		for(String nome : lista) {
			//System.out.println(nome);		
		}
		System.out.println(lista);
		
		// bom para alterações dos elementos
		// não adequado para consultas e obbtenção de elementos por indice.
		
		//var nome2 = new LinkedList<String>();
		//LinkedList<String> lista2 = new LinkedList<Sring>();
		var lista2 = new LinkedList<String>();
		lista2.add("Maria");
		lista2.add("José");
		lista2.add("João");
		
		for(String nome2 : lista2) {
			//System.out.println(nome2);			
		}		
		System.out.println(lista2);

	}

}
