package ankush;

import java.util.Scanner;

public class FrequencyOfChar {

	int findCharacter(String str,char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Char value :- " + ch);
		System.out.println("Count of " + ch + ":- " + count);
		
		return count;
	}

	public static void main(String[] args) {
		String str = "electrical engineering";
		FrequencyOfChar freqOfChar=new FrequencyOfChar();
		
		System.out.println("Enter Character to Search in String:"+str);
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		char ch=str1.charAt(0);
		freqOfChar.findCharacter(str,ch);
		sc.close();
	}
}
