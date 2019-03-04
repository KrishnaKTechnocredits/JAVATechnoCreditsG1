package ankush;

public class StringLengthComparison {

	String compareStringLength(String inputArray[]) {
		int temp;
		String outputString = "";
		for (int index = 0; index < inputArray.length; index++) {
			temp = inputArray[index].length();
			if (temp > 7) {
				outputString = outputString + " " + inputArray[index];
			}
		}
		return outputString;
	}

	public static void main(String[] args) {
		String input[] = { "krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek" };
		StringLengthComparison strLengthCompare = new StringLengthComparison();
		String returnString = strLengthCompare.compareStringLength(input);
		System.out.println(returnString);
	}
}
