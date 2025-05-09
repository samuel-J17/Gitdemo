
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calendardemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf2 = new SimpleDateFormat("m/d/yyy hh:mm:ss");
	System.out.println(sdf2.format(cal.getTime()));

	System.out.println(cal.get(Calendar.DAY_OF_MONTH));		
	System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	System.out.println(cal.get(Calendar.AM_PM));

	}

}
