package amarja;
/***WAP to find number is Armstrong or not.
a. Int number = 153
i. Number is Armstrong
b. Int number = 234
i. Number is not Armstrong
Note :- Armstrong number means sum of each number cubes to number
it self.
 */
import java.util.Scanner;

public class ArrayPrg13 {
	public static void main(String args[])
	{		
		Scanner sr=new Scanner(System.in);//
		ArrayPrg13 pr1=new ArrayPrg13();
		System.out.println("Enter the number:");//Read the number
		int no=sr.nextInt();		
		if((no)==pr1.findarmstrong(no))//Comparing the values of the no and rev no
			System.out.println("Number "+no+" is Armstrong number");
		else
			System.out.println("Number "+no+" is not an Armstrong number");
		sr.close();
	}

	 int findarmstrong(int no) {
		 int armstno=0; String s=no+"";
		 for(int index=0;index<=s.length();index++)
		  {
			armstno=armstno+((no%10)*(no%10)*(no%10));
			 no=no/10;			  		
		  }		
		 	return armstno;
		
			
	}

}
