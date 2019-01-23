package mayur;

public class TimeConversion
{
	public static void main(String args[]) 
	{
		int seconds = Integer.parseInt(args[0]);
		TimeConversion t = new TimeConversion();
		t.convert(seconds);
	}

	void convert(int seconds) 
	{
		int h = seconds / 3600; //Convert seconds to Hour
		int m = ((seconds % 3600) / 60); //Convert Seconds to minute
		int s = (seconds % 60); //Remaining Seconds
		System.out.println(+seconds + "Seconds = " + h + "H:" + m + "M:" + s + "S");
	}
}