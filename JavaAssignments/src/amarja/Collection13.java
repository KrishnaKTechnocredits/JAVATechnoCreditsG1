package amarja;

/**WAP to find number is Armstrong or not.
a. Int number = 153
i. Number is Armstrong
b. Int number = 234
i. Number is not Armstrong
Note :- Armstrong number means sum of each number cubes to number
it self.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Collection13 {

	public static void main(String args[]) {
		Collection9 c9 = new Collection9();
		Collection13 c13 = new Collection13();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1 = c9.userinput(sc);
		for (int index = 0; index < a1.size(); index++) {
			if ((a1.get(index)) == c13.findarmstrong(a1))
				System.out.println("Number " + a1.get(index) + " is Armstrong number");
			else
				System.out.println("Number " + a1.get(index) + " is not an Armstrong number");
		}
		sc.close();
	}

	int findarmstrong(ArrayList<Integer> a1) {
		int no = 0;
		int armstno = 0;
		for (int j = 0; j < a1.size(); j++) {
			no = a1.get(j);
			armstno = 0;

			for (int index = 0; index <= a1.get(j).toString().length(); index++) {
				armstno = armstno + ((no % 10) * (no % 10) * (no % 10));
				no = no / 10;
			}
		}
		System.out.println(armstno);
		return armstno;

	}

}
