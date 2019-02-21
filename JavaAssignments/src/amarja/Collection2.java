package amarja;

import java.util.LinkedList;
import java.util.Scanner;

/*WAP to find max length String from the given array.
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
 */
public class Collection2 {
	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		Collection2 c2 = new Collection2();
		Scanner sc = new Scanner(System.in);
		l1 = c2.userinput(sc);
		System.out.println("Max length string is:" + c2.findmaxlength(l1));
		sc.close();
	}

	String findmaxlength(LinkedList<String> l1) {
		int max = 0;
		String maxstring = "";
		for (int index = 0; index < l1.size(); index++) {
			if (max < (l1.get(index).length())) {
				max = l1.get(index).length();
				maxstring = l1.get(index);
			}
		}
		return maxstring;
	}

	LinkedList<String> userinput(Scanner sc) {
		LinkedList<String> l1 = new LinkedList<String>();
		System.out.println("Please write 'Quit' to END");
		String temp = sc.nextLine();
		do {
			l1.add(temp);
			temp = sc.nextLine();
		} while (!temp.equals("Quit"));
				return l1;
	}
}
