package vishal;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionQ13 {

	public static void main(String[] args) {
		CollectionQ13 q13 = new CollectionQ13();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		q13.checkArmstrongNo(num);

	}

	public void checkArmstrongNo(int num) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		int sum = 0;
		int temp;
		int temp1 = num;

		while (temp1 != 0) {
			temp = temp1 % 10;
			temp1 = temp1 / 10;
			al1.add(temp);

		}

		for (int i : al1) {
			sum = sum + i * i * i;
		}
		System.out.println("Sum is: " + sum);

		if (sum == num) {
			System.out.println("Num is Armstrong");
		} else {
			System.out.println("Num is not Armstrong");
		}

	}

}
