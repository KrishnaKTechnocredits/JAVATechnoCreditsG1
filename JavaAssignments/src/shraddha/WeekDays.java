//---------------------------------------------------------------------------------------------------------------------------
//Assignment:Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and
//displays the name of the weekday. (use switch case).
//---------------------------------------------------------------------------------------------------------------------------


package shraddha;

import java.util.Scanner;

public class WeekDays {
	
	void weekDays(int weeknum)
	{
		switch(weeknum)
		{
		case 0: System.out.println("Hey its Sundayyy...!!!!");
		break;
		case 1: System.out.println("Monday Bluesss...o_O..!!!!");
		break;
		case 2: System.out.println("Tuesday get back to work");
		break;
		case 3: System.out.println("Wednesday two more days to go :(");
		break;
		case 4: System.out.println("Thursday... Only one day to Go");
		break;
		case 5: System.out.println("Happy Fridayyyyyy...!!!!!");
		break;
		case 6: System.out.println("Yupiii.. its Weekend finallyyy..!!");
		break;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int weeknum = (sc.nextInt()%7);
		new WeekDays().weekDays(weeknum);
		
	}

}
