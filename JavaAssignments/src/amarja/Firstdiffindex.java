package amarja;
import java.util.Scanner;
//Question 8 Program to find first different index from given array
public class Firstdiffindex {
		public static void main(String args[])
		{		Scanner sc=new Scanner(System.in);//Reading the size and values of array 1
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
				for (int index=0;index<size2;index++)
				{
					num2[index]=sc.nextInt();
				}
				sc.close();
				Firstdiffindex diff=new Firstdiffindex();
				diff.finddiffarrind(num1,num2);
		}
		void finddiffarrind(int num1[],int num2[])
		{				for  (int index=0;index<num1.length;index++)
						{
						if (num1[index]!= num2[index])
						{	
							System.out.println("Values are not matching at index " +index);	
							break;	
						}				
						}
						Equalarrays eq = new Equalarrays();
						if (eq.findeqarr(num1,num2)==true)
						System.out.println("Values are  matching at all index ");	
			}
}


