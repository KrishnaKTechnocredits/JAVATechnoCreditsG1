package farhin;

public class SecondLargestNum {

	public static void main(String[] args) {
		DuplicateNum input = new DuplicateNum();
		int[] arrNum = input.takeInputs();
		SecondLargestNum secondlargestNum = new SecondLargestNum();
		System.out.println("Secondlargest number from array is: " + secondlargestNum.findSecondLargestNum(arrNum));

	}

	int findSecondLargestNum(int[] arrNum) {
		int max = 0, secondmax = 0;
		for (int index = 0; index < arrNum.length; index++) {
			if (arrNum[index] > max) {
				secondmax = max;
				max = arrNum[index];

			}
		}

		return secondmax;
	}

}
