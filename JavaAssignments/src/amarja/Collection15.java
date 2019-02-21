package amarja;

import java.util.LinkedList;
import java.util.Scanner;

/*15)WAP to find string which has length more than 7 characheter.
a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”,
”abhishek”}\
b. Output :- Krishna, aakansha, abhishek
 */
public class Collection15 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		Collection2 c2 = new Collection2();
		Scanner sc = new Scanner(System.in);
		l1 = c2.userinput(sc);
		System.out.println("String with more than 7 Characters");
		for (int index = 0; index < l1.size(); index++) {
			if (l1.get(index).length() >= 7) {
				System.out.println(l1.get(index));
			}
		}
	}

}
