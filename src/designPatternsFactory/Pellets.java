package designPatternsFactory;

/**
 * @author victor olvera
 *
 */
public class Pellets extends Food{
	
	//Constructor
	public Pellets(int quantity) {
		super(quantity);
	}
	
	//Methods	
	@Override
	public void consumed() {
		System.out.println("Pellets eaten: "+getQuantity());
	}

}
