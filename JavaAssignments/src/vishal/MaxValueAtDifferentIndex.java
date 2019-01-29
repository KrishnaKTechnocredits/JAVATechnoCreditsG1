package vishal;

public class MaxValueAtDifferentIndex {

	int findDiffIndex(int[] array1, int[] array2) {

		int index;
		for (index = 0; index < array1.length; index++) {

			if (array1[index] != array2[index]) {
				break;
			}
		}
		return index;
	}
	
	int findMaxValue()
	{
		UserInput ui=new UserInput();
		int[] arr1= ui.enterDataInt();
		int[] arr2= ui.enterDataInt();
		//int[] arr1 = { 10, 2, 9, 14, 3 };
		//int[] arr2 = { 10, 2, 18, 14, 3 };
		int maxValue=0;
		MaxValueAtDifferentIndex mv = new MaxValueAtDifferentIndex();
		int diffIndex = mv.findDiffIndex(arr1, arr2);
		System.out.println("Values are not matching at index " + diffIndex);
		
		
		int val1=arr1[diffIndex];
		int val2=arr2[diffIndex];
		
		if(val1>val2)
		{
			maxValue=val1;
		}
		else
		{
			maxValue=val2;

		}
		return maxValue;
	}

	public static void main(String[] args) {
		
		MaxValueAtDifferentIndex mv=new MaxValueAtDifferentIndex();
		int maxValue=mv.findMaxValue();
		System.out.println("max value is "+maxValue);
		

	}

}

