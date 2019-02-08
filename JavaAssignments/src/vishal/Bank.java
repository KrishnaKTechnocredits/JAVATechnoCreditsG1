package vishal;

import java.util.Scanner;

public class Bank {
	
	int accNo;
	String customerName="Press 1 and Enter your Details";
	double amount;
	Scanner sc=new Scanner(System.in);
	int TotalAmount=0;
	
	
	public void bankOperations(int userChoice)
	{
	
	switch(userChoice)
	{
	case 1:
		insertData();
	    break;
	case 2:
		deposite();
		break;
	case 3:
		withdraw();
		break;
	case 4:
		checkBalance();
		break;
	case 5:
		displayDetails();
		break;
		
	}
		
	}
		
		
	public void insertData()
	{
		
		System.out.println("Enter your account no. ");
		accNo=sc.nextInt();

		System.out.println("Enter your name ");
		customerName=sc.next();
		System.out.println("Enter Amount ");
		 amount=sc.nextDouble();
		
	}
	
	public void deposite()
	{
		System.out.println("Enter Amount: ");
		int depositedAmt=sc.nextInt();
		System.out.println("Your account is deposited with "+depositedAmt);
		TotalAmount=TotalAmount+depositedAmt;
		System.out.println("Your account bal is: "+TotalAmount);
	}
	public void withdraw()
	{
		System.out.println("Enter Amount: ");
		int creditedAmt=sc.nextInt();

		System.out.println("Your account is withdrawl with "+creditedAmt);
		TotalAmount=TotalAmount-creditedAmt;
		System.out.println("Your account bal is: "+TotalAmount);

	}
	public void checkBalance()
	{
	System.out.println("Your balance is "+TotalAmount);	
	}
	public void displayDetails()
	{
		System.out.println("Customer Name "+customerName);
		System.out.println("Customer Acc No. "+accNo);
		System.out.println("Balance "+TotalAmount);
	}

}
