/*-------------------------------------------------------------------
 * Assignmnet: WAP to find number is Armstrong or not.
a. Int number = 153
i. Number is Armstrong
b. Int number = 234
i. Number is not Armstrong
Note :- Armstrong number means sum of each number cubes to number
it self.
*-------------------------------------------------------------------*/

package shraddha;

import java.util.Scanner;

public class Amstrong {

	void amstrong(int number) {
		int mod = 0, amstrong = 0, number1 = number;
		while (number > 0) {
			mod = number % 10; // You will get last digit
			amstrong = amstrong + (mod * mod * mod); // 371 ---> 0+(1*1*1),
														// 1+(7*7*7),
														// 344+(3*3*3)
			number = number / 10;
		}

		if (amstrong == number1) {
			System.out.println(number1 + " Is a amstrong number.");
		} else {
			System.out.println("Its not amstrong");
		}
	}

	public static void main(String[] args) {

		System.out.print("Please enter any number:= ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Amstrong a = new Amstrong();
		a.amstrong(number);
	}

}
