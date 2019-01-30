package amarja2;
//Program to convert Temperature from Fahrenheit to Degree Celcius
public class TempConversionProg {
	public static void main(String[] args) {
		TempConversionProg a= new TempConversionProg();
		a.Convertemp(Float.parseFloat(args[0]));
	}
	 void Convertemp(float tempfah) 
	 {
		 float celcius;
		 celcius=(tempfah-32)*5/9;
	     System.out.println(tempfah+" Fahrenheit = " + celcius+ "Degree Celicus" );
	 }
}
