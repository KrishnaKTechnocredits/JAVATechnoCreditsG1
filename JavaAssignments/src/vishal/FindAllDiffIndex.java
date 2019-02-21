package vishal;

public class FindAllDiffIndex {

	void findDiffIndex(int[] array1,int[] array2)
	{
		
		
		for ( int index = 0; index < array1.length; index++) {

			if (array1[index] != array2[index]) 
			{
			  System.out.println("Values are not matching at index "+index);
		}
	}
	
	}

	public static void main(String[] args) 
	{
		UserInput ui=new UserInput();
		int[] arr1= ui.enterDataInt();
		int[] arr2= ui.enterDataInt();
		//int[] arr1={10,2,9,14,3};
		//int[] arr2={10,2,18,14,13};
		FindAllDiffIndex fi=new FindAllDiffIndex();
		fi.findDiffIndex(arr1, arr2);
	}

}
