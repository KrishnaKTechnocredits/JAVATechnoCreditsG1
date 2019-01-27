package farhin;

public class AreaPerimeter {
	public static void main(String[] a) {
		if (a[0].equals("rectangle")) {
			System.out.println("Calculate area and perimeter for rectangle");
			rectangle(a[1], a[2]);
		} else  if (a[0].equals("circle")) {
			System.out.println("Calculate area and perimeter for circle");
			circle(a[1]);
		}
		
	}

	public static void rectangle(String l, String w) {
		Double l1 = Double.parseDouble(l);
		Double w1 = Double.parseDouble(w);
		System.out.println("Area of rectangle is:" + (l1 * w1));
		System.out.println("Perimeter of rectangle is: " + 2 * (l1 + w1));
	}
	
	public static void circle(String r)
	{
		Double x=3.14;
		Double r1=Double.parseDouble(r);
		System.out.println("Area of circle is: "+(x*r1*r1));
		System.out.println("Perimeter of circle is: "+(2*x*r1));
	}

}
