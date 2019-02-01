
package saket;

import java.util.Scanner;

public class Missingnumber {
	
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number of Element");
	
	int size=sc.nextInt();

	int[]a=new int[size];
	
	System.out.println("Enter the input for missing number");
	
	for(int i=0;i<a.length;i++)
	{
	
		a[i]=sc.nextInt();
	 
	}
	
	int expectednumberofinput=a.length+1;
	int sum=0;
	int expectedsum=((expectednumberofinput)*(expectednumberofinput+1)/2);
	
	for(int index=0;index<a.length;index++)
	{
	
	sum=sum+a[index];
	}
	
	
	int missingnumber=expectedsum-sum;
	System.out.println("missing number is"+ missingnumber);
	
}
}