package vishal;

public class Q7VerifySumPairs {

	void verifySumPair(int[] inputData) {
		for (int index = 0; index < inputData.length; index++) { // Question:
																	// How to
																	// use break
																	// statement
																	// with
																	// outer for
																	// loop.
			for (int count = index + 1; count < inputData.length; count++) {
				if (inputData[index] + inputData[count] == 7) {
					System.out.println("Integers numbers,whose sum is equal to 7 are: " + inputData[index] + " And "
							+ inputData[count]);
				}

			}
		}
	}

	public static void main(String[] args) {
		UserInput ui=new UserInput();
		int[] arr= ui.enterDataInt();
		Q7VerifySumPairs vs = new Q7VerifySumPairs();
		vs.verifySumPair(arr);

	}

}
