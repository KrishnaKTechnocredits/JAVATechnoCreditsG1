package amarja;
import java.util.Scanner;
/*4) WAP to find sum of user given number.
a. Input:- 159753
b. Sum of given number:- 30*/
  public class ArrayPrg4 {
	  public static void main(String args[])
	  {
		  Scanner sr=new Scanner(System.in);//
			ArrayPrg4 pr1=new ArrayPrg4();
			System.out.println("Enter the number:");//Read the number
			int no=sr.nextInt();
			System.out.println("Sum of given number:- "+pr1.findsumno(no));	
			sr.close();
	  }
	  int findsumno(int no)
	  {
		 int sum=0;
		 String s=no+"";
		 for(int index=0;index<s.length();index++)
		  {
			  sum=sum+(no%10);
			  no=no/10;			  		
		  }			 
			return sum;	  
	  }
	  }
