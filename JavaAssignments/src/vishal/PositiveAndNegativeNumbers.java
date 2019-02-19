package vishal;

public class PositiveAndNegativeNumbers {
	int pCnt = 0;
	int nCnt = 0;
	int pSum = 0;
	int nSum = 0;
	int[] numbers = { 5, 6, -9, 14, -25, 6, 7, -14 };
	int[] pNumbers = new int[numbers.length];
	int[] nNumbers = new int[numbers.length];

	public static void main(String[] args) {

		PositiveAndNegativeNumbers pn = new PositiveAndNegativeNumbers();

		pn.findPosiNegative();

		System.out.println("Positive numbers are ");
		pn.displayArrayPositiveNumbers(pn.pNumbers);
		System.out.println("\nNegative numbers are ");
		pn.displayArrayNegativeNumbers(pn.nNumbers);
		System.out.println("\nSum of positive numbers: " + pn.pSum);
		System.out.println("\nSum of negative numbers: " + pn.nSum);
	}

	public void findPosiNegative() {

		for (int index = 0; index < numbers.length; index++) {

			if (numbers[index] > 0) {

				pNumbers[pCnt] = numbers[index];
				pSum = pSum + pNumbers[pCnt];
				pCnt++;

			} else {
				nNumbers[nCnt] = numbers[index];
				nSum = nSum + nNumbers[nCnt];
				nCnt++;
			}
		}
	}

	void displayArrayPositiveNumbers(int[] num) {
		for (int i = 0; i < pCnt; i++) {
			System.out.print(num[i] + " ");
		}

	}

	void displayArrayNegativeNumbers(int[] num) {
		for (int i = 0; i < nCnt; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
