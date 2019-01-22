package farhin;

public class SimpleInterest {
	public static void main(String[] a) {
		 double p=Double.parseDouble(a[0]);
		 int t=Integer.parseInt(a[1]);
		 double r=Double.parseDouble(a[2]);
		 SimpleInterest S1=new SimpleInterest();
		 System.out.println("Calculated Simple Interest is: "+S1.simpleInterestCalc(p,t,r));
		 
		 
	}
	
	public double simpleInterestCalc(double p1,int t1,double r1)
	{
		return p1*t1*r1/100;
	}
	
	

}
