
public class CheckingAccount extends Exception{

	private double balance;
	private int accountNum;
	
	public CheckingAccount(double balance, int accountNum) {
		this.balance = balance;
		this.accountNum = accountNum;
		// TODO Auto-generated constructor stub
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException{
		if (amount > balance) throw new InsufficientFundsException(amount);
		this.balance -= amount;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getNumber() {
		return this.accountNum;
	}
}
