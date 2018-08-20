package internationalizationAndLocation;

import java.util.Locale;

/**
 * @author Victor Hugo Olvera Cruz
 * @subject Since internationalization and localization are such long words, they are often abbreviated
 * as internationalizationAndLocation.i18n and l10n.
 */
public class InternationalizationAndLocation {

    public static void main(String[] args) {
        //Local
        //Oracle defines a locale as “a specific geographical, political, or cultural region,”
        //you’ll only see languages and countries on the exam.
        Locale locale = Locale.getDefault();
        System.out.println(locale); //en_US ----> language_country

        //printing some others locales
        System.out.println(Locale.GERMAN); //de  ----> language
        System.out.println(Locale.GERMANY); //de_DE ---->Country

        //Another way to do it
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();

        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();

    }
}
