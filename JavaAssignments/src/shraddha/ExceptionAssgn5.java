/*-------------------------------------------------------------------------------------------------
 Assignment: Write code to get first 5 numbers between 1 to 100 and calculate sum, average and max
number from those numbers.
NOTE : User may enter String or double, handle that exception.
 ----------------------------------------------------------------------------------------------------*/

package shraddha;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionAssgn5 {
	
	void sum(ArrayList a)
	{
		int sum = 0;
		for(int index=0; index<a.size(); index++)
		{
			sum = sum + (int) a.get(index);
		}
		System.out.println("Sum is:"+sum);
	}

	public static void main(String[] args) {
		int count = 0;
		ExceptionAssgn5 s = new ExceptionAssgn5();
		System.out.print("Please enter the number between 1 to 100");

		ArrayList a = new ArrayList<>();
		while (count < 5) {
			Scanner sc = new Scanner(System.in);
			try {
				a.add(sc.nextInt());
				count++;
			} catch (Exception e) {
				System.out.println("Please enter correct input");
			}
		}
		System.out.println(a);
		s.sum(a);
	}
}
