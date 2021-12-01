package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Program {

	

//	private static double balance;

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 Locale.setDefault(Locale.US);
		 
		 	
		 double histDeposit = 0;
		 double histWithdraw = 0;
		 double withdraw = 0;
		 
		 
		 System.out.println("Enter an account number: ");
		 int accountNumber = sc.nextInt();
		 
		 System.out.println("Enter an account holder: ");		 
		 String holderName = sc.next();
		 
		 System.out.println("Enter initial balance: ");
		 double initialBalance = sc.nextDouble();
		 double balance = initialBalance;
	
		 
		 Account account2 = new Account(accountNumber, holderName, balance, histDeposit, histWithdraw, histWithdraw, histWithdraw, histWithdraw);		 
		 while (balance > 0.0) {
			 System.out.println("Enter a deposit value: "); 
			 double deposit = sc.nextDouble();
			 
			 
			 account2.setDeposit(balance += deposit);
			 account2.setBalance(balance);
			 account2.setHistDeposit(histDeposit += deposit);
			 System.out.printf("Updated data: %s Balance $ %.2f%n", account2.getHolderName(), account2.getBalance() );
			
				 while(true) {
					 System.out.println("Enter a withdraw value: ");
					 withdraw = sc.nextDouble();					 
					 if (account2.getBalance() < withdraw) {
						 System.out.printf("%nWithout funds Try again!%n");
					 }
					 else {
					 account2.setWithdraw(withdraw);
					 account2.setBalance(balance -= withdraw);					 
					 account2.setHistWithdraw(histWithdraw += withdraw);
					 System.out.printf("%nWitdraw success%n");
					 break;	
				 }						
			 }			 
			 
			 System.out.printf("Updated data: %s Balance $ %.2f%n", account2.getHolderName(), account2.getBalance() );			 
			
//			Account account = new Account(accountNumber, holderName, balance, deposit, withdraw, initialBalance,  histDeposit, histWithdraw);
			 Account account = new Account(accountNumber, holderName, initialBalance, balance, deposit, withdraw, histDeposit, histWithdraw);
			 System.out.printf("%nUpdated data: ");
			 System.out.printf("Historical %n"
			 		+ "Account %d%n"
			 		+ "Holder %s%n"
			 		+ "Initial Balance $ %.2f%n"
			 		+ "Balance $ %.2f%n"
			 		+ "Deposit $ %.2f%n"
			 		+ "Withdraw $ %.2f%n"
			 		+ "Hist Deposit $ %.2f%n"
			 		+ "Hist Withdraw $ %.2f%n%n",
			 		account.getAccountNumber(),
			 		account.getHolderName(), 
			 		account.getInitialBalance(),
			 		account.getBalance(), 
			 		account.getDeposit(),
			 		account.getWithdraw(),
			 		account.getHistDeposit(),
			 		account.getHistWithdraw());
	//		 System.out.println(account);
			 
		 }
	 
		 
		 
		 sc.close();
 }
}
		 




