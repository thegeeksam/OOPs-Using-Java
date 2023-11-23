package Date_Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
// import java.time.ZonedDateTime;
// import java.util.Calendar;

public class DateTimeEx {
    public static void main(String[] args) {
        // fetch current date
        LocalDate dateObj = LocalDate.now();
        System.out.println(dateObj);
        // fetch current time
        LocalTime timeObj = LocalTime.now();
        System.out.println(dateObj + "\n" + timeObj);

        // fetch current date and time
        LocalDateTime dateTimeObj = LocalDateTime.now();
        System.out.println(dateTimeObj);

        System.out.println("Output with no format: " + dateTimeObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-YYY HH:mm:ss");
        String formattedDate = dateTimeObj.format(myFormatObj);
        System.out.println("Output After formatting: " + formattedDate);
        // Storing the date time field
        // along with the zone using the ZonedDateTime class
        // ZonedDateTime zone =
        // ZonedDateTime.parse("2016-10-05T08:20:10+05:30[Asia/Kolkata]");
        // System.out.println(zone);

    }
}