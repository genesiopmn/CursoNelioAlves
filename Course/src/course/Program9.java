package course;

public class Program9 {

	public static void main(String[] args) {
		boolean c1 = 2 > 3 || 4 != 5; // true
		boolean c2 = !(2 > 3) && 4 != 5; // true
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("-------------------");
		
		boolean c3 = 10 < 5; // false
		boolean c4 = c1 || c2 && c3; //  operador && precede o perador ||
		System.out.println(c3); 
		System.out.println(c4); 
		boolean c5 = (c2 && c3); // true E false == false
		System.out.println(c5);
		boolean c6 = (c2 || c3); // true ou false == true
		System.out.println(c6);
		
		
		

	}

}
