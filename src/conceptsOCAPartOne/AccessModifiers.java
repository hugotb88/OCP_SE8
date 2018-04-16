package conceptsOCAPartOne;

/**
 * @author victor olvera
 * OCA Concept
 */
public class AccessModifiers {
	
	//Access Modifiers
	public String name = "cat"; //Everyone has access
	protected boolean hasFur = true; //Class, package and subclass
	boolean hasPaws = true; //class and pakage
	private int id; //Class only
	
	public static void main(String[] args) {
		 AccessModifiers cat = new AccessModifiers();
		 System.out.println(cat.name);
		 System.out.println(cat.hasFur);
		 System.out.println(cat.hasPaws);
		 System.out.println(cat.id); 
		
	}

}
