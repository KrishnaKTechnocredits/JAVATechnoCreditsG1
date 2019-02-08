package mayur;

import java.util.Scanner;

public class NoOfThreeVisible {
	public static void main(String[] args) {
		NoOfThreeVisible noOfThreeVisible = new NoOfThreeVisible();
		int[] num = noOfThreeVisible.takeInputFromUserInt();
		int ans = noOfThreeVisible.findMaxNum(num);//
		System.out.println("No Of tree's visible : " + ans);
	}

	int[] takeInputFromUserInt() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of tree:");
		int size = sc.nextInt();
		System.out.println("Enter " + size + "numbers:");
		int[] num = new int[size];
		for (int index = 0; index < num.length; index++) // for loop to store console input in array.
		{
			num[index] = sc.nextInt();
		}
		sc.close();
		return num;// returning size of array.
	}

	int findMaxNum(int[] num) // function to compare numbers
	{
		int count = 0;
		int max = 0;
		for (int index = 0; index < num.length; index++) {
			if (max < num[index]) {
				max = num[index];
				count = count + 1;
			}
		}
		return count; // returning total number of trees visible
	}
}