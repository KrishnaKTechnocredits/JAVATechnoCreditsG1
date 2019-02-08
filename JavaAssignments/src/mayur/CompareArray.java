/*
 java program to check the equality of two arrays
*/package mayur;

public class CompareArray {

	public static void main(String[] args) {
		UserInputArray userInputArray = new UserInputArray();
		int[] arry1 = userInputArray.userInput();// First array
		int[] arry2 = userInputArray.userInput();// Second array
		CompareArray compareArray = new CompareArray(); //Created object of CompareArray class
		if (compareArray.compareArray(arry1, arry2) == true) //comparing flag
			System.out.println("Two Arrays Are Equal ");
		else
			System.out.println("Array enter by you are not equal");
	}

	boolean compareArray(int[] arry1, int[] arry2) {
		boolean flag = false;
		if (arry1.length != arry2.length) //Comparing Array1 And Array2 Lengths
		{
			flag = false;
		} 
		else 
		{
			for (int index = 0; index < arry1.length; index++) 
			{
				if (arry1[index] != arry2[index]) //comparing index element of array1 and array2
				{
					flag = false;
					break;
				} 
				else 
				{
					flag = true;
				}
			}
		}
		return flag; //returning boolean flag
	}

}
