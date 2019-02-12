package amarja;
/***12)WAP to find word is palindrome or not ?
a. String name = “naman”
i. Naman is palindrome
b. String name = “harsh”i. Harsh is not palindrome
 */
import java.util.Scanner;
public class ArrayPrg12 {
	public static void main(String args[])
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter String");//Step 1:Method to read the integer array
		String input =sr.nextLine();
		sr.close();
		ArrayPrg6 pr2=new ArrayPrg6();
		String revstring=pr2.reversestring(input);
		if(input.equalsIgnoreCase(revstring))//Comparing the values of the string and reverse string
			System.out.println("String "+input+" is palindrome");
		else
			System.out.println("String "+input+" is not a palindrome");
	}

}
