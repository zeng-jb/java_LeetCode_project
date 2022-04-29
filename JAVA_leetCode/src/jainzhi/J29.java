package jainzhi;

import java.util.List;

public class J29 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println(spiralOrder(matrix));
	}

	public static int[] spiralOrder(int[][] matrix) {
	       if(matrix == null || matrix.length == 0) return  new int [0];
			int m = matrix.length;
			int n = matrix[0].length;
			int [] res = new int [m*n];
			int index = 0;
			int up = 0 , down = m-1 , left = 0 , right = n-1;
			while(true) {
				for(int i=left;i<=right;i++) res[index++] = matrix[up][i];
				if(++up > down) break;
				
				for(int i=up;i<=down;i++) res[index++] = matrix[i][right];
				if(left > --right) break;
				
				for(int i=right;i>=left;i--) res[index++] = matrix[down][i];
				if(up > --down) break;
				
				for(int i=down;i>=up;i--) res[index++] = matrix[i][left];
				if(++left > right) break;
			}
			
			return res;
    }
}
