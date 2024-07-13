
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class CustomDate {
    public static void main(String[] args) {
        System.out.println("Time: " + zonedFormatedDate());
    }

    public static String zonedFormatedDate() {
        Date date = new Date();

        ZoneId newYorkZone = ZoneId.of("America/New_York");

        ZonedDateTime zonedDateTime = date.toInstant().atZone(newYorkZone);

        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss a");

        Date utcDate = Date.from(zonedDateTime.toInstant());

        return formatter.format(utcDate); //Time: 09/01/2023 13:21:49 PM
    }
}