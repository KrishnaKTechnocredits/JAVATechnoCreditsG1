/*---------------------------------------------------------------------------
Implement using Collections.

Assignment: WAP to find max length String from the given array.
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
----------------------------------------------------------------------------*/

package shraddha;

import java.util.ArrayList;

public class Collections_Assignment_2 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("all the best");
		al.add("techndits");
		al.add("");
		al.add("maharashtra");

		int max = al.get(0).length();
		String maxstring = al.get(0);
		for (int index = 0; index < al.size(); index++) {
			if (al.get(index).length() > max) {
				max = al.get(index).length();
				maxstring = al.get(index);
			}
		}
		System.out.println(maxstring);

	}

}
