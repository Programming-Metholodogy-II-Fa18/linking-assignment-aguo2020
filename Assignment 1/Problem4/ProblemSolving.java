package Problem4;
public class ProblemSolving {
	public static String ProblemFourA(String s){
		 int n = s.length();
		 char[] arr = new char[n];
		 int i = 0;
		 for (i = 0; i < s.length(); i++) {
			 arr[i] = s.charAt(n-1);
			 n--;
		 }
		 String a = String.valueOf(arr);
		 return a;
	 }
	
	/*
	public static void main(String[] args) {
		System.out.println(ProblemFourA("Hello World!"));
	}
	*/
	
	public static void ProblemFourB(int[][] k, int sum){
		int y = k.length;
		int z = k[0].length;
		int i = 0;
		int j = 0;
		int t = 0;
		int p = 0;
		for(i=0;i<y;i++) {
			for(j=0;j<z;j++) {
				for(t=0;t<y;t++) {
					for(p=0;p<z;p++) {
						int q = k[i][j]+k[t][p];
						if( q == sum && i!=t && j!=p) {
							System.out.print("(" + k[i][j] + "," + k[t][p] + ")");
				
						}
					}
				}
			}
		}
	}
	
	public static int ProblemFourC(int a){
		int n = (a+1)*(a+1)*(a+1);
		int[] b = new int[n];
		int counter=0;
		for(int i=0; i<=a; i++) {
			for(int j=0; j<=a; j++) {
				for(int k=0; k<=a; k++) {
					b[counter]=(int)(Math.pow(9, i)*Math.pow(15, j)*Math.pow(7, k));
					counter++;
				}
			}
		}
		
		for (int i = 0; i < n; i++){
		       int check = b[i];
		       int j = i-1;
		       while (j >= 0 && b[j] > check){
		           b[j+1] = b[j];
		           j = j-1;
		       }
		       b[j+1] = check;
		   }
		
		return b[a];
	}
	
	/*
	public static void main(String[] args) {
		System.out.println(ProblemFourC(2));
	}
	*/
}


