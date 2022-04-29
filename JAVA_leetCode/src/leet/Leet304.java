package leet;

public class Leet304 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] matrix = {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5}};
		NumMatrix obj = new NumMatrix(matrix);
		System.out.println(obj.sumRegion(2, 1, 4, 3));
		System.out.println(obj.sumRegion(1, 1, 2, 2));
		System.out.println(obj.sumRegion(1, 2, 2, 4));
	}

}

class NumMatrix {

	int [][] sum;
    public NumMatrix(int[][] matrix) {
    	int m = matrix.length;
    	int n = matrix[0].length;
    	this.sum = new int[m+1][n+1];
    	for(int i=1;i<=m;i++) {
    		for(int j=1;j<=n;j++) {
    			//初始化二维前缀和数组,注意下标问题从1开始
    			sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + matrix[i-1][j-1];
    		}
    	}
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
    	//注意下标问题，从1开始。
    	row1+=1;col1+=1;row2+=1;col2+=1;
    	return sum[row2][col2] - sum[row1-1][col2] - sum[row2][col1-1] + sum[row1-1][col1-1];
    }
}