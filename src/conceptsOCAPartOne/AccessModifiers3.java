package conceptsOCAPartOne;

public class AccessModifiers3 {
	
	public static void main(String[] args) {
		AccessModifiers cat = new AccessModifiers();
		System.out.println(cat.name);
		System.out.println(cat.hasFur); //same package
		System.out.println(cat.hasPaws); //same package
		System.out.println(cat.id); 
	}

}
