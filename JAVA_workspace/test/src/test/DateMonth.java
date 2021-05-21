package test;

import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMonth {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		int m=4;
		DateFormatSymbols dfs = new DateFormatSymbols();
	    String[] months = dfs.getMonths();
	    if (m >= 0 && m <= 11 ) {
	        System.out.println(months[m-1]);
	    }
	    
	    Date date = new SimpleDateFormat("MMMM").parse("May");
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(date);
	    System.out.println(cal.get(Calendar.MONTH));
	}

}
