package ankush;

public class MissingNumber {

	void PatternFinder()
	{
		int temp;
		DynamicInputArray dynamicArray=new DynamicInputArray();
		
		int dyArray[]=dynamicArray.intArray();
		for(int index=1;index<dyArray.length;index++)
		{
			temp=dyArray[index]-dyArray[index-1];
			if(temp!=2)
			{
				System.out.println("Missing Number : "+(dyArray[index]-2));;
			}
			
		}
	}
	
	public static void main(String[] args) {
		MissingNumber ia=new MissingNumber();
		ia.PatternFinder();
		
	}
}
