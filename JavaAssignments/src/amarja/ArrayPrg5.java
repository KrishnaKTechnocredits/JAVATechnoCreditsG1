package amarja;
import java.util.Scanner;
/*WAP to reveres user given number
a. Input number:- 456789
b. Output number :- 987654
 */
public class ArrayPrg5 {
	 public static void main(String args[])
	  {
		  Scanner sr=new Scanner(System.in);//
			ArrayPrg5 pr1=new ArrayPrg5();
			System.out.println("Enter the number:");//Read the number
			int no=sr.nextInt();
			int output[]=pr1.findrevno(no);
			System.out.print("Reverse of given number:- ");
			for (int index=0;index<output.length;index++)
				System.out.print(output[index]);
			sr.close();
	  }
	  int[] findrevno(int no)
	  {
		 int revno=0;
		 String s=no+"";
		 int output[]=new int[s.length()];
		 for(int index=0;index<s.length();index++)
		  {
			  revno=no%10;
			 output[index]=revno;
			  no=no/10;			  		
		  }			 
			return output;  
	  }
	  }

