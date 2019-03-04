package ankush;

public class FindVowels {

	int checkVowels(String input) {
		int count = 0;
		char charac;
		for (int index = 0; index < input.length(); index++) {
			charac = input.charAt(index);
			if (charac == 'a' || charac == 'e' || charac == 'i' || charac == 'o' || charac == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String input = "automation engineering";
		FindVowels findVowels = new FindVowels();
		int count = findVowels.checkVowels(input);
		System.out.println("Vowels Count :" + count);
	}

}
