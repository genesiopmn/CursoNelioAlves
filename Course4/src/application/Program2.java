package application;

public class Program2 {

	public static void main(String[] args) {
		 String[] vect = new String[] {"Maria", "Bob", "Alex"};
		 
		 for (int i=0; i < vect.length; i++) { // Laço For
			 System.out.println(vect[i]);
		 }
		 
		 System.out.println("-------------------");
		 
		 for (String obj : vect) { // Laço Foreach
			 System.out.println(obj);
		 }

	}

}
