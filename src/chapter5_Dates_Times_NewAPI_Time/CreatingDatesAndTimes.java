package chapter5_Dates_Times_NewAPI_Time;

import java.time.*;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Basic Concepts
 */
public class CreatingDatesAndTimes {

    public static void main(String[] args) {

        System.out.println(LocalDate.now()); //Contains just a date
        System.out.println(LocalTime.now()); //Contains just a time
        System.out.println(LocalDateTime.now()); //Contains just a Date and Time
        System.out.println(ZonedDateTime.now()); //Contains just a Date and Time but with a specific zone

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20); //Month is an Enum
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        System.out.println(date1);
        System.out.println(date2);

        //Creating times
        //. You can even include
        //nanoseconds if you want to be very precise.
        LocalTime time1 = LocalTime.of(6, 15); // hour and minute
        LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
        LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        //Combining Dates and Times into one Object
        //You can combine dates and times into one object:
        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        System.out.println(dateTime1);
        System.out.println(dateTime2);


        // For zoned Dates and Times we have this examples
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zoned1 = ZonedDateTime.of(2015, 1, 20, 6, 15, 30, 200, zone);
        ZonedDateTime zoned2 = ZonedDateTime.of(date1, time1, zone);
        ZonedDateTime zoned3 = ZonedDateTime.of(dateTime1, zone);

        System.out.println(zoned1);
        System.out.println(zoned2);
        System.out.println(zoned3);

        //Finding our Time Zone
        System.out.println(ZoneId.systemDefault());

        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("US") || z.contains("America"))
                .sorted().forEach(System.out::println);


        //There are another methods for  times, to add or substract

//        plusYears/ minusYears
//        plusMonths/ minusMonths
//        plusWeeks/ minusWeeks
//        plusDays/ minusDays
//        plusHours/ minusHours
//        plusMinutes/ minusMinutes
//        plusSeconds/ minusSeconds
//        plusNanos/ minusNanos




    }
}
