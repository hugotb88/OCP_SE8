package toStringEqualsHashCode;

/**
 * @author victor olvera
 * Example of toString, equals and hashcode
 */
public class HippoToString {
	
	//Attributes
	private String name;
	private double weight;
	
	//Constructor
	public HippoToString(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + ", Weight: " + weight + "kg.";
	}
	
	public static void main(String[] args) {
		HippoToString h1 = new HippoToString("Wald", 180.4);
		System.out.println(h1);
	}
	
}
