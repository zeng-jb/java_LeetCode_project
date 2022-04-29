package leet;

public class Leet868 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Leet868 obj = new Leet868();
		int n = 22;
		System.out.println(obj.binaryGap(n));
	}

	public int binaryGap(int n) {
//		String bin = Integer.toBinaryString(n);
//		System.out.println(bin);
		
		int pre = -1;
		int cnt = 0;
		int ans = 0;
		
		while(n > 0) {
			if((n & 1) == 1) {
				if(pre != -1) ans = Math.max(ans, cnt-pre);
				pre = cnt;
			}
			n = n >> 1;
			cnt++;
		}
		
		return ans;
    }
}
