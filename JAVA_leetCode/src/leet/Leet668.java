package leet;

public class Leet668 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int m = 2, n = 3, k = 6;
		Leet668 obj = new Leet668();
		System.out.println(obj.findKthNumber(m, n, k));
	}

	public int findKthNumber(int m, int n, int k) {
		int left = 0;
		int right = m*n;
		
		while(left < right) {
			int mid = left + (right - left) / 2;
			int sum = 0;
			for(int i=1;i<=m;i++) {
				sum += Math.min(mid/i, n);
			}
			if(sum >= k) {
				right = mid;
			}else {
				left = mid + 1;
			}
		}
		return left;
    }
}
