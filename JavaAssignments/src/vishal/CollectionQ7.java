package vishal;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionQ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int input = sc.nextInt();
		CollectionQ7 q7 = new CollectionQ7();
		q7.febSeries(input);

	}

	public void febSeries(int num) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		int result = 1;
		for (int i = 1; i <= num; i++) {
			al.add(i);
			// result=result*i;

		}

		for (int i = 0; i < al.size(); i++) {
			result = result * (al.get(i));
		}
		System.out.println(result);
	}

}
