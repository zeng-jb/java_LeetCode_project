package leet;

public class Leet1994 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {1,2,3,4};
		System.out.println(numberOfGoodSubsets(nums));
	}

	public static int numberOfGoodSubsets(int[] nums) {
		int mod = (int)1e9+7;
		int[] p = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		int[] cnts = new int[35];
		
		int n = nums.length;
		
		for(int i : nums) cnts[i]++;
		int mask = 1 << 10;
		
		long f[] = new long [mask];
		f[0] = 1;
		
		for(int i=2;i<=30;i++) {
			if(cnts[i] == 0) continue;
			int cur = 0 , x = i;
			boolean ok = true;
			
			for(int j=0;j<10;j++) {
				int t = p[j] , c = 0;
				while(x%t==0) {
					cur |= (1<<j);
					x /= t;
					c++;
				}
				if(c>1) {
					ok = false;
					break;
				}
			}
			
			if(!ok) continue;
			
			for(int prev = mask-1; prev>=0;prev--) {
				if((prev & cur) != 0) continue;
				f[prev | cur] = (f[prev | cur] + f[prev]*cnts[i]) % mod;
			}
		}
		
		long ans = 0;
		// 统计所有非空集的方案数
        for (int i = 1; i < mask; i++) ans = (ans + f[i]) % mod;
        // 在此基础上，考虑每个 1 选择与否对答案的影响
        for (int i = 0; i < cnts[1]; i++) ans = ans * 2 % mod;
        
        return (int)ans;
    }
}
