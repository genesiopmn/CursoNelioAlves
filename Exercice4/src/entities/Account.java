package entities;

public class Account {

	private int accountNumber;
	private String holderName;
	private double balance;
	private double deposit;
	private double withdraw;
	private double initialBalance;
	private double histDeposit;
	private double histWithdraw;
	
	public Account(int accountNumber, String holderName, double initialBalance, double balance, double deposit, double withdraw,
			 double histDeposit, double histWithdraw) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.initialBalance = initialBalance;
		this.balance = balance;
		this.deposit = deposit;
		this.withdraw = withdraw;		
		this.histDeposit = histDeposit;
		this.histWithdraw = histWithdraw;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}

	public double getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}

	public double getHistDeposit() {
		return histDeposit;
	}

	public void setHistDeposit(double histDeposit) {
		this.histDeposit = histDeposit;
	}

	public double getHistWithdraw() {
		return histWithdraw;
	}

	public void setHistWithdraw(double histWithdraw) {
		this.histWithdraw = histWithdraw;
	}

	
		
}
