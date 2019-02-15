/*--------------------------------------------------------
 Assignment:- WAP to find average of user given array
a. Input :- {14, 32, 19, 14, 78,36}
b. Output:- 32.16 
 --------------------------------------------------------*/


package shraddha;

import java.util.Scanner;

public class AverageOfArray {

	int[] acceptNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter total number of numbers to be stored: ");
		int size = sc.nextInt();
		int[] num_array = new int[size];
		for (int index = 0; index < num_array.length; index++) {
			num_array[index] = sc.nextInt();
		}

		return num_array;
	}
	
	void Average(int[] num_array)
	{
		float avg=0;
		for(int index = 0; index<num_array.length;index++)
		{
			avg = avg + num_array[index];
		}
		avg = avg/num_array.length;
		System.out.println("Average of numbers in array is:- "+avg);
	}

	public static void main(String[] args) {

		AverageOfArray a = new AverageOfArray();
		a.Average(a.acceptNumbers());
	}

}



