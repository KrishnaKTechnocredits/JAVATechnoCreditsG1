package vishal;

import java.util.Scanner;

public class WeekDay {
	
	String Day="";
	public String weekDay(int num)
	{
		switch(num)
		{
		case 1:
			Day="Monday";
			break;
		case 2:
			Day="Tuesday";
			break;
		case 3:
			Day="Wednesday";
			break;
		case 4:
			Day="Thursday";
			break;
		case 5:
			Day="Friday";
			break;
		case 6:
			Day="Saturday";
			break;
		case 7:
			Day="Sunday Funday";
			break;
			default:
				System.out.println("Please enter a valid day number");
			
		
		
		}
		return Day;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a day number");
		int day=sc.nextInt();
		
		WeekDay wd=new WeekDay();
		String dayName=wd.weekDay(day);
		if(day<7&&day>0){
		System.out.println(+day+" "+dayName);
		}
		else
		{
			System.out.println("Range should be between 1 to 7");
		}
		

	}

}
