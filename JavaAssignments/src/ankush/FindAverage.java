package ankush;

public class FindAverage {

	float checkAverage(int input[]) {
		float temp = 0;
		for (int index = 0; index < input.length; index++) {
			temp = temp + input[index];
		}
		temp = (temp / input.length);

		return temp;
	}

	public static void main(String[] args) {
		int input[] = { 14, 32, 19, 14, 78, 36 };
		FindAverage findAvg = new FindAverage();
		float average = findAvg.checkAverage(input);
		System.out.println("Average of input array : " + average);
	}
}
