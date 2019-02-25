package amarja;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/*WAP to find vowels in given string
a. Input :- automation engineering
b. Count :- 11
 */
public class Collection8 {

	public static void main(String[] args) {
		LinkedList<String> l1 = new LinkedList<String>();
		Collection2 c2 = new Collection2();
		Collection8 c8 = new Collection8();
		Scanner sc = new Scanner(System.in);
		l1 = c2.userinput(sc);
		System.out.println("Input String : " + l1);
		System.out.println("Vowel Count = " + c8.findvowelcount(l1));
		sc.close();
	}

	ArrayList<Integer> findvowelcount(LinkedList<String> l1) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();

		int j = 0;
		for (j = 0; j < l1.size(); j++) {
			int count = 0;
			int index = 0;
			while (index < l1.get(j).length()) {

				switch (l1.get(j).charAt(index)) {

				case 'a':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'u':
					count++;
					break;
				case 'A':
					count++;
					break;
				case 'E':
					count++;
					break;
				case 'O':
					count++;
					break;
				case 'I':
					count++;
					break;
				case 'U':
					count++;
					break;
				default:
					break;
				}
				index++;
			}
			a1.add(j, count);
		}

		return a1;
	}
}
