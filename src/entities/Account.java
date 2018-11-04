package entities;

public class Account {
	
	private static double FEE = 5.00;
	
	private int number;
	private String holder;
	private double balance;	

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;

	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);

	}

	public int getNumber() {
		return number;

	}

	public String getHolder() {
		return holder;

	}

	public void setHolder(String holder) {
		this.holder = holder;

	}

	public double getBalance() {
		return balance;

	}

	public void deposit(double amount) {
		balance += amount;

	}	

	public void withdraw(double amount) {
		balance -= amount + FEE;

	}	
	
	public void investing(int time, double fee, double amount) {
		
		double initial = amount;
		
		for(int i = 1; i <= time; i++) {
			
			amount += (amount * fee);
		}
		showResult(initial, amount);
		
	}
		
	private void showResult(double initial, double amount) {
		System.out.printf("The result of the investment is: $  %.2f%n of the initial value: $  %.2f%n", amount, initial);
		
	}
	
	public String toString() {
		return "Account "
				+ number
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}

	

}