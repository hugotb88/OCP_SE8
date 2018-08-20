package chapter5_Dates_Times_NewAPI_Time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Durations concepts, Both classes can be used to represent an amount of time or determine the difference between two dates.
 * The main distinction between the two classes is that Period uses date-based values, while Duration uses time-based values.
 */
public class Durations {

    public static void main(String[] args) {

        //We can create a Duration using a number of different granularities:
        Duration daily = Duration.ofDays(1); // PT24H
        Duration hourly = Duration.ofHours(1); // PT1H
        Duration everyMinute = Duration.ofMinutes(1); // PT1M
        Duration everyTenSeconds = Duration.ofSeconds(10); // PT10S
        Duration everyMilli = Duration.ofMillis(1); // PT0.001S
        Duration everyNano = Duration.ofNanos(1); // PT0.000000001S

        System.out.println(daily);
        System.out.println(hourly);
        System.out.println(everyMinute);
        System.out.println(everyTenSeconds);
        System.out.println(everyMilli);
        System.out.println(everyNano);


        //Example
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Duration duration = Duration.ofHours(6);
        System.out.println(dateTime.plus(duration)); // 2015–01–20T12:15
        System.out.println(time.plus(duration)); // 12:15
        System.out.println(date.plus(duration)); // UnsupportedTemporalException, because we can't add hours to an object that doesn't contain hours
    }
}
