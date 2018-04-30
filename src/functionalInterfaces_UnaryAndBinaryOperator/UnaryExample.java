package functionalInterfaces_UnaryAndBinaryOperator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author victor olvera
 * Unary and BiNary  example
 * 
 * 	T apply(T t);
	T apply(T t1, T t2);
 */
public class UnaryExample {
	public static void main(String[] args) {
		//Unary
		UnaryOperator<String> u1 =  String::toUpperCase;
		UnaryOperator<String> u2 =  x -> x.toUpperCase();
		
		System.out.println(u1.apply("Victor"));
		System.out.println(u2.apply("Hugo"));
		
		
		//Binary 
		BinaryOperator<String> b1 =  String::concat;
		BinaryOperator<String> b2 =  (x,y) -> x.concat(y);
		
		System.out.println(b1.apply("Olvera", "Cruz"));
		System.out.println(b2.apply("Bruce", "Wayne"));
		
	}
}
