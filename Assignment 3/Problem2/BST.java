package Problem2;
public class BST {
	private class Node{
		int data;
        Node right;
        Node left;

        public Node() {
        	data = 0;
           	right = null;
            left = null;
        }
	}
	
	private Node head;
	private int data;
	private int size;
	
	public BST() {
        head = null;
        size = 0;
    }
	
	public void put(int a){
		Node node = new Node();
        node.data = a;
        size++;
		if (head == null) {
			head = node;
		}
		else {
			Node hold = head;
			while(size != 0) {
				Node parent = hold;
				if(a > hold.data) {
					hold = hold.right;
					if(hold == null) {
						parent.right = node;
						break;
					}
				}
				if(a<hold.data) {
					hold = hold.left;
					if(hold == null) {
						parent.left = node;
						break;
					}
				}
			}
		}
    }
	
	public void put(int[] a){
        for (int i = 0; i < a.length; i++){
            put(a[i]);
        }
    }
	
	public int search(int key) {
		int counter = 0;
		Node hold = head;
		while(hold != null) {
			if(key < hold.data) {
				hold = hold.left;
				counter++;
			}
			if(key > hold.data) {
				hold = hold.right;
				counter++;
			}
			else {
				System.out.println("Total Number of Comparisons Needed: " + counter);
                return hold.data;
            }
		}
		System.out.println("Value Not Found! Number of camparsion: " + counter);
		return 0;
	}
	
	 public int returnSize(){
	        return size;
	    }
	
	 public int[] sortedTree() {
	        int[] a = new int[returnSize()];
	        if(head == null)
	            return null;
	        sort();
	        
	        
	        
	        
	      
	        return a;
	    }
	
	private void sort() {
		
	}
}
