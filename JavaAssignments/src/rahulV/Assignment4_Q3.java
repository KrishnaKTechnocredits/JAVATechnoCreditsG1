package rahulV;

//WAP to find frequency of user defined character in user defined String

public class Assignment4_Q3 {
	
	String name = "electrical engineering";
	int count = 0;
	
	void frequencyofString(char ch) {
		
		for (int i=0;i<name.length();i++) {
			char character = name.charAt(i);
			if(character==ch) {
				count = count+1;
			}
		}
	System.out.println("Frequency of e in given string: "+count);
	}

	public static void main(String[] args) {
		Assignment4_Q3 fr = new Assignment4_Q3();
		fr.frequencyofString('e');
		
	}

}
