package apiPractice14;

public class BankAccount {
	
	String accountNumber;
	int balance;
	
	public String toString() {
		return "\\" + balance + "(口座番号: " + this.accountNumber + ")" ;
	}
	
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if( o instanceof BankAccount) {
			BankAccount a = (BankAccount) o;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if(an1.equals(an2)) {
				return true;
			}
		}
		
		return false;
	}

}
