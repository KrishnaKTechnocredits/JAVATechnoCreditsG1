package vishal;

public class UniqueNumber {

	public static void main(String[] args) 
	{
     int[] arr1={1,2,3,4,2,5};
     int[] arr2={5,6,7,8,9,7};
     int length=arr1.length+arr2.length;
     int[] uniqueArray=new int[length];
     
     for(int index1=0;index1<arr1.length;index1++)
     {
    	 for(int index2=1;index2<arr1.length;index2++)
    	 {
    		 if(arr1[index1]==arr1[index2])
    		 {
    			 index2=index2+1;
    			 break;
    		 }
    		 else
    		 {
    			 uniqueArray[index1]=arr1[index1];
              break;    		
             }
    	 }
     }
     
     for(int i=0;i<length;i++)
     {
     System.out.println(uniqueArray[i]);
     }
		
	}

}
