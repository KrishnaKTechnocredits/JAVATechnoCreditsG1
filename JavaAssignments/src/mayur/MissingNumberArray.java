/*
Find the missing number in integer array of 1 to 10
*/
package mayur;
public class MissingNumberArray {
	public static void main(String[] args) 
	{
		UserInputArray userInputArray = new UserInputArray();
		int[] arry = userInputArray.userInput(); //calling UserInput()
		MissingNumberArray missingNumberArray = new MissingNumberArray();
		int expectedSum = ((arry.length * (arry.length + 1)) / 2); //calculating Expected Sum
		System.out.println("expected Sum is " + expectedSum);
		int actualSum = expectedSum - missingNumberArray.arraySum(arry); //
		System.out.println("Missing Number is" + actualSum);
	}

	int arraySum(int[] arry) {
		int sum = 0;
		for (int index = 0; index < arry.length; index++) 
		{
			sum = sum + index; //sum of user Array inputs given by user
		}
		return sum;
	}
}
