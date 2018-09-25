package Problem2;

public class ArbitraryQueueArray<E> {
private E[] queueArray;
private int n = 0;
private int total;
	public  ArbitraryQueueArray(int s) {
		queueArray = (E[]) new Object[s];
		total = s;
	}
	
	public boolean isEmpty() {
		return queueArray.length == 0;
	}
	
	public void push(E e) {	
		n++;
		if (n > queueArray.length) {
			System.out.println("Array Index Out of Bound Error by push");
			return;
		}
		int i = n;
		for (i = n; i > 0; i--) {
			int k = i-1;
			queueArray[i] = queueArray[k];
		}
		queueArray[0] = e;
	}

	public void enqueue(E e) {
		int s = n;
		queueArray[s] = e;
		n++;
	}

	public E pop() {
		E hold = queueArray[0];
		int i = 0;
		for (i = 0; i == total-1; i++) {
			queueArray[i] = queueArray[i++];
		}
		n--;
		return hold;
	}

	public E dequeue() {
		E hold = queueArray[n-1];
		queueArray[n-1] = null;
		n--;
		return hold;
	}

	public E traverse(int index) {
		return queueArray[index];
	}	
	/*
	public static void main(String[] args) {
		ArbitraryQueueArray a = new ArbitraryQueueArray(5);
		int b = 3;
		int t = 9;
		a.push(b);
		a.enqueue(t);
		System.out.println(a.pop());
	}
	*/
}
