package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program1 {

	public static void main(String[] args) {
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		 
		 SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 sdf1.setTimeZone(TimeZone.getTimeZone("GMT"));
		 
		 System.out.println(sdf.format(d));
		 
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(d);
		 cal.add(Calendar.HOUR_OF_DAY, 4);
		 
		 int minutes = cal.get(Calendar.MINUTE);
		 int month = 1 + cal.get(Calendar.MONTH);
		 Date f = new Date();
		 System.out.println("f: " + sdf1.format(f));
		 System.out.println("minutes: "+minutes);
		 System.out.println("Month: "+month);		 
		 System.out.println(sdf.format(d));

	}

}
