package saket;

public class VowelCount {

	public static void main(String[] args) {

		char vovel1 = 'a';
		char vovel2 = 'e';
		char vovel3 = 'i';
		char vovel4 = 'o';
		char vovel5 = 'u';
		int count = 0;

		String input = "automation engineering";

		for (int i = 0; i <= input.length() - 1; i++) {
			char a = (input.charAt(i));

			if (a == vovel1) {
				count++;
			}
			if (a == vovel2) {
				count++;
			}
			if (a == vovel3) {
				count++;
			}
			if (a == vovel4) {
				count++;
			}
			if (a == vovel5) {
				count++;
			}

		}
		System.out.println(count);
	}

}
