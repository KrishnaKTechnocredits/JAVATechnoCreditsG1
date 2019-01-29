package vishal;

public class MissingNumLinearSeries {
	
	int missingNo()
	{
		int a[]={2,4,6,10,12};
		int diff=a[1]-a[0];
		int value=0;
		
		for(int index=0;index<a.length;index++) 
		{
			if((a[index]+diff)!=(a[index+1])) //checking next number is sum of previous no and difference between two numbers
			{
				value=a[index]+diff;
				break;
			}
		}
		
		return value;
	}
	

	public static void main(String[] args) 
	{
		MissingNumLinearSeries mn=new MissingNumLinearSeries();
		System.out.println("Missing No. is "+mn.missingNo());

	}

}
