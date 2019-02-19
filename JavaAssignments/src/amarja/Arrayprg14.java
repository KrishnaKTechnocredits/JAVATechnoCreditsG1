package amarja;
import java.util.Scanner;
public class Arrayprg14 {
	public static void main(String args[])
	{
		Scanner sr=new Scanner(System.in);//Step 1:Method to read the integer array
		ArrayPrg1 pr1=new ArrayPrg1();
		int input1[] =pr1.input(sr);//Method to read first integer array
		System.out.println("Details of Second Array");
		int input2[] =pr1.input(sr);//Method to read first integer array
		Arrayprg14 pr2=new Arrayprg14();
		int [] input3=new int[(input1.length+input2.length)];//Adding both the arrays in resultant array
		for(int i=0;i<(input1.length+input2.length);i++)
		{
			if(i<input1.length)
			input3[i]=input1[i];
			else
				input3[i]=input2[i-input1.length];
		}
		pr2.display(pr2.findunique(input3));//Calling display method and unique method
		}
	int [] findunique(int arr[])
	{	int [] output=new int [arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
	        boolean unique = false;
	        for(int j=0;j<i;j++){
	            if(arr[i] == arr[j]){
	               unique = true;
	                break;            }
	        }
	        if(!unique)
	        {
	        	output[k]=arr[i];	
	        	k++;
	        }   
	     }		
			return output;
	}
	void display(int output3 [])
	{
		System.out.println("Unique array list is :");
		for(int index=0;index<output3.length;index++)
		{
			if(output3[index]!=0)
			System.out.println(output3[index]);
			}	
	}
}

