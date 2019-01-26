package ankush;

import java.util.Scanner;

public class DynamicInputArray {
	int[] intArray()
	{
		System.out.println("Enter Array Size");
		Scanner sc=new Scanner(System.in);
		int totalNumb=sc.nextInt();
		
		int[] ArrayElement=new int[totalNumb];
		for (int index=0;index<ArrayElement.length;index++)
		{
			ArrayElement[index]=sc.nextInt();
		}
	return ArrayElement;	
		
	}
	
	}
