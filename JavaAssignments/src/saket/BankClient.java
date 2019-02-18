package saket;

import java.util.Scanner;

public class BankClient extends Bank

{
	public static void main(String[] args) {

		Scanner sc3 = new Scanner(System.in);

		System.out.println("Welcome to ABC Bank Please Enter approporate transaction");
		System.out.println(
				"Press 1 for your personal details  Press 2 for deposit transaction Press 3 for withdrawl transaction Press 4 for check balance press 5 for display your banking details");

		int bankoperation = sc3.nextInt();

		Transactions(bankoperation);
	}

	static void Transactions(int bankoperation) {

		switch (bankoperation) {

		case (1):

			takeuserinput();
		    break;

		case (2):

			deposit();
		     break; 
		case (3):
			withdrawl();
		  break; 

		case (4):
			balance();
		 break;

		case (5):
		System.out.println("Hope you like banking with us");
		 break;

		}

}}
