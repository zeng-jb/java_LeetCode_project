package leet;

import java.util.Set;

public class Leet762 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int left = 6, right = 10;
		Leet762 obj = new Leet762();
		System.out.println(obj.countPrimeSetBits(left, right));
		
	}
	
	public int countPrimeSetBits(int left, int right) {
		int ans = 0;
		for(int i=left;i<=right;i++) {
			if(helper(i)) {
				ans++;
			}
		}
		return ans;
    }

	private boolean helper(int num) {
		// TODO �Զ����ɵķ������
		int[] isprem = {2,3,5,7,11,13,17,19,23,29,31};
		int n = Integer.bitCount(num);
		for(int is : isprem) {
			if(is == n) return true;
		}
		return false;
	}

}