package toStringEqualsHashCode;

/**
 * @author victor olvera
 * Example of hashcode
 * The intention is generate an algorithm that can put an unique id based on the atributes of the class
 */
public class CardHashcode {
	
	//Attributes
	private String rank;
	private String suit;
	
	//Constructor
	public CardHashcode(String r, String s) {
		if(r == null || s == null)
			throw new IllegalArgumentException();
		this.rank = r;
		this.suit = s;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof CardHashcode)){
			return false;
		}
		CardHashcode c =(CardHashcode) obj;
		return rank.equals(c.rank) && suit.equals(c.suit);
	}
	
	@Override 
	public int hashCode() {
		return rank.hashCode();
	}
	
	/*Easy way to write hashCode
		public int hashCode() {
 			return keyField + 7 * otherKeyField.hashCode();
		}
	*/

}
