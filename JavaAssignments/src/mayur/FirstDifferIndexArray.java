// Find first differ index from given arrays 
package mayur;

public class FirstDifferIndexArray 
{
	public static void main(String[] args) 
	{
		UserInputArray userInputArray = new UserInputArray();
		int[] arr1 = userInputArray.userInput();// taking user Inputs
		int[] arr2 = userInputArray.userInput();// taking user Inputs
		FirstDifferIndexArray firstDifferIndexArray = new FirstDifferIndexArray();
		firstDifferIndexArray.differFirstArrayIndex(arr1, arr2); // calling differFirstArrayIndex()
	}

	void differFirstArrayIndex(int[] arr1, int[] arr2) 
	{
		for (int index = 0; index < arr1.length; index++) 
		{
			if (arr1[index] != arr2[index]) // comparing value of array1's and array2's index position
			{
				System.out.println("Values are not matching at index -> " + index);
				break;
			}
		}
	}
}
