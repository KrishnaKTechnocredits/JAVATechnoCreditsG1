package vishal;

import java.util.ArrayList;

public class CollectionQ15 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		CollectionQ15 q15 = new CollectionQ15();
		al.add("Krishna");
		al.add("maulik");
		al.add("aakash");
		al.add("harsh");
		al.add("harsh");
		al.add("Akansha");
		q15.findString(al);

	}

	public void findString(ArrayList<String> al1) // string which has more than
													// 7 chars
	{
		ArrayList<String> al2 = new ArrayList<String>();

		for (String s : al1) {
			if (s.length() >= 7) {
				al2.add(s);
			}
		}
		System.out.println(al2);
	}

}
