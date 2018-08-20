package internationalizationAndLocation;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject File used to explain .properties files in "/resources"
 */
public class ZooOpen {

    public static void main(String[] args) {
        Locale us = new Locale("en", "US");
        Locale france = new Locale("fr", "FR");
        printProperties(us);
        System.out.println();
        printProperties(france);
    }


    //Static method to call properties file
    public static void printProperties(Locale locale){
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", locale);
        System.out.println(rb.getString("hello"));
        System.out.println(rb.getString("open"));

        //Loop of kwys in the properties file
        Set<String> keys = rb.keySet();
        keys.stream().map(k -> k + " " + rb.getString(k))
                .forEach(System.out::println);

    }
}
