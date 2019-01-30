package amarja2;
import java.util.Scanner;
//import java.util.Scanner;
public class Equalarrays {
	boolean findeqarr(int num1[],int num2[])
	{	boolean flag=false;
		if (num1.length != num2.length)
			return flag;
		else 
			{
				for (int index=0;index<num1.length;index++)
				{
					if (num1[index]== num2[index])
							flag=true;
					else
							flag=false;
				}
			}			
		return flag;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//Reading the size and values of array 1
		System.out.println("Enter size of first array:");
		int size1=sc.nextInt();
		System.out.println("Enter values of first array:");
		int[]num1 = new int[size1];
		for (int index=0;index<size1;index++)
		{
			num1[index]=sc.nextInt();
		}
		System.out.println("Enter size of second array:");//Reading the size and values of array 1
		int size2=sc.nextInt();
		System.out.println("Enter values of second array:");
		int[]num2 = new int[size2];
		for (int count=0;count<size2;count++)
		{
			num2[count]=sc.nextInt();
			System.out.println(num2[count]);
		}
		sc.close();
		Equalarrays check =new Equalarrays();
		if (check.findeqarr(num1,num2)==true)
			System.out.println("Two Arrays are Equal.");
		else
			System.out.println("Two Arrays are Not Equal.");
	}
}
