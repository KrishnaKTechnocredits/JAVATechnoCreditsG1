package ankush;

import java.util.Scanner;

public class InputOperations {
	
	int[] takeInputsFromUser()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of Inputs : ");
		int size=sc.nextInt();
		int[] num=new int[size];
		for(int index=0;index<num.length;index++)
		{
			num[index]=sc.nextInt();
		}
		return num;
	}
	
	
}
