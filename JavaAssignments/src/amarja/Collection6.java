package amarja;

/*WAP to find reverse max length string
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
b. Output Max length string :- Technocredits
c. Max length string reverse value :- stiderconhcet
  */
import java.util.LinkedList;
import java.util.Scanner;

public class Collection6 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		Collection6 c6 = new Collection6();
		Collection2 c2 = new Collection2();
		Scanner sc = new Scanner(System.in);
		l1 = c2.userinput(sc);
		System.out.println("Max length string is:" + c2.findmaxlength(l1));
		System.out.println("Reverse max length string is :" + c6.reversestring(c2.findmaxlength(l1)));
		sc.close();
	}

	String reversestring(String maxstring) {
		String revstring = "";
		for (int j = maxstring.length() - 1; j >= 0; j--) {
			revstring = revstring + maxstring.charAt(j);
		}
		return revstring;
	}

}
