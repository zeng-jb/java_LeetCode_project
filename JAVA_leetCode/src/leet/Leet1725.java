package leet;

import java.util.Arrays;
import java.util.Comparator;

public class Leet1725 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][]rectangles = {{5,8},{3,9},{5,12},{16,5}};
		System.out.println(countGoodRectangles(rectangles));
	}
	public static int countGoodRectangles(int[][] rectangles) {
		Arrays.sort(rectangles,(a,b)->a[0]-b[0]);
		int n = rectangles.length;
		int [] numCount = new int[n];
		for(int i=0;i<n;i++) {
			int minValue = Math.min(rectangles[i][0], rectangles[i][1]);
			numCount[i] = minValue;
		}
		int max = numCount[0];
		int count = 0;
		for(int i=0;i<n;i++) {
			if(max == numCount[i]) {
				count++;
			}else if(max < numCount[i]){
				max = numCount[i];
				count = 1;
			}
		}
		return count;
	}
}
