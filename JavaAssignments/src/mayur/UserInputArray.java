package mayur;

import java.util.Scanner;

class UserInputArray {
	//Method to read user input. Returns array with users' input
		int[] UserInput()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Size of array:");
			int size = sc.nextInt();
			int[] Arry = new int[size];
			System.out.println("Enter " + size + " numbers");
			for (int index = 0; index < size; index++) // for loop to store console input in array.
			{
				Arry[index] = sc.nextInt();
			}
			sc.close();
			return Arry;
		}

}
