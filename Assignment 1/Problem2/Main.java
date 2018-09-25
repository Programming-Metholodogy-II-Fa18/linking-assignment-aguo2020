package Problem2;

public class Main {
	public static void main(String[] args) {
		ArbitraryQueueArray a = new ArbitraryQueueArray(5);
		int b = 3;
		int t = 9;
		a.push(b);
		a.enqueue(t);
		System.out.println(a.pop());
	}
}
