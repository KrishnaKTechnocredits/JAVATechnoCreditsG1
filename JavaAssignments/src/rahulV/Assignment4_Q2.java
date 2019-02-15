package rahulV;

public class Assignment4_Q2 {

	String findmaxLenString(String input[]) {
		int maxLength = 0;
		String maxStr = "";
		for (int i = 0; i < input.length; i++) {
			int len = input[i].length();
			if (len > maxLength) {
				maxLength = len;
				maxStr = input[i];
			}
		}
		
		return maxStr;
		
	}

	void display(String str) {
		System.out.println("Longest string is: " + str);
	}

	public static void main(String[] args) {
	
			String input[] = { "All the best", "Technocredits", "", "Maharashtra" };
			Assignment4_Q2 maxString = new Assignment4_Q2();
			String max = maxString.findmaxLenString(input);
			maxString.display(max);

	}

}
