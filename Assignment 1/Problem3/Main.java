package Problem3;

public class Main {
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
}
