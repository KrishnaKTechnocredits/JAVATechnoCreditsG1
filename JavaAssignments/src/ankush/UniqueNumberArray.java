package ankush;

public class UniqueNumberArray {

	static int count=0;
	static boolean setZeroFlag=false;
	void findUnique(int resultArray[], int temp) {
		boolean flag=false;
		
		for (int i = 0; i < resultArray.length; i++) {
			if(resultArray[i]==temp)
			{
				flag=true;
				break;
			}
		}
		if(temp==0 && setZeroFlag==false)
		{
			resultArray[count]=temp;
			setZeroFlag=true;
			count++;
	
		}
		if (flag==false)
		{
			resultArray[count]=temp;
			count++;
		}

	}
	
	static void displayIntArray(int[] resultArray)
	{
		for(int i=0;i<count;i++)
		{
			System.out.println(resultArray[i]);
		}
	}

	public static void main(String[] args) {
		int[] firstArray = { 3, 7, 9, 1,0, 3, 4 };
		int[] secondArray = { 9, 11, 1,0, 14 };
		int resultArray[] = new int[firstArray.length + secondArray.length];

		
		UniqueNumberArray uniNumb = new UniqueNumberArray();

		for (int i = 0; i < firstArray.length; i++) {
			uniNumb.findUnique(resultArray, firstArray[i]);
		}
		for (int i = 0; i < secondArray.length; i++) {
			uniNumb.findUnique(resultArray, secondArray[i]);
		}
		
		displayIntArray(resultArray);
	}
}
