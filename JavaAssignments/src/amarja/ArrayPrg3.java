package amarja;
import java.util.Scanner;
/*WAP to find frequency of user defined character in user defined String
a. i.e. User String :- “electrical engineering”
b. char value :- e
c. count of e :- 5 */
public class ArrayPrg3 {
	public static void main(String args[])
	{
		Scanner sr=new Scanner(System.in);//
		ArrayPrg3 pr1=new ArrayPrg3();
		System.out.println("Enter the user defined String:");//Read the string
		String input=sr.nextLine();
		System.out.println("Enter the user defined character:");//Read the character
		char ch=sr.nextLine().charAt(0);
		sr.close();
		System.out.println("char value :- "+ch);//printing the output
		if (pr1.Countofchar(input,ch)==0)
				System.out.println("Character not found in string");
		else
		System.out.println("Count of "+ch+":- "+pr1.Countofchar(input,ch));
	}
	int Countofchar(String input,char ch)//Method to find count of character using ==
	{ int count=0;
		for (int index=0;index<input.length();index++)
		{
		if (ch == input.charAt(index))
			count++;			
		}
		return count;
	}
}
