package amarja;

import java.util.ArrayList;
import java.util.Scanner;

/*WAP to reveres user given number
a. Input number:- 456789
b. Output number :- 987654
 */
public class Collection5 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Collection5 c5 = new Collection5();
		System.out.println("Enter the numbers whose reverse is to be found:");
		Collection9 c9 = new Collection9();
		a1 = c9.userinput(sr);
		System.out.println("The numbers are :" + a1);
		System.out.println("The reverse numbers are :" + c5.findrevno(a1));
		sr.close();
	}

	ArrayList<String> findrevno(ArrayList<Integer> a1) {
		int revno;
		int no;
		String temp = "";
		ArrayList<String> a2 = new ArrayList<String>();
		for (int j = 0; j < a1.size(); j++) {
			no = a1.get(j);
			revno = 0;
			temp = "";
			for (int index = 0; index < a1.get(j).toString().length(); index++) {
				revno = no % 10;
				temp = temp + revno;
				no = no / 10;
			}
			a2.add(temp);
		}
		return a2;
	}
}
