package amarja;
import java.util.Scanner;
/*WAP to find reverse max length string
	a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
	b. Output Max length string :- Technocredits
	c. Max length string reverse value :- stiderconhcet * 
 *  */
public class ArrayPrg6 {
	public static void main(String args[])
	{
		Scanner sr=new Scanner(System.in);//Step 1:Method to read the integer array
		ArrayPrg2 pr1=new ArrayPrg2();
		String input[] =pr1.input(sr);
		sr.close();
		String maxstring=pr1.findmaxlength(input);//method from another class to find maximumlength string
		System.out.println("Maximum Length string is : "+maxstring);
		ArrayPrg6 pr2=new ArrayPrg6();
		System.out.println("Max length string reverse value :-"+pr2.reversestring(maxstring));
	}

	String reversestring(String maxstring)
	{
		String revstring="";
		for (int j=maxstring.length()-1;j>=0;j--)
			{
			revstring= revstring+maxstring.charAt(j);
			}	
		return revstring;
	}
	
}
