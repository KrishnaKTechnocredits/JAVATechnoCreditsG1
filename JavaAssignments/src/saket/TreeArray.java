package saket;


import java.util.Scanner;

public class TreeArray {

	public static void main(String[] args) {

		System.out.println("Enter number of trees");
		Scanner sc = new Scanner(System.in);
		int totaltrees = sc.nextInt();

		int[] numoftotaltrees = new int[totaltrees];
		System.out.println("Enter tree hight");
		for (int i = 0; i < numoftotaltrees.length; i++) {
			numoftotaltrees[i] = sc.nextInt();
		}
		
		System.out.println("values taken");
		TreeArray ts = new TreeArray();
		
		int totalcount = ts.count(numoftotaltrees);
		
		System.out.println("count" + totalcount);
		

	}

	int count(int[] x)

	{
		int count = 0;
		int max = 0;

		for (int i = 0; i < x.length; i++) {

			if (x[i] > max) 
			{	
				max = x[i];
				count = count+1;
							}
			if (x[i] < max) 
			{	
				int TEMP=0;
			}
			
			
		}
		return count;
		

	}
}