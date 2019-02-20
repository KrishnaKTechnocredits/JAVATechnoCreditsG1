package rahulV;

import java.util.Scanner;

public class Assignment3_Q15 {

	String mrName;
	int duration;

	void bookMeetingRooom() {
		System.out.println("Nalanda room is booked for 1 hour");
	}

	void bookMeetingRooom(String mrName, int duration) {
		this.mrName = mrName;
		this.duration = duration;
	}

	void displayInfo() {
		System.out.println("Meeting room booked: " + mrName + " Duration: " + duration + " hours");
	}

	public static void main(String[] args) {
		Assignment3_Q15 meetingroom = new Assignment3_Q15();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of meeting room:");
		String mrName = scanner.next();

		if (mrName.equals("Nalanda")) {
			meetingroom.bookMeetingRooom();
		} else {
			System.out.println("Enter the duration for which meeting room is booked: ");
			int duration = scanner.nextInt();
			meetingroom.bookMeetingRooom(mrName, duration);
			meetingroom.displayInfo();
		}
	}

}
