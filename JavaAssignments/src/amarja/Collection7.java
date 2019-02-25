package amarja;

import java.util.ArrayList;
import java.util.Scanner;

/*WAP to find factorial series for user defined number
a. Input number :- 5
b. Output :- 120
 */
public class Collection7 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Collection7 c7 = new Collection7();
		Collection9 c9 = new Collection9();
		a1 = c9.userinput(sr);
		System.out.println("The numbers are :" + a1);
		System.out.println("The Factorials are :" + c7.findfactorial(a1));
		sr.close();
	}

	ArrayList<Integer> findfactorial(ArrayList<Integer> a1) {
		ArrayList<Integer> factorial1 = new ArrayList<Integer>();
		int no = 0;
		int factorial = 1;
		for (int index = 0; index < a1.size(); index++) {
			no = a1.get(index);
			factorial = 1;
			while (no != 0) {
				factorial = factorial * no;// Factorial is calculated as//
											// 5*4*3*2*
				no--;
			}
			factorial1.add(factorial);
		}
		return factorial1;
	}
}
