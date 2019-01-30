package amarja2;
//Question 5 Program to find second maximum number
public class Secondmax {
	int secmaximum(int num [])
	{
		int max=num[0];int secmax = 0;
		for (int i=1;i<num.length;i++)
		{
			if (num[i]>max)
			{	secmax=max;
				max=num[i];
			}
		}
		return secmax;	
		}
	public static void main(String[] args) {
		Secondmax smax=new Secondmax();
		Takeinputarrint input = new Takeinputarrint();//Accepting array input using method
		int num[]=input.takeintegerinputuser();
		System.out.println("Second maximum number is  "+smax.secmaximum(num));
	}
}
