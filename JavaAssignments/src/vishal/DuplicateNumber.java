package vishal;

public class DuplicateNumber {

	int duplicateNo(int a[]) {
		//int a[] = { 0, 3, 1, 2, 3 };
		int duplicateNo = 0;

		for (int index = 0; index < a.length; index++) { // Question: How to use break statement with outer for loop.
			for (int count = index + 1; count < a.length; count++) {
				if (a[index] == a[count]) {
					duplicateNo = a[index];
					break;
				}

			}
			// break; Why outer for loop become dead after applying break here
		}
		return duplicateNo;
	}

	public static void main(String[] args) {
		DuplicateNumber dn = new DuplicateNumber();
		UserInput ui=new UserInput();
		int[] arr= ui.enterDataInt();
		System.out.println("Duplicate No is " + dn.duplicateNo(arr));

	}

}
