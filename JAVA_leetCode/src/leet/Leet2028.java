package leet;

import java.util.Arrays;

public class Leet2028 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []rolls = {1,5,6};
		int mean = 3, n = 4;
		Leet2028 obj = new Leet2028();
		System.out.println(obj.missingRolls(rolls, mean, n));
	}

	
	public int[] missingRolls(int[] rolls, int mean, int n) {
		int m = rolls.length;
		int sum = mean*(m+n);
		int []miss = new int[n];
		for(int i=0;i<m;i++) {
			sum -= rolls[i];
		}
		if(sum < n || sum > 6*n) return new int[0];
		int a = sum / n;
		int b = sum % n;
		Arrays.fill(miss, a);
		/*
		for(int i=0;i<n;i++) {
			miss[i] = a;
		}
		*/
		for(int i=0;i<b;i++) {
			miss[i]++;
		}
		
		return miss;
    }
}
