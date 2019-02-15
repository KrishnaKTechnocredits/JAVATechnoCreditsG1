/*-----------------------------------------------------------------------
Assignment: WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from forward and
backward
i.e. actual number :- 12321
-------------------------------------------------------------------------*/

package shraddha;

import java.util.Scanner;

public class PalindromeNumberString {
	
	String reverseString(String s)
	{
		String reverse = "";
		s = s.toLowerCase();
		for(int index = s.length()-1; index>= 0; index--)
		{
			reverse = reverse + s.charAt(index);
		}
		return reverse;
	}
	
	int reverseNumber(int num)
	{
		int reverse = 0, mod =0;
		while(num >0)
		{
			mod = num%10;
			reverse = reverse*10;
			reverse = reverse+mod;
			num = num /10;
		}
		return reverse;
	}
	
	void string_Palindrome(String s)
	{
		s = s.toLowerCase();
		if(s.equals(reverseString(s)))
		{
			System.out.println(s+" String is palindrome..!!");
		}
		else
		{
			System.out.println(s+" String isnt a Palindrome.. :(");
		}
	}
	
	void Number_Palindrome(int num)
	{
		if(num == reverseNumber(num))
		{
			System.out.println(num+" Number is palindrome..!!");
		}
		else
		{
			System.out.println(num+" Number isnt a Palindrome.. :(");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to be checked as palindrome or no:= ");
		int number = sc.nextInt();
		System.out.println("Enter String to be checked as palindrome or no:= ");
		String s = sc.next();
		
		PalindromeNumberString p = new PalindromeNumberString();
		p.string_Palindrome(s);
		p.Number_Palindrome(number);

	}

}
