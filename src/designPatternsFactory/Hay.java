package designPatternsFactory;

/**
 * @author victor olvera
 *
 */
public class Hay extends Food {
	
	//Constructor
	public Hay(int quantity) {
		super(quantity);
	}

	@Override
	public void consumed() {
		System.out.println("Hay eaten:" + getQuantity());
	}
	
}
