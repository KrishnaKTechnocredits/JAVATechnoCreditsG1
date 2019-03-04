package amarja;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*5) Write code to get first 5 numbers between 1 to 100 and calculate sum, average and max
number from those numbers.
NOTE : User may enter String or double, handle that exception.
 */

public class Exception5 {

	public static void main(String[] args) {
		Exception5 ex5 = new Exception5();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		try {
			a1 = ex5.userinput(sc);
		} catch (Exception e) {
			System.out.println("Orignal numbers are :" + a1);
			System.out.println("SUM :" + ex5.sum(a1));
			System.out.println("AVERAGE :" + ((ex5.sum(a1)) / a1.size()));
			System.out.println("MAX :" + ex5.max(a1));
		} finally {
			sc.close();
		}
		System.out.println("Program ends");
	}

	int max(ArrayList<Integer> a1) {
		int max = a1.get(0);
		for (int index = 0; index < a1.size(); index++) {
			if (max < a1.get(index))
				max = a1.get(index);
		}
		return max;

	}

	int sum(ArrayList<Integer> a1) {
		int sum = 0;
		for (int index = 0; index < a1.size(); index++) {
			sum = sum + a1.get(index);
		}
		return sum;
	}

	private ArrayList<Integer> userinput(Scanner sc) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		System.out.println("Enter first 5  numbers between 1 to 100 ");
		int no = 0;
		while (a1.size() != 5) {
			System.out.println("Enter no");
			try {
				no = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Error !!!! Enter only Integer numbers.Not string and Double");
				a1.add(no);
				e.printStackTrace();
				break;
			}
			a1.add(no);
		}
		return a1;

	}

}
