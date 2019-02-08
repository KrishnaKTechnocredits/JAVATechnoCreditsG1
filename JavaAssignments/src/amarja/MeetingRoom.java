package amarja;
import java.util.Scanner;
/*Create a class MeetingRoom having method bookMeetingRoom which should provide
below facility.meeting room : Nalanda, Takshashila, AgraFort, PratapGadh
a. “Nalanda” meeting room will be booked with default bookMeetingRoom() method
for 1 hr.
b. Write another method which helps to book Other then “Nalanda” meeting room by
giving name of meeting room and hrs as parameter.
c. displayInfo method should print booked meeting room info [i.e. meeting room,
booked for how many hrs].*/
public class MeetingRoom {
	void bookMeetingRoom()
	{
		displayInfo("Nalanda",1);
	}
	void bookMeetingRoom(String mroom,int duration)
	{
		switch (mroom)
		{
			case "Takshashila":
					mroom ="Takshashila";
					displayInfo(mroom,duration);	
					break;
			case "AgraFort":
					mroom ="AgraFort";
					displayInfo(mroom,duration);
					break;
			case "PratapGadh":
					mroom ="PratapGadh";
					displayInfo(mroom,duration);
					break;
			default: System.out.printf("Error! No such meeting room exists");
	                return;		
		}	
	}
	void displayInfo(String mroom,int duration)
	{
		System.out.println("Meeting room "+ mroom + " is booked for  "+ duration +" hours ");
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		MeetingRoom book= new MeetingRoom();
		System.out.println("To book Default meeting Room Enter 0 :");
		System.out.println("To book Specific meeting Room Enter 1 :");
		switch (sc.nextInt())
		{   case 0://Booking default meeting room
				book.bookMeetingRoom();
				break;
			case 1://Booking specific room for specific duration
				System.out.println("Please enter the meeting room to be booked.");
				String mroom =sc.next();
				System.out.println("Enter the duration for meeting room to be booked in hours.");
				int duration=sc.nextInt();
				book.bookMeetingRoom(mroom,duration);
				break;
			default:
				System.out.println("Error !! Menu item does not exists.");
		}
		sc.close();
	}
}
