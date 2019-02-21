package farhin;

public class LargestSmallestNum {
	
	public static void main(String[] args) {
		DuplicateNum input=new DuplicateNum();
		int[] arrNum=input.takeInputs();
		LargestSmallestNum largestSmallestNum=new LargestSmallestNum();
		int maxNum=largestSmallestNum.findLargestNum(arrNum);
		int minNum=largestSmallestNum.findSmallestNum(arrNum,maxNum);
		System.out.println("largest number from array is: "+maxNum+" and smallest number from array is: "+minNum);
	}
	
	
	int findLargestNum(int[] arrNum)
	{
		int max=0;
		for(int index=0;index<arrNum.length;index++)
		{
			if(arrNum[index]>max)
			{
				max=arrNum[index];
			}
		}
		return max;
	}
	
	int findSmallestNum(int[] arrNum,int maxNum)
	{
		int minNum=0;
		for(int index=0;index<arrNum.length;index++)
		{
			if(arrNum[index]<maxNum)
			{
				minNum=arrNum[index];
			}
		}
		return minNum;
	}
}
