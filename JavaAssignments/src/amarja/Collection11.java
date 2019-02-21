package amarja;

/*WAP to find to number is palindrome or not.
Note:- Palindrome means given word/number is same to read from forward and
backward
i.e. actual number :- 12321
  * 
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Collection11 {

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<String> a2 = new ArrayList<String>();
		Collection5 c5 = new Collection5();
		Collection9 c9 = new Collection9();
		a1=c9.userinput(sr);
		System.out.println("The numbers are :" + a1);
		a2 = c5.findrevno(a1);
		System.out.println("The reverse numbers are :" + a2);
		for (int index = 0; index < a2.size(); index++) {
			if (a1.get(index).equals(Integer.parseInt(a2.get(index))))
				System.out.println("Number " + a1.get(index) + " is palindrome");
			else
				System.out.println("Number " + a1.get(index) + " is not a palindrome");
		}
		sr.close();

	}

}
