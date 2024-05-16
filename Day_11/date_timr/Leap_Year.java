package date_timr;

import java.time.LocalDate;
import java.time.Year;

public class Leap_Year {
//Using isleap() method
	public static void main(String[] args) {
		int currentYear = LocalDate.now().getYear();
	    boolean isCurrentLeapYear = Year.of(currentYear).isLeap();
	    System.out.println("current  year  is " +currentYear + "  is a leap year: " + isCurrentLeapYear);
	
	//without using isLeap()
	    
	    
	    
	    int year1 = 2100;

	    // Q .Check if the year is a leap year
	    if (year1 % 4 == 0 && ((year1 % 100 != 0) || (year1 % 400 == 0))) {
	        System.out.println(year1 + " is a leap year.");
	    } else {
	        System.out.println(year1 + " is not a leap year.");
	    }
	}

}
