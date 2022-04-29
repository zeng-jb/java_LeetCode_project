package leet;

public class Leet2029 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int []stones = {2,1};
		int []stones = {5,1,2,4,3};
		System.out.println(stoneGameIX(stones));
	}

	public static boolean stoneGameIX(int[] stones) {
		
		int[] cnt = new int[3];
		
		for (int i : stones) {
			cnt[i%3]++;	//模3预处理
		}
		
		if(cnt[0]%2==0) {	//如果3的倍数有偶数个，那么A可以控制先手，只要1，2两个余数都不为0
			return (cnt[1]>0 && cnt[2]>0);
		}else {		//如果有奇数个3的倍数，要有1和2的余数差大于两个才能颠倒，A才能赢
			return (Math.abs(cnt[1]-cnt[2]) > 2) ? true:false; 
		}	
    }
}
