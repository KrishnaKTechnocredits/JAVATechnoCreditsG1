package amarja;

/*/*4) WAP to find sum of user given number.
a. Input:- 159753
b. Sum of given number:- 30*/
import java.util.ArrayList;
import java.util.Scanner;

public class Collection4 {
	public static void main(String args[]) {
		Scanner sr = new Scanner(System.in);
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Collection4 c4 = new Collection4();
		System.out.println("Enter the numbers for which sum is to be found:");
		Collection9 c9 = new Collection9();
		a1=c9.userinput(sr);
		System.out.println("The numbers are :" + a1);
		System.out.println("SUM of Numbers is" + c4.findsumno(a1));
		sr.close();
	}

	ArrayList<String> findsumno(ArrayList<Integer> a1) {
		int sum = 0;
		int no;
		ArrayList<String> a2 = new ArrayList<String>();
		for (int index = 0; index < a1.size(); index++) {
			sum = 0;
			no = a1.get(index);
			for (int j = 0; j < a1.get(index).toString().length(); j++) {
				sum = sum + (no % 10);
				no = no / 10;
			}
			a2.add(index, sum + "");
		}
		return a2;
	}
}
