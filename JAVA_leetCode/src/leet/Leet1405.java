package leet;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Leet1405 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int a = 1, b = 1, c = 7;
		System.out.println(longestDiverseString(a, b, c));
	}
	
	public static String longestDiverseString(int a, int b, int c) {
		
		int[][] arr = {{'a',a},{'b',b},{'c',c}};
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			Arrays.sort(arr,(x,y)->y[1]-x[1]);
			
			if(arr[0][1] == 0) break;
			
			int n = sb.length();
			
			if(n>=2 && sb.charAt(n-1)==arr[0][0] &&sb.charAt(n-2)==arr[0][0]) {
				if(arr[1][1] == 0) break;
				sb.append((char)arr[1][0]);
				arr[1][1]--;
			}else {
				sb.append((char)arr[0][0]);
				arr[0][1]--;
			}
		}
		
		return sb.toString();
    }
}
