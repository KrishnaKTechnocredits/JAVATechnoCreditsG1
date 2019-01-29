package vishal;

public class EqulityofTwoArray {

	boolean compareArray(int[] array1, int[] array2) {
		boolean state = true;
		for (int index = 0; index < array1.length; index++) {

			if (array1[index] == array2[index]) {
				state = true;
			} else {
				state = false;
			}
		}

		return state;
	}

	void printResult() {
		UserInput ui=new UserInput();
		int[] a1= ui.enterDataInt();
		int[] a2= ui.enterDataInt();
		//int[] a1 = { 31, 57, 11, 21, 24 };
		//int[] a2 = { 31, 57, 11, 21, 24 };
		EqulityofTwoArray ea = new EqulityofTwoArray();
		boolean state = ea.compareArray(a1, a2);

		if (state == true) {
			System.out.println("Two arrays are same");
		} else {
			System.out.println("Two arrays are not same");
		}

	}

	public static void main(String[] args) {

		EqulityofTwoArray ea = new EqulityofTwoArray();
		ea.printResult();
	}

}
