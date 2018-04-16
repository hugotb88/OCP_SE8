package enums;

/**
 * @author victor olvera
 * Example 2 of enums, here we will work also with Constructors, Fields and Methods
 * 
 */
	
	//Declare of ENUM
public enum Season2{
	
	WINTER("Low"), SPRING("Medium"), SUMMER("Medium"), FALL("Medium");
	
	//Fields
	private String expectedVisitors;
	
	//Constructor
	private Season2(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}
	
	//Method
	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
		
	
	public static void main(String[] args) {
		Season2 s = Season2.SUMMER;
		System.out.println(Season2.SUMMER); //SUMMER
		System.out.println(s == Season2.SUMMER); //true
		
		for (Season2 season : Season2.values()) {
			System.out.println(season.name() +  " " + season.ordinal());
		}
		
		Season2 s1 =  Season2.valueOf("SUMMER"); // SUMMER
//		Season2 s2 =  Season2.valueOf("summer"); // exception 
		
		s.printExpectedVisitors(); //using the method
		
	}
}
