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
}

