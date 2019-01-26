package ankush;


public class FindMaxNumber {


	int findMaxNumber(int[] x)
	{
		int max=0;
		for(int i=0;i<x.length;i++)
		{
			if (max<x[i])
			{
				max=x[i];
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) 
	{
		InputOperations ip=new InputOperations();
		int[] num=ip.takeInputsFromUser();
		FindMaxNumber fmn=new FindMaxNumber();
		
		int ans=fmn.findMaxNumber(num);
		System.out.println(ans);
	
	}
}
	