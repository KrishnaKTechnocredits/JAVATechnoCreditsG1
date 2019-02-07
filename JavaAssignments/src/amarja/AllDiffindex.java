package amarja;
import java.util.Scanner;
//Question 9 Program to find all different index from given array
public class AllDiffindex {
	public static void main(String args[])
	{		Scanner sc2=new Scanner(System.in);
			Equalarrays check =new Equalarrays();
			int [] num1=check.inputarray(sc2);//Calling function to accept array input from user
			int [] num2=check.inputarray(sc2);
			sc2.close();
			AllDiffindex diff=new AllDiffindex();
			diff.findeqarrind(num1,num2);	//Function to find all different index
	}
	void findeqarrind(int num1[],int num2[])
	{	
				if (num1.length >= num2.length)
				{				
					for (int index=0;index<num2.length;index++)
					{
						if (num1[index]!= num2[index])
						System.out.println("Values are not matching at index ->" + index);	
					}	
				}
				else
					if (num2.length >= num1.length)
				{
						for (int index=0;index<num1.length;index++)
						{
							if (num1[index]!= num2[index])
							System.out.println("Values are not matching at index ->" + index);	
						}
				}
	}
}
