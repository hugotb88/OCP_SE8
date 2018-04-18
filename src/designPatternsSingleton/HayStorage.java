package designPatternsSingleton;

/**
 * @author victor olvera
 *
 */
public class HayStorage {
	
	//Fields
	private int quantity = 0;
	
	//Constructor
	private HayStorage() {
	}
	
	//Build the unique instance
	private static final HayStorage instance = new HayStorage();
	
	//Methods
	public static HayStorage getInstance() {
		return instance;
	}

	public synchronized void addHay(int amount) {
		quantity += amount;
	}

	public synchronized boolean removeHay(int amount) {
		if (quantity < amount)
			return false;
		quantity -= amount;
		return true;
	}

	public synchronized int getHayQuantity() {
		return quantity;
	}
}
