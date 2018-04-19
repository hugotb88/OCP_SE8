package collectionsQueue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author victor olvera
 * 
 	Method			Description																		For Queue	For Stack
 
 	E remove()		Removes and returns next element or throws an exception if empty queue			Yes 		No
	void push(E e)	Adds an element to the front of the queue										Yes 		Yes
	E poll() 		Removes and returns next element or returns null if empty queue					Yes 		No
	E peek() 		Returns next element or returns null if empty queue								Yes 		Yes
	E pop()			Removes and returns next element or throws an exception if empty queue			No 			Yes
 * 
 */
public class ArrayDequeExample {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		System.out.println(queue.offer(10)); // true	10
		System.out.println(queue.offer(4)); // true		10 | 4
		System.out.println(queue.peek()); // 10			10 | 4
		System.out.println(queue.poll()); // 10			4
		System.out.println(queue.poll()); // 4			
		System.out.println(queue.peek()); // null
		
		/* 
		 
		 What if we want to insert an element at the other end, just as we could with a Stack? No problem
		 
		  We just call the push()method. It works just like offer() except at the other end of the queue. 
		  When talking about LIFO (stack), people say push/poll/peek. When talking about FIFO (single-ended
		  queue), people say offer/poll/peek
		 
		 
		 */
		
		
		//Code rewritted
		ArrayDeque<Integer> stack = new ArrayDeque<>();
		stack.push(10);										//	10
		stack.push(4);										//	4 | 10
		System.out.println(stack.peek()); // 4				//	4 | 10
		System.out.println(stack.poll()); // 4				//	10
		System.out.println(stack.poll()); // 10				
		System.out.println(stack.peek()); // null
		
	}

}
