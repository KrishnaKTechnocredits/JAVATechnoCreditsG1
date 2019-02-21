package technoCredits.number;

public class MissingNumberCount {

	static int cnt;

	public static void countMissingNumber(int a[]) {
		int maxNumber = FindMaxNumber.findMaxNumber(a);

		int missingArray[] = new int[++maxNumber];

		for (int i = 0; i < a.length; i++) {
			if (missingArray[i] == 0 && a[i] != 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}