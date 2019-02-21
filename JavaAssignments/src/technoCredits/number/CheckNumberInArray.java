package technoCredits.number;

public class CheckNumberInArray {

	public void checkAvalibiltyOgNumberInArray(int array[], int checkNum) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == checkNum) {
				System.out.println(checkNum + " is avaliable in array");
			}
		}
	}
}