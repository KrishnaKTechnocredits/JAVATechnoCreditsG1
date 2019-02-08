package vishal;

import java.util.Scanner;

public class MeetingRoom {
	int time;
	Scanner sc = new Scanner(System.in);

	public boolean checkRoomStatus() {
		System.out.println("\nEnter true if room you are looking for is empty else enter false.");
		boolean isRoomEmpty = sc.nextBoolean();
		return isRoomEmpty;
	}

	public boolean bookMeetingRoom() {

		boolean status = checkRoomStatus();

		if (status == true) {
			System.out.println("Congrates You have booked Nalanda successfully.");
		} else {

			displayInfo("Nalanda", 1);

		}
		return status;
	}

	public boolean bookMeetingRoom(String roomName, int time) {

		boolean status = checkRoomStatus();

		if (status == true) {
			System.out.println("Successfully Booked " + roomName + " for " + time + " Hrs");

		} else {

			displayInfo(roomName, time);

		}

		return status;
	}

	public void displayInfo(String roomName, int time) {
		System.out.println("Sorry " + roomName + " is already booked for " + time + "Hrs. You can check another room");
	}

	public static void main(String[] args) {
		MeetingRoom mr = new MeetingRoom();

		boolean status = true;
		status = mr.bookMeetingRoom();

		if (status == false) {
			status = mr.bookMeetingRoom("Takshila", 1);
		}
		if (status == false) {
			status = mr.bookMeetingRoom("Agra Fort", 2);
		}
		if (status == false) {
			status = mr.bookMeetingRoom("Pratap gad", 1);
		}
		if (status == false) {
			System.out.println("All rooms are occupied");
		}

	}

}