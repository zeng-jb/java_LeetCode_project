package leet;

import java.util.Arrays;

public class Leet1672 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] accounts = {{1,5},{7,3},{3,5}};
		Leet1672 obj = new Leet1672();
		System.out.println(obj.maximumWealth(accounts));
	}

	
	public int maximumWealth(int[][] accounts) {
		int max = 0;
		for(int[] account : accounts) {
			max = Math.max(max, Arrays.stream(account).sum());
//			max = Math.max(max, helper(account));
		}
		return max;
    }


	private int helper(int[] account) {
		// TODO 自动生成的方法存根
		int sum = 0;
		for(int num : account) {
			sum += num;
		}
		return sum;
	}
}
