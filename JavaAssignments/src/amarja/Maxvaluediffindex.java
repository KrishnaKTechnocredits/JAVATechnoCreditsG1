package amarja;
import java.util.Scanner;
//Question 10 Program to find max value at different index
public class Maxvaluediffindex {
	public static void main(String args[])
	{		Scanner sc=new Scanner(System.in);//Reading the size and values of array 1
			System.out.println("Enter size of first array:");
			int size1=sc.nextInt();
			System.out.println("Enter values of first array:");
			int[]num1 = new int[size1];
			for (int index=0;index<size1;index++)
			{
				num1[index]=sc.nextInt();
			}
			System.out.println("Enter size of second array:");//Reading the size and values of array 1
			int size2=sc.nextInt();
			System.out.println("Enter values of second array:");
			int[]num2 = new int[size2];
			for (int index=0;index<size2;index++)
			{
				num2[index]=sc.nextInt();
			}
			sc.close();
			Maxvaluediffindex diff=new Maxvaluediffindex();
			diff.findeqarrind(num1,num2);	
	}
	void findeqarrind(int num1[],int num2[])
	{					for (int index=0;index<num1.length;index++)
					{	if (num1[index]!= num2[index])
						{
						System.out.println("Values are not matching at index ->" + index);	
						if (num1[index]>num2[index])
						System.out.println("From ("+ num1[index]+","+num2[index]+")"+"max value is "+num1[index]);
						else
						System.out.println("From ("+ num1[index]+","+num2[index]+")"+"max value is "+num2[index]);
						}
					}
	}		
}


