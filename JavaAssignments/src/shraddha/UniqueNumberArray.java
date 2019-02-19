package shraddha;

class UniqueNumberArray {

	static int count = 0;

	public static void main(String[] args) {
		UniqueNumberArray u = new UniqueNumberArray();
		int[] arr1 = { 12, 1, 1, 67, 1 };
		int[] arr2 = { 12, 20, 1, 65, 14,40 };
		int[] arr3 = new int[arr1.length + arr2.length];

		for (int index = 0; index < arr1.length; index++) {
			u.setElement(arr1[index], arr3);
		}
		for (int index = 0; index < arr2.length; index++) {
			u.setElement(arr2[index], arr3);
		}
		u.display(arr3);
	}

	void setElement(int temp, int[] arr3) {
		boolean flag = false;
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] == temp) {
				flag = false;
				break;
			} else {
				flag = true;
			}
		}
		if (flag == true) {
			arr3[count] = temp;
			count++;
		}
	}

	void display(int[] arr3) {
		String s = "";
		for (int index = 0; index < arr3.length; index++) {
			if(arr3[index]!=0)
			{
			s = s + arr3[index] + ",";
			}
		}
		s = s.substring(0, s.length() - 1);
		System.out.println("Unique Array is := { " + s + " }");
	}
}