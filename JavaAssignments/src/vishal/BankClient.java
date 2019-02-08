package vishal;

import java.util.Scanner;

public class BankClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank bank=new Bank();
		System.out.println("Enter Your Choice:\n1 for Entering Personal Details\n2 for Deposite\n3 for Withdrawl\n4 for Check Balance\n5 for View Your Profile");
        int choice=sc.nextInt();
        if(choice<=5&&choice>0)
        {
        	bank.bankOperations(choice);
        }
        else
        {
        	System.out.println("Your choice should be between 1 to 5");
        }
	}

}
