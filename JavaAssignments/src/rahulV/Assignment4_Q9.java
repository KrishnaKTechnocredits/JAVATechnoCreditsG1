package rahulV;

public class Assignment4_Q9 {

//WAP to find average of user given array a. Input :- {14, 32, 19, 14, 78,36} b. Output:- 32.16

	void arrAverage() {
		int[] array = { 14, 32, 19, 14, 78, 36 };
		float sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}

		float average = (sum / array.length);

		System.out.format("The average of given array is " + average);
	}

	public static void main(String[] args) {

		Assignment4_Q9 avg = new Assignment4_Q9();
		avg.arrAverage();

	}
}