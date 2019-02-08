package amarja;
import java.util.Scanner;
//Bank Client Class
public class BankClientClass {
	public static void main(String args[])
	{	
		System.out.println("*****Bank Function Menu*****");
		System.out.println("Insert Data for customer");
		Bank b =new Bank();
		b.insertData(b.name,b.account_no,b.amount);
		System.out.println("Enter '1'- Deposit");
		System.out.println("Enter '2'- Withdraw");
		System.out.println("Enter '3'- Checkbalance");
		System.out.println("Enter '4'- Displaydetails");
		System.out.println("Enter '5'- Exit");
		Scanner src=new Scanner(System.in);
		int menu=src.nextInt();
			switch (menu)
			{
			case 1:
					Bank br =new Bank(0.0);
					br.deposit(br.depa,b.amount);
					break;
			case 2:
					Bank br1 =new Bank(0.0);
					br1.withdraw(br1.depa,b.amount);
					break;
			case 3:
					b.checkbalance(b.amount);
					break;
			case 4:
					b.displayDetails(b.name,b.account_no,b.amount);
					break;
			default:
					System.out.println("Error !! No such menu exists");
		}	
	}
	}


