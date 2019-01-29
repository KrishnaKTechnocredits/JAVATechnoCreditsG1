package vishal;

public class MissingNo1To10 {

	int missingNo() {

		int[] a = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int n = 10;
		int actualSum = 0;
		int expectedSum = n * (n + 1) / 2;
		for (int index = 0; index < a.length; index++) {
			actualSum = actualSum + a[index];
		}
		int missingNo = expectedSum - actualSum;
		return missingNo;

	}

	public static void main(String[] args) {
		MissingNo1To10 mn = new MissingNo1To10();
		System.out.println("Missing No is: " + mn.missingNo());

	}

}
