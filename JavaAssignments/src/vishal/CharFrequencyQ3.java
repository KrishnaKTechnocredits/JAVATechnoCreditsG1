package vishal;

import java.util.Scanner;

public class CharFrequencyQ3 {

	String input="";
	char ch;
	
	public static void main(String[] args) 
	{
		CharFrequencyQ3 cf=new CharFrequencyQ3();
		cf.enterUserInput();
		System.out.println("Count of char "+cf.ch+" "+cf.findCharFreq());
		

	}
	
	void enterUserInput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("User String");
		 input=sc.nextLine();
		System.out.println("Char Value");
		String s=sc.next();
		ch=s.charAt(0);
		 
	}
	
	public int findCharFreq()
	{
		int count=0;
		char[] char1=input.toCharArray();
		
		for(int index=0;index<char1.length;index++)
		{
			if(char1[index]==ch)
			{
				count=count+1;
			}
		}
		
		return count;

	}

}
