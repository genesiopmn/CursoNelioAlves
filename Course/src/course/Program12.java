package course;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("What time is it?");
		 int time = sc.nextInt();
		 if (time < 12 || time > 23) {
			 System.out.println("Good Morning!");			 
		 }else if(time < 18){
			 System.out.println("Good Afternoon!");			 
		 }else {
			 System.out.println("Good Evening!");
		 }
		 
		 sc.close();

	}

}
