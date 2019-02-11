package rahulV;

//WAP to sum of two array a. firstArray :- {1, 5, 9, 3, 7} b. secondAraay:- {1, 7,  9, 3} c. output :- 45 

public class Assignment4_Q10 {

	void sumofArrays() {
		int[] array1 = { 1, 5, 9, 3, 7 };
		int sum1 = 0;

		for (int i = 0; i < array1.length; i++) {
			sum1 = sum1 + array1[i];
		}

		int[] array2 = { 1, 7, 9, 3 };
		int sum2 = 0;

		for (int i = 0; i < array2.length; i++) {
			sum2 = sum2 + array2[i];
		}
		System.out.format("The sum of both arrays is " + (sum1 + sum2));

	}

	public static void main(String[] args) {

		Assignment4_Q10 sum = new Assignment4_Q10();
		sum.sumofArrays();

	}
}