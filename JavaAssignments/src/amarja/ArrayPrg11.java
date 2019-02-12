package amarja;
import java.util.Scanner;
/*WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from forward and
backward
i.e. actual number :- 12321
//Step 1 - Input the number from user
 *Step 2- Call the find rev no function to get the reverse of number.Reverse number is stored in array
 *Step 3- Convert the rev number stored in array in to a string
 *Step 4- Compare the no and integer value of string rev number if its same its a palindrome else not a palindrome

 *  */
public class ArrayPrg11 {
	public static void main(String args[])
	  {
			String revno="";
			Scanner sr=new Scanner(System.in);//
			ArrayPrg5 pr1=new ArrayPrg5();
			System.out.println("Enter the number:");//Read the number
			int no=sr.nextInt();
			int output[]=pr1.findrevno(no);
			for(int index=0;index<output.length;index++)//Storing the reversed number in arrray in to a string
				revno= revno+String.valueOf(output[index]);
			if((no)==Integer.parseInt(revno))//Comparing the values of the no and rev no
				System.out.println("Number "+no+"is palindrome");
			else
				System.out.println("Number "+no+"is not a palindrome");
			sr.close();
	  }

}
