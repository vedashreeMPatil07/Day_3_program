package date_timr;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
public class Continue_Time_print {

	public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {
           
            LocalTime now = LocalTime.now(); //current local time
            
            String formattedTime = now.format(formatter); // Format the time as a string

            
            System.out.println(formattedTime);
            
            try {
                TimeUnit.SECONDS.sleep(1); //sleep for 1 sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
	}

}
