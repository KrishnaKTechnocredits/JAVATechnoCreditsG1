package vishal;

import java.util.Scanner;

public class ClientCircle {

	public static void main(String[] args) {
		Circle cr = new Circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		int radius = sc.nextInt();
		if (radius > 0) {
			cr.setRadius(radius);
			cr.areaCircle();
			cr.circumferenceCircle();
		} else {
			System.out.println("Radius should be greater than 0");
		}

	}

}
