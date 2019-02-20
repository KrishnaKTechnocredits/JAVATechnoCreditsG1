package shraddha;

import java.util.Scanner;

public class MissingNumber {

	void missingNumber()
	{
		Scanner sc = new Scanner(System.in);
		int[] number_series = new int[10];
		int[] missing_number = new int[number_series.length+1];
		System.out.println("Please enter Numbers 1 to 10 with one no missing in the array");
		
		//Entering numbers in the array
		for (int index = 0; index < number_series.length; index++) {
			number_series[index] = sc.nextInt();
		}
		
		//iterate the number series array to fetch the numbers
		for(int index = 0; index<number_series.length;index++)
		{
			missing_number[number_series[index]] = missing_number[number_series[index]] + 1;
		}
		
		//iterate missing number array to find missing number
		for(int index = 1; index<number_series.length;index++)
		{
			if(missing_number[index] == 0)
			{
				System.out.println("Missing Number is: "+index);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MissingNumber().missingNumber();
		
	}

}
