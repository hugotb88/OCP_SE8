package generics;

/**
 * @author victor olvera
 * Example of Generic Interface 
 * Just like a class, an interface can declare a formal type parameter. For example, the following
Shippable interface uses a generic type as the argument to its ship() 
 */
public interface GenericInterfaceShippable <T>{
	public void ship(T t);
}
