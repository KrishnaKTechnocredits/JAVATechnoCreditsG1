package vishal;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionQ5 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		al.add(num);
		CollectionQ5 q4 = new CollectionQ5();
		q4.reverse(al);

	}

	void reverse(ArrayList<Integer> al) {
		String s = al.get(0).toString();
		ArrayList<Integer> al2 = new ArrayList<Integer>();

		for (int index = s.length() - 1; index >= 0; index--) {
			int i = Character.getNumericValue(s.charAt(index));
			al2.add(i);

		}
		
		System.out.println("Reverse is: ");
		for (int i = 0; i < al2.size(); i++) {
			System.out.print(al2.get(i).intValue());
		}
	}
}
