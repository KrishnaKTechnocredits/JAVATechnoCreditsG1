/*
Program to find smallest and largest number of array
*/package mayur;

public class LargestSmallestNumberClient 
{
	public static void main(String[] args) 
	{

		UserInputArray userInputArray = new UserInputArray();
		int[] arry = userInputArray.UserInput(); // calling UserInput()

		LargestSmallestNumberService largestSmallestNumberService = new LargestSmallestNumberService();
		int[] m = largestSmallestNumberService.LargestSmallest(arry);// calling LargestSmallest() to find smallest and largest number of array
		System.out.println("Smallest number is " + m[0]);
		System.out.println("Largest number is " + m[1]);
	}
}