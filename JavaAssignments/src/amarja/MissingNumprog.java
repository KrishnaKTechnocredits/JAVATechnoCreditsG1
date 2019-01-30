package amarja;
import java.util.*;
//Question 1 Missing Number in integer array of 1 to 10
public class MissingNumprog {
	int missingnum(int num[]) //Finding missing number by expected sum - actual sum logic
	{	int expsum=0;int actsum=0;
		int missingnum;
		expsum=num.length*(num.length+1)/2;//Calculating expected sum of numbers
		for (int index=0;index<num.length-1;index++)//Calculating actual sum of numbers
		{
			actsum=actsum+num[index];
		}
		missingnum=expsum-actsum;
		return missingnum;
	}
	public static void main(String args[])
	{
		int num[] =new int[10];
		Scanner sr= new Scanner(System.in);
		System.out.println("Enter any 9 numbers from 1 to 10");
		for (int index=0;index<num.length-1;index++)//Reading 9 numbers from user one number is missing
		{
			num[index]=sr.nextInt();
		}
		sr.close();
		MissingNumprog misnum =new MissingNumprog();
		System.out.println("Missing number in array ="+ misnum.missingnum(num));
	}
}

