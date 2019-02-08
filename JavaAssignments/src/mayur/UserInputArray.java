// Class Created to take user's input in array
package mayur;

import java.util.Scanner;

class UserInputArray {
	//Method to read user input. Returns array with users' input
		int[] userInput()
		{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Size of array:");
			int size = sc.nextInt();
			int[] arry = new int[size];
			System.out.println("Enter " + size + " numbers");
			for (int index = 0; index < size; index++) // for loop to store console input in array.
			{
				arry[index] = sc.nextInt();
			}
			return arry;
		}

}
