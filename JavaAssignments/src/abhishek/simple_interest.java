package abhishek;

public class simple_interest {
	
	static double simpleInterest(double P,double T,double R) {
		return ((P*T*R)/100);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(simpleInterest(100, 3.5, 7.8));
		
	}

}
