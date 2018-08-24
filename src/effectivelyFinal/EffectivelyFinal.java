package effectivelyFinal;

/**
 * @author victor olvera Java 8 has also introduced a new concept called
 *         "effectively final" variable. A non final local variable or method
 *         parameter whose value is never changed after initialization is known
 *         as effectively final.
 */
public class EffectivelyFinal {
	int one = 20; //Only this is effectively final
	int two = one;
	two++;
	int three;if(one==4)
	three=3;
	else
	three=4;
	int four = 4;

	class Inner {
	}
	four=5;
}
