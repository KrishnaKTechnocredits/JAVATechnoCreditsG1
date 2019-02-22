package vishal;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionQ3 {

	public static void main(String[] args) {

		int count = 0;
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("Enter char ");
		String s = sc.next();
		char ch = s.charAt(0);

		al.add(input);

		for (int i = 0; i < input.length(); i++) {
			if (al.get(0).charAt(i) == 'e') {

				count = count + 1;
			}

		}

		System.out.println(count);

	}

}
