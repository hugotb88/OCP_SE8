package chapter5_Dates_Times_NewAPI_Time;

import java.time.*;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject The Instant class represents a specific moment in time in the GMT time zone
 */
public class Instants {

    public static void main(String[] args) {
        Instant now = Instant.now();

        // do something  time consuming
        for (int i=0; i<=100 ; i++){
            System.out.println("Hello Hugo, this action consumes time");
        }

        Instant later = Instant.now();

        Duration duration = Duration.between(now, later);
        System.out.println("This time has passed between the start and the end of the for cycle: " + duration.toMillis());


        //If you have a ZonedDateTime, you can turn it into an Instant:
        LocalDate date = LocalDate.of(2015, 5, 25);
        LocalTime time = LocalTime.of(11, 55, 00);
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        Instant instant = zonedDateTime.toInstant(); // 2015–05–25T15:55:00Z
        System.out.println(zonedDateTime); // 2015–05–25T11:55–04:00[US/Eastern]
        System.out.println(instant); // 2015–05–25T15:55:00Z
    }
}
