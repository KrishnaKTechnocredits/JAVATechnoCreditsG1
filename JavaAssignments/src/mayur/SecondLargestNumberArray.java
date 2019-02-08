// program to find second largest element in an array of integers
package mayur;

public class SecondLargestNumberArray 
{
	public static void main(String[] args) 
	{
		UserInputArray userInputArray =new UserInputArray();
		int[] arry= userInputArray.userInput();
		SecondLargestNumberArray sLargest = new SecondLargestNumberArray();
		System.out.println("Second Largest Number of Array is "+sLargest.secondLargest(arry));
	}

	int secondLargest(int[] arry) 
	{
		int largest = 0;
		int  sLargest= 0;
		for (int index = 0; index < arry.length; index++) {
			if (largest < arry[index]) 
			{
				sLargest= largest;
				largest= arry[index];
			}
			else if(sLargest < arry[index]  &&  largest != arry[index])
			{
				sLargest = arry[index]; 
			}
		}
		return sLargest;
	}
}
