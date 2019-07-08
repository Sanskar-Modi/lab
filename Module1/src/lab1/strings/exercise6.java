package lab1.strings;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class exercise6 {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter date in dd-MM-yyyy");
		String s = sc.nextLine();
		
		//formatting date
		DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date=(Date)formatter.parse(s);
		
		Date sysDate = new Date();
		duration (date,sysDate);

		sc.close();
	}

	static void duration(Date date1, Date date2) {
		
		
	int year_diff =date2.getYear() -date1.getYear();
	year_diff = Math.abs(year_diff);
	int mon_diff = date2.getMonth() - date1.getMonth();
	mon_diff =Math.abs(mon_diff);
	int days_diff =date2.getDate() - date1.getDate();
	days_diff = Math.abs(days_diff);
	
	
	System.out.println("Days difference "+days_diff);
	System.out.println("Month difference "+mon_diff);
	System.out.println("Year difference "+year_diff);
	

	}
}
