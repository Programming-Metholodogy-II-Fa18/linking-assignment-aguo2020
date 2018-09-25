package Problem1;

public class Main {
	public static void main(String[] args) {
		ArbitraryQueue a = new ArbitraryQueue();
		int b = 3;
		String t = "Hello World";
		a.push(b);
		a.enqueue(t);
		System.out.println(a.dequeue());
	}
}
