package amarja;
//Question 4 Program to find the maximum and minimum number in array
public class Findmaxminnum {
		int maximum(int num [])
		{
			int max=num[0];
			for (int i=0;i<num.length;i++)
			{
			if (num[i]>max)
				max=num[i];
					}
			return max;				
		}
		int minimum(int num [])
		{
			int min=num[0];
			for (int i=0;i<num.length;i++)
			{
			if (num[i]<min)
				min=num[i];
					}
			return min;				
		}
		public static void main(String[] args)
		{
			Takeinputarrint input = new Takeinputarrint();//Reading inputs of array
			int num[]=input.takeintegerinputuser();
			Findmaxminnum maxmin = new Findmaxminnum();
			System.out.println("Maximum number in given array= "+ maxmin.maximum(num));//Calling maximum number method
			System.out.println("Minimum number in given array= "+ maxmin.minimum(num));//Calling minimum number method
		}
		}


