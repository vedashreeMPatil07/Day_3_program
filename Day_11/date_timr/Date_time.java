package date_timr;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Date_time {

	public static void main(String[] args) {
LocalDate date=LocalDate.now();
System.out.println("curreent local date:  " +date); 

LocalDate date1 =LocalDate.from(ZonedDateTime.now());
System.out.println("local date form zonedDateTime:  " +date1);

LocalTime lt= LocalTime.from(ZonedDateTime.now());
	System.out.println("local time form zonedDateTime:  " +lt);
	
	
String s="1995-05-11";
	DateTimeFormatter dtf =DateTimeFormatter.ofPattern("MM-dd-yyyy");
	LocalDate ld2=LocalDate.now();
	String s1=ld2.format(dtf);
	System.out.println("Formatted current date:  " +s1);
	
LocalDate ld3=LocalDate.parse(s);
String s2=ld3.format(dtf);
System.out.println("Formatted parse LocalDate:"  +s2);
	
	
	

    
    
    
    
    
	
	}

}
