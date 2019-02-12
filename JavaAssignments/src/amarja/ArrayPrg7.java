package amarja;
/*WAP to find Factorial  for user defined number
a. Input number :- 5
b. Output :- 120
 *  */
import java.util.Scanner;
public class ArrayPrg7 {
	public static void main(String args[])
	{
	Scanner sr=new Scanner(System.in);//
	ArrayPrg7 pr1=new ArrayPrg7();
	System.out.println("Enter the number:");//Read the number
	int no=sr.nextInt();
	System.out.println("Factorial of number="+pr1.findfactorial(no));
	sr.close();
	}
	int findfactorial(int no)
	{	int factorial=1;
	 	
		 while(no!=0)
		 {
			 factorial=factorial*no;//Factorial is calculated as 5*4*3*2*1
			 no--;
		 }
		return factorial;		
	}
}
