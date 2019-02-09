package amarja;
/*Create Bank class with fields account_no, name and amount .Create the following methods: Make
it menu Driven Program using switch.
Use Scanner class for taking inputs from User
a) insertData()… [To save account_no, name and amount given by user].
b) deposit()
c) withdraw()
d) checkBalance()
e) displayDetails()
Create BankClient class to test functionalities of Bank class*/
import java.util.Scanner;
public class Bank {
	int account_no;String name;double amount;
	double depa;double wamount;static double bal;
	//Constructor to initialize variables
	Bank()
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter name of user:");
		name=sr.next();
		System.out.println("Enter account number of user:");
		account_no=sr.nextInt();
		System.out.println("Enter amount of user:");
		amount=sr.nextDouble();	
		//sr.close();
		}
	Bank(double dep)
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter amount to be deposited/withdrawn:");
		depa=sr.nextDouble();
		//sr.close();
	}
	Bank(String name,int account_no,double amount)
	{
		displayDetails(name,account_no,bal);
	}
	void insertData(String name,int account_no,double amount)
	{
		System.out.println("Name saved = "+name);
		System.out.println("Account no saved = "+account_no);
		System.out.println("Amount saved = "+amount);
		this.amount=amount;
		this.bal=amount;
	}
	void deposit(double depa,double amount)
	{
		this.bal=this.bal+depa;
		System.out.println("Total Balance= "+this.bal);
	}
	void withdraw(double depa,double bal)
	{	
		this.bal=this.bal-depa;
		System.out.println("Total Balance= "+this.bal);
		
	}
	void checkbalance(double amount)
	{	
		System.out.println("Available balance="+this.bal);
	}
	void displayDetails(String name,int account_no,double amount)
	{
		System.out.println("Details of Customer:");
		System.out.println("Name="+ name);
		System.out.println("Account no="+ account_no);
		System.out.println("Available Balane="+ this.bal);
	}
	}

