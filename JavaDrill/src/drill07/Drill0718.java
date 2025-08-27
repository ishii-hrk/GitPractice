package drill07;

import java.util.ArrayList;
import java.util.List;

public class Drill0718 {
	public static void main(String[] args) {
		Account account1 = new Account(0123456,"hiroki",500000);
		Account account2 = new Account(7890123,"yuka",500000);
		
		Bank myBank = new Bank();
		
		myBank.addAccount(account1);
		myBank.addAccount(account2);
		
		Account account3 = new Account(4567890,"hiroki",200000);
		myBank.addAccount(account3);
		
		myBank.displayTotalBalance();
	}
}

class Bank{
	
	private List<Account> accounts = new ArrayList<>();
	
	public void addAccount(Account account) {
		if(!accounts.contains(account.getAccountOwner())) {
			accounts.add(account);
			System.out.println(
					account.getAccountOwner() 
					+ "様の口座を登録しました");
		}else {
			System.out.println("すでに登録されています");
		}
	}
	
	public void displayTotalBalance() {
		double totalBalance = 0;
		if(accounts.isEmpty()) {
			System.out.println("口座がありません");
		}else {
			for(Account a : accounts) {
				totalBalance += a.getBalance();
			}
		}
		
		System.out.println("$" + totalBalance);
	}
}

class Account{
	
	private int accountNumber;
	private String accountOwner;
	private double balance;
	
	public Account(int accountNumber, 
					String accountOwner, 
					double balance) {
		this.accountNumber = accountNumber;
		this.accountOwner = accountOwner;
		this.balance = balance;
	}
	
	public String getAccountOwner() {
		return accountOwner;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void displayAccountInfo() {
		System.out.println("AccountNumber:" + accountNumber);
		System.out.println("AccountOwner:" + accountOwner);
		System.out.println("Balance:" + balance);
	}
}