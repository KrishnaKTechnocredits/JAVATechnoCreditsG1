package saket;

public class uniquenum {
	
	public static void main(String[] args) {
	
	int[] firstarray={1,2,3,4,2,5};
	int[] secondarray={5,6,7,8,9,7};
	
	
	
	unique(firstarray,secondarray);
	
	}
	
	static void unique(int[]a,int[]b)
{
		int[] uniquearray=new int [6];
	
	for(int i=0;i<=a.length-2;i++)
		
	{
	
		for(int j=0;j<=b.length-1;j++)
		{
			
			if(a[i]==a[i+1])
			{
	         
				System.out.println(a[i]);
	
			}	

}
}}}