/*
Program to find smallest and largest number of array
*/package mayur;

public class LargestSmallestNumberClient 
{
	public static void main(String[] args) 
	{

		UserInputArray userInputArray = new UserInputArray();
		int[] arry = userInputArray.userInput(); // calling UserInput()

		LargestSmallestNumberService largestSmallestNumberService = new LargestSmallestNumberService();
		int[] result = largestSmallestNumberService.largestSmallest(arry);// calling LargestSmallest() to find smallest and largest number of array
		System.out.println("Smallest number is " + result[0]);
		System.out.println("Largest number is " + result[1]);
	}
}