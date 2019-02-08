package amarja;
//Create another class as ClientCircle and call the respective methods*/
public class ClientCircle  {
	public static void main(String args[])
	{
		Circle cr=new Circle();
		System.out.println("Area = "+ cr.area(cr.radius));
		System.out.println("Circumference = " +cr.circum(cr.radius));
	}
}
