package application;

public class Program2 {

	public static void main(String[] args) {
		 String[] vect = new String[] {"Maria", "Bob", "Alex"};
		 
		 for (int i=0; i < vect.length; i++) { // La�o For
			 System.out.println(vect[i]);
		 }
		 
		 System.out.println("-------------------");
		 
		 for (String obj : vect) { // La�o Foreach
			 System.out.println(obj);
		 }

	}

}
