package amarja;
//Program to calculate simple interest
public class SimpleIntCalculator {
	public static void main(String[] args) {
		 SimpleIntCalculator a = new SimpleIntCalculator();
		 Double Priamount=Double.parseDouble(args[0]);
		 int time=Integer.parseInt(args[1]);
		 float rate=Float.parseFloat(args[2]);
		 System.out.println("Simple Interest = " + a.calSimpleInterest(Priamount,time,rate));
	}
	Double calSimpleInterest(Double priamount, int time, float rate) 
	{
		Double simint=(priamount*time*rate)/100;
		System.out.println("Principle amount= " + priamount);
		System.out.println("Time= " + time);
		System.out.println("Rate= " + rate);
		return simint;
	}
}
