package Problem4;
import java.util.*;
public class ProblemSolving {
	public static void Problem4A(int[] a, int arraySize){
		java.util.Arrays.sort(a); //uses quicksort

		 for (int i=1; i<arraySize-1; i += 2) {
			 if(i+1 > arraySize-1) {
				 break;
			 }
			 else if(a[i+1]>a[i]) {
				 swap(a, i+1, i);
			 }
		 }
	}
	
	public static void swap(int[] a, int x, int y) {
		int temp = a[x];
		a[x]=a[y];
		a[y]=temp;
	}
	
	public static void main(String[] args) {
		int[] a = {12, 9001, 5, 20, 221};
		int b = a.length;
		System.out.print("The original array is: ");
		for(int i = 0; i < b; i++) {
			System.out.print(a[i] + " ");
		}
		Problem4A(a,b);
		System.out.print("\nThe sorted array is: ");
		for(int i = 0; i < b; i++) {
			System.out.print(a[i] + " ");
		}
	}
}


