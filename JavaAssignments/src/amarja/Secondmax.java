package amarja;
//Question 5 Program to find second maximum number
public class Secondmax {
	int secmaximum(int num [])
	{
		int max=0;int secmax = 0;
		for (int i=0;i<num.length;i++)
		{			
			if (num[i]>max)
			{	secmax=max;
			max=num[i];
			}
			else if (num[i]>secmax &&  num[i]!=max)//	Amedned the logic as per review commets
				secmax=num[i];
			}
		return secmax;	
		}
	public static void main(String[] args) {
		Secondmax smax=new Secondmax();
		Takeinputarrint input = new Takeinputarrint();//Accepting array input using method
		int num[]=input.takeintegerinputuser();
		int secmax=smax.secmaximum(num);
		if (secmax==0)
		System.out.println("There is no second largest element");
		else
		System.out.println("Second maximum number is  "+smax.secmaximum(num));
	}
}
