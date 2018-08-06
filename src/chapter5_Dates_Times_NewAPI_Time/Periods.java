package chapter5_Dates_Times_NewAPI_Time;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Working with periods of time,
 *  Our zoo performs animal enrichment
 * activities to give the animals something fun to do. The head zookeeper has decided
 * to switch the toys every month. This system will continue for three months to see how it
 * works out.
 */
public class Periods {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimaEnrichment(start,end);
    }

    private static void performAnimaEnrichment(LocalDate start, LocalDate end){
        LocalDate upTo = start;
        while(upTo.isBefore(end)){ //Check if still before "end"
            System.out.println("Give new toy: " + upTo );
            upTo = upTo.plusMonths(1);  //Add a month
        }
    }
}
