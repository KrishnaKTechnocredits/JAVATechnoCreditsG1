package farhin;

public class FahrenheitToCelcius {
	public static void main(String[] a) {
		double f=Double.parseDouble(a[0]);
		FahrenheitToCelcius f1=new FahrenheitToCelcius();
		System.out.println("Entered Farenheit is: "+f);
		System.out.println("Farenheit to celcius conversion is: "+f1.conversion(f));
		
	}
	
public double conversion(double val)
{
	return (val-32)*5/9;
	}


}
