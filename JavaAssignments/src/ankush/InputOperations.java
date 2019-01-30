package ankush;

import java.util.Scanner;

public class InputOperations {
	
	Scanner sc=new Scanner(System.in);
	
	int[] takeInputsFromUser()
	{
		System.out.println("Enter Size of an array : ");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("Enter Elements of an array : ");
		for(int index=0;index<num.length;index++)
		{
			num[index]=sc.nextInt();
		}
		return num;
	}
	
	int takeNumberInput()
	{
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		return num;
	}
	
}
