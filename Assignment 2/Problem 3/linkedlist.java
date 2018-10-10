package Problem3;

public class linkedlist {
	private class Node<E> {
		private int data;
		private Node<E> next;
	}
	
	int i = 0;
	Node head;
	
	public linkedlist() {
		head = null;
	}
	
	public void add(int a) {
		Node node = new Node();
		node.data = a;
		node.next = null;
		
		if(head == null) {
			head = node;
		}
		else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void printList() {
		Node node = head;
		while (node.next!= null) {
			System.out.println(node.data);
		}
	}
	
	public void random() {
		Node hold = head;
		for (int i=0; i < 1; i++) {
			if (hold == null) {
				System.out.println("Null pointer exception in traverse");
				return;
			}
			hold = hold.next;
		}
			hold.next = null;
			add(hold.data);
		}
	
	public void quicksort() {
		while(i <= 2) {
			random();
			i++;
		}
		
		
		
	}
}
