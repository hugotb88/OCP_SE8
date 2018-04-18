package designPatternsFactory;

/**
 * @author victor olvera
 *
 */
public class Fish extends Food{
	
	//Constructor
	public Fish(int quantity) {
		super(quantity);
	}

	//Methods
	@Override
	public void consumed() {
		System.out.println("Fish eaten:" + getQuantity());
	}
	
}
