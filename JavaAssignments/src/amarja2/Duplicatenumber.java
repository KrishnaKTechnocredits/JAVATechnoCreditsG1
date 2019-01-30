package amarja2;
//Question 2 Program to find duplicate number from given array of given length
public class Duplicatenumber {
	public static void main (String [] args)
	{
		Takeinputarrint input = new Takeinputarrint();
		int num[]=input.takeintegerinputuser();
		Duplicatenumber dupnum= new Duplicatenumber();
		int dupnum1[]=dupnum.finddupnum(num);
		for (int index=0;index<dupnum1.length;index++)
		{
			if (dupnum1[index]>1)
			System.out.println("The Duplicate number is ="+index);
		}
	}	
	int[] finddupnum(int num[])//Method to find duplicate no using dynamic programming
	{
		Findmaxminnum findmaxnum= new Findmaxminnum();//Finding the max no to define the length of temporary array
		int max=findmaxnum.maximum(num);
		int temp[]= new int[max+1];
		for (int index=0;index<num.length;index++)//Incrementing the temp array at the num arrays index
		temp[num[index]]=temp[num[index]]+1;		
		return temp;
	}
}


