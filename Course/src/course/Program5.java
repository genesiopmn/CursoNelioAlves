package course;

public class Program5 {

	public static void main(String[] args) {
		
		double n1 = 10;
		double n2 = 30;
		String s = "ABC";
		
		int a = 10; // a RECEBE 10
		int b = a++;// b RECEBE a(10) e "a" INCREMENTA a+1(11)
		
		int c = 10; // c RECEBE 10
		int e = ++c; // primeiro c(10) INCREMENTA c+1(11), depois "e" RECEBE c INCREMENTADO c(11)
		

		
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		
		System.out.println("--------------------");
		
		n1 *= 2; // 20
		n2 += n1; // 30 + 20 = 50
		s += "DEF";
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(s);
		System.out.println("--------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println("--------------------");
		System.out.println(c);
		System.out.println(e);
		
		

	}

}
