package rahulV;

import java.util.Scanner;

public class Assignment2_Q1 {


	int findMissing(int[] num) { // method to find missing number

		int n = num.length;

		int expectedSum = n * (n + 1) / 2;
		int ActualSum = 0;
		for (int array_index = 0; array_index < num.length; array_index++) {
			ActualSum += num[array_index];
		}

		int missingNum = expectedSum - ActualSum;
		return missingNum;
	}

	public static void main(String[] args) {

		Inputfromuser missingnumber = new Inputfromuser();
		int[] num = missingnumber.takeInputFromUserInt();
		Assignment2_Q1 findmissing = new Assignment2_Q1();
		int ans = findmissing.findMissing(num);
		System.out.println("Missing number is : " + ans);

	}

}
