package conceptsOCAPartOne.partTwo;

import conceptsOCAPartOne.AccessModifiers;

public class AccessModifiers2 extends AccessModifiers{
	
	public static void main(String[] args) {
		AccessModifiers cat = new AccessModifiers();
		System.out.println(cat.name);
		System.out.println(cat.hasFur); //No, porque estamos creando un AccessModifiers no un AccessModifiers2 que heredaria 
		System.out.println(cat.hasPaws);
		System.out.println(cat.id); 
	}

}
