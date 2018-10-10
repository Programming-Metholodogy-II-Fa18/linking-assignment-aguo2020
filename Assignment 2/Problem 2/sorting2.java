package Problem2;
public class sorting2 {
	public static void mergeSort(int[] a,int arraySize) {
		sort(a, 0, arraySize-1);
		}
	
	public static void mergeSort(int[]a, int left, int mid, int right) {
		int i = left;
		int j = mid+1;
		int k = right;
		//sort the front and back of the midpoints
		while(i <= j && j <= k) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
					j++;
				}
				else i++;
		}
		
		//merge two midpoints
		for (int b = 0; b < j; b++){
            for(int c = j-1; c<a.length; c++){
                if (a[c]<a[b]){
                    int temp = a[c];
                    for(int v = c; v > b-1; v--){
                        if(v-1 >= 0) {
                            a[v] = a[v-1];
                        }
                    }
                    a[b] = temp;
                    b++;
                }
            }
        }

}
			
	
	public static void sort(int[]a, int left, int right) {
		if(left < right) {
			int mid = (left + right)/2;
			sort(a, left, mid);
			sort(a, mid + 1, right);
			mergeSort(a, left, mid, right);
			}
		}
	
	public static void main(String[] args) {
		int[] a = {90, 25, 2, 6, 22, 20, 54, 56, 64 ,65, 75};
		int b = a.length;
		System.out.print("The original array is: ");
		for(int i = 0; i < b; i++) {
			System.out.print(a[i] + " ");
		}
		mergeSort(a,b);
		System.out.print("\nThe sorted array is: ");
		for(int i = 0; i < b; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
}
