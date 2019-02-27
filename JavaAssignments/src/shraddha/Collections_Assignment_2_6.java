/*---------------------------------------------------------------------------
Implement using Collections.

Assignment: WAP to find max length String from the given array.
a. Input array:- {“all the best”, “technocredits”, “”, “maharashtra”}
----------------------------------------------------------------------------*/

package shraddha;

import java.util.ArrayList;

public class Collections_Assignment_2_6 {

	void reverse(String maxString)
	{
		String s = "";
		for(int index=maxString.length()-1;index>=0;index--)
		{
			s=s+maxString.charAt(index);
		}
		System.out.println("Reverse String: "+s);
	}
	
	String maxString(ArrayList<String> al)
	{
		int max = al.get(0).length();
		String maxstring = al.get(0);
		for (int index = 0; index < al.size(); index++) {
			if (al.get(index).length() > max) {
				max = al.get(index).length();
				maxstring = al.get(index);
			}
		}
		return maxstring;
	}
	
	public static void main(String[] args) {

		Collections_Assignment_2_6 a = new Collections_Assignment_2_6();
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("all the best");
		al.add("techndits");
		al.add("");
		al.add("maharashtra");
		
		String maxString = a.maxString(al);
		
		System.out.println("Max String: "+maxString);
		a.reverse(maxString);
		
	}

}
