package amarja;
/**
 * WAP to find string which has length more than 7 characheter.
a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”,
”abhishek”}\
b. Output :- Krishna, aakansha, abhishek
 * *  */
import java.util.Scanner;
public class ArrayPrg15 {
	public static void main(String args[])
	{
		Scanner sr=new Scanner(System.in);//Step 1:Method to read the integer array
		ArrayPrg2 pr1=new ArrayPrg2();
		String input[] =pr1.input(sr);
		ArrayPrg15 pr2=new ArrayPrg15();
		String output[]=pr2.findstring(input);
		sr.close();
		System.out.println("Output:");
		for(int index=0;index<output.length;index++)
			{if(output[index]!=null)
			System.out.print(output[index]+",");
			}		
	}
	String [] findstring(String input [])
	{
		String output[]=new String[input.length];
		for (int index=0;index<input.length;index++)
		{	
			if (input[index].length()>=7)
				output[index]=input[index];
		}
		return output;
	}
}
