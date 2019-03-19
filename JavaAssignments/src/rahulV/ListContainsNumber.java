package rahulV;

import java.util.ArrayList;

//verify if list contains given number
public class ListContainsNumber {

	void findNumber(int num) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(100);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(60);
		al.add(90);

		boolean flag = al.contains(num);

		if (flag) {
			System.out.println(num + " is present in list");
		} else {
			System.out.println(num + " is NOT present in list");
		}

	}

	public static void main(String[] args) {
		ListContainsNumber cn = new ListContainsNumber();

		cn.findNumber(25);

	}

}
