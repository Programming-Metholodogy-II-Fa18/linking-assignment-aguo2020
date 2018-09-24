import java.util.*;

public class ArbitraryQueue<E> {
	private Node<E> head = null;
	private Node<E> tail = null;
	
	private class Node<E> {
		private E data;
		private Node<E> next;
		private Node<E> prev;
	}
	
	public ArbitraryQueue() {
        head = null;
        tail  = null;
    }
	
	public boolean isEmpty() {
        return head == null;
    }
	
	public void push(E e){
		Node<E> oldfirst = head;
		head = new Node<E>();
		head.data = e;
		head.next = oldfirst;
		head.prev = null;
		if (tail == null) {
			tail = head;
		}
	 } 
	
	public void enqueue(E e) {
	     Node<E> a = new Node<E>();
	     a.data = e;
	     a.next = null;
	     if (isEmpty()) {
	    	 this.tail = a;
	    	 this.head = this.tail;
	     }
	        else {
	        	tail.next = a;
	        	tail.next.prev = tail;
	        	tail = a;
	        }
	}
	
	public E pop(){
		if (isEmpty()) throw new NoSuchElementException("Queue underflow");
		E hold = head.data;
		head = head.next;
		head.prev = null;
		return hold;
	 }
	
	public E dequeue() {
		if (isEmpty()) throw new NoSuchElementException("Queue underflow");
		if(tail.prev == null) {
			System.out.println("Null pointer exception in dequeue");
			return null;
		}
		Node<E> a = tail;
		tail.prev.next = null;
		tail = tail.prev;
        if (isEmpty()) tail = null;
        return a.data;
	}
	
	public E traverse(int n) {     //Starts at 0
		Node<E> hold = head;
		int i = 0;
		for (i=0; i < n; i++) {
			if (hold == null) {
				System.out.println("Null pointer exception in traverse");
				return null;
			}
			hold = hold.next;
		}
		return hold.data;
	}
	
/*
		public static void main(String[] args) {
		ArbitraryQueue a = new ArbitraryQueue();
		int b = 3;
		String t = "Hello World";
		a.push(b);
		a.enqueue(t);
		System.out.println(a.dequeue());
	}
*/
}
		

