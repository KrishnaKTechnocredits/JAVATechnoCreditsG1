package vishal;

public class VerifyNumberInArray {

	boolean verifyNumber(int[] input, int var) {
		boolean status = false;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == var) {
				status = true;
				break;
			}
		}
		return status;
	}

	void printResult() {
		VerifyNumberInArray vn = new VerifyNumberInArray();
		int[] arr = { 2, 5, 9, 7, 4, 6 };
		boolean status = vn.verifyNumber(arr, 8);

		if (status == false) {
			System.out.println("Given Number is not in Array");
		} else {
			System.out.println("Number is in Array");

		}
	}

	public static void main(String[] args) {

		VerifyNumberInArray vn = new VerifyNumberInArray();
		vn.printResult();

	}

}
