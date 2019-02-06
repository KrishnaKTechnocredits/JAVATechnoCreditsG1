package ankush;

public class DuplicateNumber {

	void FindDuplicateNumber()
	{
		int temp;
		DynamicInputArray dynamicArray=new DynamicInputArray();
		
		int dyArray[]=dynamicArray.intArray();
		FindMaxNumber maxValue=new FindMaxNumber();
		int arrayCount=maxValue.findMaxNumber(dyArray);
		int localArray[]=new int[arrayCount+1];
		for(int index=0;index<dyArray.length;index++)
		{
			temp=dyArray[index];
			localArray[temp]=localArray[temp]+1;
			
		}
		for(int index=0;index<localArray.length;index++)
		{
			if (localArray[index]>1)
			{
				System.out.print("Duplicate Number : "+index);
				System.out.println("  Count : "+localArray[index]);
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
		DuplicateNumber ia=new DuplicateNumber();
		ia.FindDuplicateNumber();
		
	}		
}
