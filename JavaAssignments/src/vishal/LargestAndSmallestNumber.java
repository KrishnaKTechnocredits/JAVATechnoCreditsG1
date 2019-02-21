package vishal;

public class LargestAndSmallestNumber {

	int[] LargestAndSmallest(int[] inputData) {
		int max = 0;

		for (int index = 0; index < inputData.length; index++) {
			if (max < inputData[index])
				max = inputData[index];

		}

		int min = max;

		for (int index = 0; index < inputData.length; index++) {

			if (min > inputData[index])// 11>2
			{
				min = inputData[index];// 2
			}

		}
		int[] minMax = { max, min };

		return minMax;
	}

	public static void main(String[] args) {
		UserInput ui = new UserInput();
		int[] arr = ui.enterDataInt();

		// int arr[] = { 2, 6, 3, 9, 11 };
		LargestAndSmallestNumber ls = new LargestAndSmallestNumber();
		int result[] = ls.LargestAndSmallest(arr);

		System.out.println("Max no. is " + result[0]);
		System.out.println("Min no is " + result[1]);

	}

}
