package saket;

public class Meetingroom {

	public static void main(String[] args) {

		String meetingroom1 = "Nalanda";
		String meetingroom2 = "Takshashila";
		String meetingroom3 = "Agrafort";
		String meetingroom4 = "Pratapgadh";

		bookmeetingroom(meetingroom4,2,4,"a");

	}

	static void bookmeetingroom() {

		displayinfo();

	}

	static void bookmeetingroom(String meetingroom, int numberofhours) {

		displayinfo(meetingroom, numberofhours);

	}

	static void bookmeetingroom(String meetingroom, int numberofhours, int floor) {

		displayinfo(meetingroom, numberofhours, floor);

	}

	static void bookmeetingroom(String meetingroom, int numberofhours, int floor, String unit) {

		displayinfo(meetingroom, numberofhours, floor, unit);

	}

	static void displayinfo()

	{
		System.out.println("Nalanda meeting room booked for 1 hour");
	}

	static void displayinfo(String meetingroom, int numberofhours)

	{
		System.out.println(meetingroom + " meeting room booked for " + numberofhours + " hour");
	}

	static void displayinfo(String meetingroom, int numberofhours, int floor)

	{
		System.out.println(meetingroom + " meeting room booked for " + numberofhours + " hour on floor " + floor);
	}

	static void displayinfo(String meetingroom, int numberofhours, int floor, String unit)

	{
		System.out.println(
				meetingroom + " meeting room booked for " + numberofhours + " hour on floor and unit  " + floor + ""+unit);
	}

}
