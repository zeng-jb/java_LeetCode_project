package lanqiao2021;

import java.util.HashSet;
import java.util.Set;

public class Main1551 {

	/**
	 * ��ƽ��ֱ������ϵ�У��������ȷ��һ��ֱ�ߡ�
����ж����һ��ֱ���ϣ���ô��Щ������������ȷ����ֱ����ͬһ����
����ƽ����2 �� 3 ������{(x, y)|0 �� x < 2, 0 �� y < 3, x �� Z, y �� Z}��
����������0 ��1 (����0 ��1) ֮�����������������0 ��2 (����0 ��2) ֮��������ĵ㡣
��Щ��һ��ȷ����11 ����ͬ��ֱ�ߡ�
����ƽ����20 �� 21 ������{(x, y)|0 �� x < 20, 0 �� y < 21, x �� Z, y �� Z}��
����������0 ��19 (����0 ��19) ֮�����������������0 ��20 (����0 ��20) ֮��������ĵ㡣
������Щ��һ��ȷ���˶�������ͬ��ֱ�ߡ�
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
