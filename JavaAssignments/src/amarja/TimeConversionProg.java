package amarja;
// Program to convert seconds into Hours,Minutes and seconds
public class TimeConversionProg {
	public static void main (String [] args)
	{
		TimeConversionProg a = new TimeConversionProg();
		a.convsectohmin(Integer.parseInt(args[0]));
	}
	void convsectohmin(int secs)
	{
		int hour;int min;
		min=secs/60;
		
		if (min ==60)
			hour=(min/60)+1;
		else
			hour=min/60;
		int remin=min%60;
		int remsec=secs%60;
		System.out.println(secs +" Seconds =" + hour +" Hours:" +remin+"Minutes:"+remsec +"seconds");
		}
		}
	


