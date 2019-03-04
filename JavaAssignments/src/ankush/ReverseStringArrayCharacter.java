package ankush;

public class ReverseStringArrayCharacter {

	String[] reverseArray(String input[]) {
		String localArray[] = new String[input.length];
		for (int i = input.length - 1; i >= 0; i--) {
			localArray[(input.length - 1)-i] = stringReverse(input[i]);

		}

		return localArray;

	}

	String stringReverse(String name) {
		String reverString = "";
		for (int i = name.length() - 1; i >= 0; i--) {

			reverString = reverString + name.charAt(i);
		}
		return reverString;

	}

	public static void main(String[] args) {
		String input[] = { "saket", "piyush", "avdhoot", "ravi" };
		ReverseStringArrayCharacter revereStringArrayCharacter = new ReverseStringArrayCharacter();
		String reverseArray[] = revereStringArrayCharacter.reverseArray(input);
		for (int i = 0; i < reverseArray.length; i++) {
			System.out.println(reverseArray[i]);
		}
	}
}
