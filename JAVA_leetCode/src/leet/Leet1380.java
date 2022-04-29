package leet;

import java.util.ArrayList;
import java.util.List;

public class Leet1380 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
		System.out.println(luckyNumbers(matrix));
	}

	public static List<Integer> luckyNumbers (int[][] matrix) {
		List<Integer> res = new ArrayList<>();
		int m = matrix.length;
		int n = matrix[0].length;
		
		for(int i=0;i<m;i++) {
			int rowMin = matrix[i][0];
			int idx = i;
			for(int j=0;j<n;j++) {
				rowMin = Math.min(rowMin, matrix[i][j]);
				if(rowMin == matrix[i][j]) idx = j;
			}
			int colMax = matrix[0][idx];
			for(int j=0;j<m;j++) {
				colMax = Math.max(colMax, matrix[j][idx]);
			}
			
			if(rowMin == colMax) res.add(rowMin);
		}
		
		
		return res;
    }
}
