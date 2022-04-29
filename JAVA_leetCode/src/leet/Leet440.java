package leet;

public class Leet440 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 12;
		int k = 2;
		Leet440 obj = new Leet440();
		System.out.println(obj.findKthNumber(n, k));
	}

	public int findKthNumber(int n, int k) {
		long cur = 1;
		k--;
		
		while(k > 0) {
			int nodes = getNode(n,cur);
			
			if(nodes <= k) {
				cur++;
				k -= nodes;
			}else {
				cur *= 10;
				k--;
			}
		}
		
		return (int)cur;
    }

	private int getNode(int n, long cur) {
		// TODO 自动生成的方法存根
		int nodes = 0;
		int first = (int)cur;
		int last = (int)cur;
		while(first <= n) {
			nodes += Math.min(last, n) - first +1;
			first *= 10;
			last = last*10 + 9;
		}
		return nodes;
	}
}
