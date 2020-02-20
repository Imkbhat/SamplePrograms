import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.*;
import java.text.ParseException;

public class DifferenceBetween2Dates
{
	public static void main(String[] args) {
    
    String dateStart = "01/01/20 09:29:58";
    String dateStop = "01/01/20 09:33:43";
    
    SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

    Date d1 = null;
    Date d2 = null;
    try {
        d1 = format.parse(dateStart);
        d2 = format.parse(dateStop);
    } catch (ParseException e) {
        e.printStackTrace();
    }
        
        long diff = d2.getTime() - d1.getTime();
	//In Java 8, Using TimeUnit package in java.util.concurrent package, TimeUnit is Enum
        long minutes = TimeUnit.MILLISECONDS.toMinutes(diff);
	long hours = TimeUnit.MILLISECONDS.toHours(diff);
	//In Case of Java 6 and 7, 
	long minutes = diff/(60*1000);
	long hours = diff/(60*60*1000);
	System.out.println(hours +"=============="+minutes);
	}
}
