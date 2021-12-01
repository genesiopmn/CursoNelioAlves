/* 
	O código inicia com counter == 0.
	Quando i == 1 e k == 1, i % k == 0. Logo, counter++ (counter == 1).
	k é incrementado, e sai do for.
	Quando i == 2 e k == 1, i % k == 0. Logo, counter++ (counter == 2).
	Quando i == 2 e k == 2, i % k == 0. Logo, counter++ (counter == 3).
	k é incrementado, e sai do for.
	Repare que counter > 2 (counter == 3). Por indução, nunca será impresso a mensagem, uma vez que counter irá apenas crescer e já ultrapassou o valor esperado para impressão da mensagem.
	
	Reiniciando o valor de counter em cada iteração em i resolve o problema:
*/
package course;

import java.util.Scanner;

public class Exercice6{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert a integer number: ");
    	int x = sc.nextInt();
    	int i;
        int k;
        sc.close();
        for(i = 1; i <= x; i++){
        	
            int counter = 0;
            for(k = 1; k <= i; k++){
                if( (i % k) == 0)
                    ++counter;  
            }
            if( counter == 2 )
                System.out.println("The number: " + i + " is prime");
            }
               
        
        
    }
}