package ankush;

public class CountVisibleObject {
	int printTree()
	{
		int treecount=1;
		DynamicInputArray ia=new DynamicInputArray();
		int temp[]=ia.intArray();
		int maxValue=temp[0];
		for (int index=0;index<temp.length;index++)
		{
			if(maxValue<temp[index])
			{
				maxValue=temp[index];
				treecount++;
			}
		}
		return treecount;
	}
	
		
	public static void main(String[] args) {
		CountVisibleObject ia=new CountVisibleObject();
		int count=ia.printTree();
		System.out.println(count);
	}		
}
