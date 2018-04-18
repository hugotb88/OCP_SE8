package designPatternsSingleton;

/**
 * @author victor olvera
 * Class that uses the singleton instance
 */
public class LlamaTrainer {
	
	//Methods
	public boolean feedLlamas(int numberOfLlamas) {
		int amountNeeded = 5 * numberOfLlamas;
		HayStorage hayStorage = HayStorage.getInstance();
		if(hayStorage.getHayQuantity() < amountNeeded) {
			hayStorage.addHay(amountNeeded + 10);
		}
		boolean fed =  hayStorage.removeHay(amountNeeded);
		if(fed) {
			System.out.println("Llamas have been fed");
		}
		return fed;
	}
	
}

/*
  One thing to keep in mind is that there might be multiple llama trainers at the zoo
but only one food storage location. Within our data model, this would amount to many
LlamaTrainer instances but only a single instance of HayStorage . We also checked the
return type of removeHay() , as it is possible that someone else could have taken the food
that we just restocked before we had a chance to use it 
 */
