/**
 * 
 */
package leet;

import java.util.Arrays;

/**
 * @author 123
 *
 */
public class Leet807 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] grid =  {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
		
		System.out.println(maxIncreaseKeepingSkyline(grid));
	}
	
	public static int maxIncreaseKeepingSkyline(int[][] grid) {
		int preLength = 0;
		int newLength = 0;
		
		int []rowmax = new int[grid.length];
		Arrays.fill(rowmax, 0);
		int []colmax = new int[grid[0].length];
		Arrays.fill(colmax, 0);
		
		for(int i=0;i<grid.length;i++) {
			for(int j = 0;j< grid[i].length;j++) {
				rowmax[i] = grid[i][j] > rowmax[i] ? grid[i][j] : rowmax[i];
				colmax[j] = grid[i][j] > colmax[j] ? grid[i][j] : colmax[j];
				preLength +=grid[i][j];
			}
		}
		
		for(int i=0;i<rowmax.length;i++) {
			for(int j = 0;j< colmax.length;j++) {
				grid[i][j] = rowmax[i] < colmax[j] ? rowmax[i] : colmax[j]; 
				newLength +=grid[i][j];
			}
		}
		
		
		return newLength - preLength;
    }
}
