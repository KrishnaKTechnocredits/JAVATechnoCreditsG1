package saket;

import java.util.Scanner;

public class Bank {

	static int takeuserinput() {

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		System.out.println("Please Enter the Account number");
		int Account_num = sc.nextInt();

		System.out.println("Please Enter the Account holder name");

		String name = sc1.nextLine();

		System.out.println("Please Enter the amount");
		int amount = sc2.nextInt();

		return amount;

	}

	static int deposit()

	{

		Scanner sc4 = new Scanner(System.in);
		System.out.println("Please Enter the amount you want to deposit");
		int deposit = sc4.nextInt();
		System.out.println("deposit amount:" + deposit);

		return deposit;
	}

	static int withdrawl() {
		Scanner sc5 = new Scanner(System.in);
		System.out.println("Please Enter the amount you want to withdraw");
		int withdraw = sc5.nextInt();
		System.out.println("withdraw amount:" + withdraw);

		return withdraw;

	}

	static int balance() {
		int amount = takeuserinput();
		int withdrawlamount = withdrawl();
		int deposit = deposit();
		int balance = amount + deposit - withdrawlamount;
		System.out.println("balance amount:" + balance);
     return balance;
		
     

   
		
	}

}
