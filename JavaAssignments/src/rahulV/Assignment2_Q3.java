
package rahulV;

import java.util.Scanner;

public class Assignment2_Q3 {

	Scanner scanner = new Scanner(System.in);

	void NumberCheck(int array[]) { // method to check whether number is present

		boolean flag = false;
		System.out.println("Enter the number which you want to check ");
		int number = scanner.nextInt();
		for (int array_index = 0; array_index < array.length; array_index++) {

			if (array[array_index] == number) {
				System.out.println(number + " is present");
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println(number + "is not present");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inputfromuser input = new Inputfromuser();
		int array[] = input.takeInputFromUserInt();
		Assignment2_Q3 assignment2_Q3 = new Assignment2_Q3();
		assignment2_Q3.NumberCheck(array);
	}

}
