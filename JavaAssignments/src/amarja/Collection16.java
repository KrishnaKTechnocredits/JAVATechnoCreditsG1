package amarja;

import java.util.ArrayList;

/*Homework How many Maulik are present in array list?
 * Replace all Maulik with Krishna?
 * How many Krishna are present in array list
  * 
 */
public class Collection16 {

	public static void main(String[] args) {
		int count1 = 0;
		int count2 = 0;
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Maulik");
		a1.add("Maulik");
		a1.add("Maulik");
		a1.add("Krishna");
		a1.add("Maulik");
		a1.add("Krishna");
		a1.add("Maulik");
		a1.add("Maulik");
		a1.add("Harsh");
		a1.add("Technocredits");
		System.out.println("Before Replacement:" + a1);
		for (int index = 0; index < a1.size(); index++) {
			if (a1.get(index).equals("Maulik")) {
				count1++;
				a1.set(index, "Krishna");
			}
			if (a1.get(index).equals("Krishna"))
				count2++;
		}
		System.out.println("No of occurences of Maulik :" + count1);
		System.out.println("Post Replacement:" + a1);
		System.out.println("No of occurences of Krishna :" + count2);
	}

}
