package drill07;

public class Drill0712 {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount(500000.00);
		
		bankAccount.deposit(50000);
		System.out.println(bankAccount.getBalance());
		
		bankAccount.withdraw(600000);
		System.out.println(bankAccount.getBalance());
	}
}

class BankAccount{
	
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double money) {
		this.balance += money;
	}
	
	public void withdraw(double money) {
		if(balance > money) {
			balance -= money;
		}else {
			System.out.println("残高不足です");
		}
	}
}
