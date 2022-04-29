package lanqiao2021;

import java.util.HashSet;
import java.util.Set;

public class Main1551 {

	/**
	 * 在平面直角坐标系中，两点可以确定一条直线。
如果有多点在一条直线上，那么这些点中任意两点确定的直线是同一条。
给定平面上2 × 3 个整点{(x, y)|0 ≤ x < 2, 0 ≤ y < 3, x ∈ Z, y ∈ Z}，
即横坐标是0 到1 (包含0 和1) 之间的整数、纵坐标是0 到2 (包含0 和2) 之间的整数的点。
这些点一共确定了11 条不同的直线。
给定平面上20 × 21 个整点{(x, y)|0 ≤ x < 20, 0 ≤ y < 21, x ∈ Z, y ∈ Z}，
即横坐标是0 到19 (包含0 和19) 之间的整数、纵坐标是0 到20 (包含0 和20) 之间的整数的点。
请问这些点一共确定了多少条不同的直线。
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Set<int[]> set = new HashSet<>();
		int X = 2;
		int Y = 3;
		int len = X*Y;
		int i = 0;
		int [][] nums = new int[len][2];
		for(int x=0;x<X;x++) {
			for(int y=0;y<Y;y++) {
				nums[i][0] = x;
				nums[i][1] = y;
				i++;
			}
		}
		
		for(i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				int a = nums[i][1] - nums[j][1];
				int b = nums[j][0] - nums[i][0];
				int c = nums[i][0]*nums[j][1] - nums[j][0]*nums[i][1];
				int gcdd = gcd(gcd(a, b), c);
				int[] step = {a/gcdd,b/gcdd,c/gcdd};
				set.add(step);
			}
		}
		System.out.println(set.size());
	}
	
	public static int gcd(int a,int b) {
		return b == 0 ? a : gcd(b, a%b);
	}

}
