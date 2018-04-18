package designPatternsFactory;

/**
 * @author victor olvera
 * Abstract class Food
 */
public abstract class Food {
	
	//Fields
	private int quantity;

	//Constructor
	public Food(int quantity) {
		this.quantity = quantity;
	}
	
	//Methods
	public int getQuantity() {
		return quantity;
	}
	
	public abstract void consumed();
	
}
