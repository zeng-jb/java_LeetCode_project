package leet;

public class Leet2022 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int [] original = {1,2,3,4}; 
//		int m = 2, n = 2 ;
		int [] original = {1,2,3}; 
		int m = 1, n = 3 ;
		int [][] ans = construct2DArray(original,m,n);
		System.out.println(ans);
		
	}
	public static int[][] construct2DArray(int[] original, int m, int n) {
		int [][]ans = new int[m][n];
		
		if(original.length == m*n) {
			for(int i=0,idx=0;i<m;i++) {
				for(int j = 0;j<n;j++) {
					ans[i][j] = original[idx++];
				}
			}
		}else {
			return new int[0][0];
		}
		
		return ans;
    }
}
