package Problem1;
import java.util.*;
public class DaryHeap {
    private int heapSize;
    private int[] heap;
    private int d;
    private int capacity = 10;
    
    public DaryHeap(int d){
        heap = new int[capacity];
        this.d = d;
        heapSize = 0;
    }
    
    private void swap(int i, int j){
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    
    private boolean isFull( ){
        return heapSize == capacity;
    }
    
    private int parentIndex(int index) {
    	return (index-1)/d;
    }
    
    private void doubleArray() {
    	capacity *= 2;
    	int[] temp = new int[capacity];
    	for(int i = 0; i<temp.length; i++) {
    		temp[i] = heap[i];
    	}
    	heap = temp;
    }
    
    public void printHeap() {
    	for(int i = 0; i<heapSize; i++) {
    		System.out.print(heap[i] + " ");
    	}
    }
    public void insert(int k) {
    	if(isFull()) {
    		doubleArray();
    	}
    	heap[heapSize++] = k;
    	swim(heapSize-1);
    }
    
    private void swim(int k) {
    	int temp = heap[k];
    	while ((k > 0) && (temp > heap[parentIndex(k)])) {
    		heap[k] = heap[parentIndex(k)];
    		k = parentIndex(k);
    		}
    	heap[k] = temp;
    	}
    
    public int delMax() {
    	int max = heap[0];
    	heap[0] = heap[heapSize-1];
    	heapSize --;
    	sink(0);
    	return max;
    }
    
    private void sink(int k) {
    	while (childNumber(k,1) < heapSize) {
    		int i =largestChild(k);
    		if(heap[i] > heap[k]) {
    			swap(k,largestChild(k));
    			k = largestChild(k);
    		}
    		else break;
    	}
    }
    
    private int largestChild(int k) {
    	int largest = heap[k];
    	int index = k;
    	for(int i = childNumber(k,1); i < heapSize && i < childNumber(k,1)+d; i++) {
    		if(heap[i] > largest) {
    			index = i;
    			largest = heap[i];
    		}
    	}
    	return index;
    }
    
    private int childNumber(int k, int num) {
    	return ((d*k)+num);
    }
    
    public int[] daryHeapsort() {
    	int n = heapSize;
    	for (int i = (n/2) - 1; i >= 0; i--) {
    		sort(heap, i);
    	}
    	
    	for(int i = n-1; i >= 0; i--) {
    		swap(0,i);
    		heapSize--;
    		sort(heap,0);
    	}
    	
    	heapSize = n;
    	return heap;
    }
    
    private void sort(int[] arr, int i) {
        int largest = i;
        int l = 2*i;  
        int r = (2*i)+1; 
        
        if(l < heapSize -1 && arr[l] > arr[largest]) {
        	largest = l;
        }
        
        if(r < heapSize - 1 && arr[r] > arr[largest]) {
        	largest = r;
        }
        
        if (largest != i) {
        	swap(largest, i);
        	sort(arr, largest);
        }
    }  
}
