package amarja;
import java.util.Scanner;
/****
WAP to find average of user given array
a. Input :- {14, 32, 19, 14, 78,36}
b. Output:- 32.16*/
 public class ArrayPrg9 {
	public static void main(String args[]){
		Scanner sr =new Scanner(System.in);
		ArrayPrg1 pr1=new ArrayPrg1();
		int [] input=pr1.input(sr);//Calling method of another class to accept int array as input
		ArrayPrg9 pr2=new ArrayPrg9();
		System.out.println("Average of array= "+pr2.findavg(input));
	}

	double findavg(int[] input) {
		double avg=0.0;
		double sum=0.0;
		for (int index=0;index<input.length;index++)
		{
			sum=sum+input[index];
			avg=sum/input.length;
		}
		return avg;
	}

}
