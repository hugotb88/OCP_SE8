package designPrincipleComposingObjects;

/**
 * @author victor olvera
 * This class is composed by Flippers and WebbedFeet
 */
public class Penguin {
	
	//Fields
	private final Flippers flippers;
	private final WebbedFeet webbedFeet;
	
	//Constructor
	public Penguin() {
		this.flippers = new Flippers();
		this.webbedFeet = new WebbedFeet();
	}
	
	//Methods
	public void flap() {
		this.flippers.flap();
		
	}
	
	public void kick() {
		this.webbedFeet.kick();
	}
}
