package rahulV;

//WAP to find vowels in given string  a. Input :- automation engineering b. Count :- 11 

public class Assignment4_Q8 {
	
	String name = "automation engineering";
	int count =0;
	
	
	void findCountofVowels(char a,char e,char i,char o,char u){
		
		
		for (int j =0;j<name.length();j++) {
			char character = name.charAt(j);
			if((character ==a||character ==e||character ==i||character ==o||character ==u)) {
				count=count+1;
			}
			}
		System.out.println("Count of vowels in given string is "+count);
	}

	public static void main(String[] args) {
		Assignment4_Q8 frequency = new Assignment4_Q8();
		frequency.findCountofVowels('a','e','i','o','u');

	}

}
