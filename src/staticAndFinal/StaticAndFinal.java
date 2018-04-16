package staticAndFinal;

/**
 * @author victor olvera
 * Static and Final example
 */
public class StaticAndFinal {
	
	//static class => used to inherit classes
	
	//static attribute => used to make global attribute (all the instances uses it)
	public static String CONST = "The same value for all the instances";
	
	//static method => used to make global methods (all the instances uses it and we can use it directly without instance)
	public void getClassName() {
		System.out.println(this.getClass().toString());
	}

	//final class => The class can't inherit to child
	
	//final attribute => The attribute can be only initialize once
	public final String str = "The attribute is inialized here and only here.";
	
	//final method => The method can't be overrided by child classes
	public final void getStr() {
		System.out.println("This method can't be overrided");
	}
	
	
}
