/**
 * 
 */
package leet;

import java.util.Arrays;

/**
 * @author 123
 *
 */
public class Leet475 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] houses = {1,2,3,4}, heaters = {1,4};
//		int[] houses = {1,5}, heaters = {2};
//		int[] houses = {1,2,3}, heaters = {2};
		System.out.println(findRadius(houses,heaters));
	}

	public static int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);
		int radius = 0;
		int[] radiusArrays = new int[houses.length];
		//Arrays.fill(radiusArrays, Integer.MAX_VALUE);
		
		for(int i=0,j=0;i<houses.length;i++) {
//			for(int j=0;j<heaters.length;j++) {
//				radiusArrays[i] = Math.min(radiusArrays[i], Math.abs(houses[i]-heaters[j]));
//			}
			//radius = Math.max(radius, radiusArrays[i]);
			
			int r = Math.abs(houses[i]-heaters[j]);
			while(j+1 < heaters.length && r >= Math.abs(houses[i]-heaters[j+1])){
				r = Math.abs(houses[i]-heaters[j+1]);
				j++;
			}
			radius =  Math.max(radius, r);
		}
		
		return radius;
	}
}
