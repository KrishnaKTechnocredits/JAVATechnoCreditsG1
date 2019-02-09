package amarja;
import java.util.Scanner;
public class Equalarrays {
	boolean findeqarr(int num1[],int num2[])
	{	boolean flag=false;
		if (num1.length != num2.length)
			return flag;
		else 
		{		for (int index=0;index<num1.length;index++)
				{
					if (num1[index]== num2[index])
					{
							flag=true;
							break;//incorporated break statement as suggested
					}
					else
							flag=false;
				}
			}			
		return flag;	
	}
	int [] inputarray(Scanner sc2)//As per review comments created seperate method
	{
		System.out.println("Enter size of  array:");
		int size1=sc2.nextInt();
		System.out.println("Enter values of array:");
		int[]num1 = new int[size1];
		for (int index=0;index<size1;index++)
		{
			num1[index]=sc2.nextInt();
		}
		return num1;
	}
	public static void main(String[] args) {
		Scanner sc2=new Scanner(System.in);
		Equalarrays check =new Equalarrays();
		int [] num1=check.inputarray(sc2);
		int [] num2=check.inputarray(sc2);
		sc2.close();
		if (check.findeqarr(num1,num2)==true)
			System.out.println("Two Arrays are Equal.");
		else
			System.out.println("Two Arrays are Not Equal.");
	}
}
