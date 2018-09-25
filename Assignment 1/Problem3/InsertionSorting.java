package Problem3;
import java.util.NoSuchElementException;

public class InsertionSorting {
	private Node head;
	private Node tail;
	private Node sortedNode;
	private int n; 
	private int pastPeekInt;
	public class Node{
		private int data;
		private Node next;
		private Node prev;
	}
	
	public boolean isEmpty() {
        return head == null;
    }
	
	public void InsertionSort(){
		updatepastpeek(head.data);
		Node temp = head;
		Node hold = head;
		for(int i = 0; i < n; i++) {
			//System.out.println(i);
			for (int j = 1; j <= i; j++) { 
				//System.out.println(j + "j");
				if (temp == null) {
					System.out.println("Null Pointer Exception");
					return;
				}
				else if(temp.prev.data > temp.data) {
						int a = temp.prev.data;
						temp.prev.data = temp.data;
						temp.data = a;
						System.out.println(temp.data +" swapped with " + temp.prev.data);
						temp = head;
						hold = head;
						i = 0;
						break;
						}
					else continue;
					}
				hold = hold.next;
				temp = hold;
				}
			System.out.println("Sort finished!");
		}
	public void printlist(){
		Node temp = head;
		for(int i=0;i<n;i++) {
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println("Done");
	}
	public void push(int data){
		Node a= new Node();
		if(head != null) {
			head.prev = a;
		}
		a.data = data;
		a.next = head;
		a.prev = null;
		head = a;
		if (tail == null) {
			tail = a;
		}
		n++;
	}
	
	public int pop(){
		if (isEmpty()) throw new NoSuchElementException("Queue underflow");
		updatepastpeek(head.data); 
		int hold = head.data;
		head = head.next;
		head.prev = null;
		n--;
		return hold;
	}
	
	public int peek(){
		return head.data;
	}
	
	public int pastpeek() {
		if(pastPeekInt == 0) {
			return head.data;
		}
		return pastPeekInt;
	}
	
	public void updatepastpeek(int a) {
		pastPeekInt = a;
	}
	
	/*
	public static void main(String[] args) {
		InsertionSorting a = new InsertionSorting();
		a.push(10);
		a.push(4);
		a.push(14);
		a.push(9);
		a.push(3);
		//a.printlist();
		a.InsertionSort();
		a.printlist();
		System.out.println(a.pastpeek() + " Past Peek");
		System.out.println(a.pop());
		System.out.println(a.pastpeek() + " Past Peek");
		System.out.println(a.pop());
	}
	*/
}

