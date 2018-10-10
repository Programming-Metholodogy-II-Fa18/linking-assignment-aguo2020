package Problem1;
import java.util.*;
public class sorting {
	public static void Problem1Sort(int[] a,int arraySize) {
		int[] hold = a;
		int[] newSort = new int[10];
		int max = a[0];
		int digit = 1;

		for(int i = 0; i < arraySize; i++) {
			if (max < hold[i]) {
				max = hold[i];
				/**finds the max number of the array so we know if the 
				 * biggest number is in the ones tens or hundreds place
				 **/
			}
		}
		
		while(max/digit != 0) {
			int[] counter = new int[10];
			// this will hold all the digits into an array
			for(int i = 0;  i<arraySize; i++) {
	            counter[(hold[i] / digit) % 10]++;
	            //adds the digits to the counter
			}
			for(int i = 1; i<10; i++) {
				counter[i] = counter[i] + counter[i-1];	
				//idea is similar to the counting sort
			}
			for(int i = arraySize -1; i>= 0; i--) {
				newSort[--counter[(hold[i]/digit)%10]] = hold[i];
				//moves all the counted array at that spot into the newSort
			}
			for(int i = 0; i < arraySize; i++) {
				a[i] = newSort[i];
				//sorts the new sort base on digits into a holder array
			}
			digit *= 10;
			//ones place, tens, hundreds
		}
	}

	public static void main(String[] args) {
		int[] a = {12, 9001, 5};
		int b = a.length;
		System.out.print("The original array is: ");
		for(int i = 0; i < b; i++) {
			System.out.print(a[i] + " ");
		}
		Problem1Sort(a,b);
		System.out.print("\nThe sorted array is: ");
		for(int i = 0; i < b; i++) {
			System.out.print(a[i] + " ");
		}
	}
}