package generics;

/**
 * @author victor olvera
 *  suppose an Elephant class exists, and we are moving our elephant to a new
and larger enclosure in our zoo. (The San Diego Zoo did this in 2009. It was interesting
seeing the large metal crate.)
 */
public class SanDiegoZoo {
	public static void main(String[] args) {
		//We use the generic Class Crate to pack elephants and Zebras
		Elephant elephant = new Elephant();
		Crate<Elephant> crateForElephant = new Crate<>();
		crateForElephant.packCrate(elephant);
		Elephant inNewHome = crateForElephant.emptyCrate(); 
		
		Crate<Zebra> crateForZebra = new Crate<>();
		Zebra zebra = new Zebra();
		crateForZebra.packCrate(zebra);
		
		/*
		 This probably doesn’t seem particularly impressive yet,  we could have 
		 created an Animal superclass or interface and used that in Crate.
		 
		 but...
		 
		 Generic classes become useful when the classes used as the type parameter can have absolutely
		 nothing to do with each other. For example, we need to ship our 120-pound robot to another city
		 
		 */
		
		Robot joeRobot = new Robot();
		Crate<Robot> crateForJoe = new Crate<>();
		crateForJoe.packCrate(joeRobot);
		
		//Shipped to St. Louis
		Robot atDestination = crateForJoe.emptyCrate();
		
		
		//Using a Generic Class with two Parameters
		Elephant anotherELephant = new Elephant();
		Integer numPounds =  15000;
		SizeLimitedCrate<Elephant, Integer> c1 = new SizeLimitedCrate<>(anotherELephant, numPounds);
		
		
	}
}
