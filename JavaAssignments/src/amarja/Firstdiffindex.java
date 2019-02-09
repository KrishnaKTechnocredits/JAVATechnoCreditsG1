package amarja;
import java.util.Scanner;
//Question 8 Program to find first different index from given array
public class Firstdiffindex {
		public static void main(String args[])
		{		Scanner sc2=new Scanner(System.in);
				Equalarrays check =new Equalarrays();
				int [] num1=check.inputarray(sc2);//Incorporate review comments to take input array using function
				int [] num2=check.inputarray(sc2);
				sc2.close();
				Firstdiffindex diff=new Firstdiffindex();
				if (diff.finddiffarrind(num1,num2)== true)//Added return type as suggested to enhance the logic as per comments
					System.out.println("Values are  matching at all index ");
		}
		boolean finddiffarrind(int num1[],int num2[])
		{				for  (int index=0;index<num1.length;index++)
						{
						if (num1[index]!= num2[index])
						{	
							System.out.println("Values are not matching at index " +index);
							return false;
						}				
						}
						return true;
						
		}
}


