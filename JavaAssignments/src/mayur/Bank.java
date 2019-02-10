package mayur;

public class Bank {
	private static long account_no;
	private static String name;
	private static long amount;

	void insertData(long account_no, String name, long amount) {
		Bank.account_no = account_no;
		Bank.name = name;
		Bank.amount = amount;
	}

	void deposit(long amount) {
		Bank.amount = +amount;
	}

	void withdraw(long amount) {
		Bank.amount = -amount;
	}

	void checkBalance() {
		System.out.println("Balance in your account is" + amount);
	}

	void displayDetails() {
		System.out.println("Account holder's Name:" + name);
		System.out.println("Account Number:" + account_no);
	}
}
