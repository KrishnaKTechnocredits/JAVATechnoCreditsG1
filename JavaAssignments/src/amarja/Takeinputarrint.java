package amarja;
import java.util.Scanner;
public class Takeinputarrint{
//Method to accepts the size of array and Integer input array	
	int [] takeintegerinputuser()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		System.out.println("Enter values of array");
		int[]num = new int[size];
		for (int index=0;index<size;index++)
		{
			num[index]=sc.nextInt();
		}
		sc.close();
		return num;
	}
}
