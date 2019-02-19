package amarja;
import java.util.Scanner;
/*WAP to find vowels in given string
a. Input :- automation engineering
b. Count :- 11
 */
public class ArrayPrg8 {
	int count=0;
	public static void main(String args[])
	{
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter string");
		String input=sr.nextLine();
		ArrayPrg8 pr1=new ArrayPrg8();
		System.out.println("Vowel Count = "+pr1.findvowelcount(input));
		sr.close();
	}
	 int findvowelcount(String input) {
		 int index=0;
		 while (index<input.length())
		 {
			switch(input.charAt(index))
				{
				case 'a':
					count++;
					break;
				case'e':
					count++;
					break;
				case'o':
					count++;
					break;
				case'i':
					count++;
					break;
				case'u':
					count++;
					break;
				case 'A':
					count++;
					break;
				case'E':
					count++;
					break;
				case'O':
					count++;
					break;
				case'I':
					count++;
					break;
				case'U':
					count++;
					break;
				default :break;				
				}
			index++;
		 }
		 return count;
		 }	 
	}


