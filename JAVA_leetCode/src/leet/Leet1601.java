package leet;

import java.util.Arrays;

public class Leet1601 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 5;
		int [][]requests = {{0,1},{1,0},{0,1},{1,2},{2,0},{3,4}};
		System.out.println(maximumRequests(n, requests));
	}

	public static int maximumRequests(int n, int[][] requests) {
		int[] data = new int[n];
		int m = requests.length;
		int ans = 0;
		
		for(int mask = 0 ; mask < (1<<m) ; mask++) {
			int cnt = Integer.bitCount(mask);
			if(cnt <= ans) {
				continue;
			}
			Arrays.fill(data, 0);
			for(int i=0;i<m;i++) {
				if((mask & (1 << i)) != 0) {
					data[requests[i][0]]++;
					data[requests[i][1]]--;
				}
			}
			boolean flag = true;
			for (int x : data) {
				if (x != 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				ans = cnt;
			}
		}

		return ans;
    }
}
