package amarja;

/****
WAP to find average of user given array
a. Input :- {14, 32, 19, 14, 78,36}
b. Output:- 32.16*/
import java.util.ArrayList;
import java.util.Scanner;

public class Collection9 {
	public static void main(String args[]) {
		Collection9 c9 = new Collection9();
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		a1 = c9.userinput(sc);
		System.out.println("Average of array= " + c9.findavg(a1));
	}

	double findavg(ArrayList<Integer> a1) {
		double avg = 0.0;
		double sum = 0.0;
		for (int index = 0; index < a1.size(); index++) {
			sum = sum + a1.get(index);
			avg = sum / a1.size();
		}
		return avg;
	}

	ArrayList<Integer> userinput(Scanner sc) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		System.out.println("Enter integer values");
		System.out.println("Please write '0000' to END");
		int temp = sc.nextInt();
		do {
			l1.add(temp);
			temp = sc.nextInt();
		} while (temp != 0000);
		return l1;
	}

}
