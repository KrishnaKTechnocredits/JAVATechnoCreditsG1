package amarja;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*14)WAP to find unique number from given array store that numbers in new array.
a. firstArray:- {1,2,3,4,2,5}
b. secondArray:- {5,6,7,8,9,7}
c. unique array = {1,2,3,4,5,6,7,8,9}
i. order can be anything 
Covered the homework given in class with this example
/Homework 19,12,13,15,17,15 & 15,17,19,15
  */
public class Collection14 {

	public static void main(String[] args) {
		Collection14 c14 = new Collection14();
		Collection9 c9 = new Collection9();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Array 1:");
		a1 = c9.userinput(sc);
		System.out.println("Input Array 2:");
		a2 = c9.userinput(sc);
		System.out.println("Unique array List :"+c14.finduniquearray(a1, a2));
		sc.close();

	}

	HashSet<Integer> finduniquearray(ArrayList<Integer> a1, ArrayList<Integer> a2) {
		a1.addAll(a2);
		HashSet<Integer> hs1 = new HashSet<Integer>();
		System.out.println(a1.size());
		for (int index = 0; index < a1.size(); index++) {
			if (hs1.add(a1.get(index)) == false)
				a1.remove(index);
		}
		return hs1;
	}

}
