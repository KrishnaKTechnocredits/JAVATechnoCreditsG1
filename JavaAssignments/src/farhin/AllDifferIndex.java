package farhin;

import java.util.Scanner;

public class AllDifferIndex {
 
	public static void main(String[] args) {
		FirstDifferIndex input=new FirstDifferIndex();
		Scanner sc=new Scanner(System.in);
		int[] firstArr=input.takeInputs("first", sc);
        int[] secondArr=input.takeInputs("second", sc);
        sc.close();
        AllDifferIndex differIndex=new AllDifferIndex();
        if(firstArr.length!=secondArr.length)   //check both array length
        {
        	System.out.println("Array length do not match");
        	return;
        }
        differIndex.findAllDifferIndex(firstArr,secondArr);
	}
	
	void findAllDifferIndex(int[] arr1,int[] arr2)
	{
		for(int index=0;index<arr1.length;index++)
		{ 
			if(arr1[index]!=arr2[index])   //check for differ index
			{
				System.out.println("Values are not matching at index-> "+index);
			}
			else
			{
				System.out.println("Values are matching at index->" +index);
			}
			
		}
	}
}
