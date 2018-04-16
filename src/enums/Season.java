package enums;

/**
 * @author victor olvera
 * Example of enums
 * The values in an enum are all that are allowed. You cannot add more at runtime by
extending the enum
 */
	
	//Declare of ENUM
public enum Season{
	WINTER, SPRING, SUMMER, FALL;
		
	
	//Also we can add Fields, Methods and 
	
		
	
	public static void main(String[] args) {
		Season s = Season.SUMMER;
		System.out.println(Season.SUMMER); //SUMMER
		System.out.println(s == Season.SUMMER); //true
		
		for (Season season : Season.values()) {
			System.out.println(season.name() +  " " + season.ordinal());
		}
		
		Season s1 =  Season.valueOf("SUMMER"); // SUMMER
		Season s2 =  Season.valueOf("summer"); // exception 
		
		//Enums with switch
		Season summer = Season.SUMMER;
		switch(summer) {
			case WINTER:
				System.out.println("It's cold here");
				break;
			
			case SUMMER:
				System.out.println("Time for the pool");
				break;
			
			case FALL:
				System.out.println("Ok, it's fall");
				
			default:
				System.out.println("It's Summer yet?");
		}
		
	}
}
