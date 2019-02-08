package rahulV;

public class Assignment2_Q2 {

	int duplicateNumber(int array[]) { // method to find duplicate number
		int temp = 0;

		for (int array_index1 = 0; array_index1 < array.length; array_index1++) {

			for (int array_index2 = array_index1 + 1; array_index2 < array.length; array_index2++) {
				if (array[array_index1] == array[array_index2]) {

					temp = array[array_index1];
					System.out.println("Duplicate Number is : " + temp);
				}
			}
		}

		return temp;
	}

	public static void main(String[] args) {
		Inputfromuser input = new Inputfromuser();
		int array[] = input.takeInputFromUserInt();
		Assignment2_Q2 assignment2_q2 = new Assignment2_Q2();
		assignment2_q2.duplicateNumber(array);
	}

}
