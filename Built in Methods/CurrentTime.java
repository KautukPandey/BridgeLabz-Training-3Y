package Day8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current Date & Time of GMT" + gmt.format(formatter));

        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current Date & Time of IST " + ist.format(formatter));

        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current Date & Time of PST " + pst.format(formatter));
    }

}
