package technoCredits.number;

public class FindMaxNumber {
	
	static int maxValue = 0;

	public static  int   findMaxNumber(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (maxValue < a[i]) {
				maxValue = a[i];
			}
		}
		return maxValue;
	}
}
