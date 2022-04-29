/**
 * 
 */
package leet;

import java.util.PriorityQueue;

/**
 * @author 123
 *��һ�������ƻ������һ�� n �죬ÿ�춼���Գ������ɸ�ƻ�����ڵ� i �죬���ϻ᳤�� apples[i] ��ƻ������Щƻ�������� days[i] ���Ҳ����˵���� i + days[i] ��ʱ�����ã�����޷�ʳ�á�Ҳ��������ô���죬���ϲ��᳤���µ�ƻ������ʱ�� apples[i] == 0 �� days[i] == 0 ��ʾ��

�����ÿ�� ��� ��һ��ƻ������֤Ӫ�����⡣ע�⣬��������� n ��֮�������ƻ����

������������Ϊ n ���������� days �� apples ����������ԳԵ���ƻ���������Ŀ��

��Դ�����ۣ�LeetCode��
���ӣ�https://leetcode-cn.com/problems/maximum-number-of-eaten-apples
����Ȩ������������С���ҵת������ϵ�ٷ���Ȩ������ҵת����ע��������
 *
 */
public class Leet1705 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		int[] apples = {1,2,3,5,2}, days = {3,2,1,4,2};
		int[] apples = {3,0,0,0,2}, days = {3,0,0,0,2};
//		int[] apples = {0}, days = {1};
		System.out.println(eatenApples(apples,days));
		
		}

	public static int eatenApples(int[] apples, int[] days) {
		int ans = 0;
		PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0]-b[0]);
		int i = 0 , n = apples.length;
		while(i < n || !pq.isEmpty()) {
			if(i<n && apples[i] > 0) {
				pq.add(new int[] {days[i]+i-1,apples[i]});
			}
			
			while(!pq.isEmpty() && pq.peek()[0] <i) pq.poll();
			if(!pq.isEmpty()) {
				int []cur = pq.poll();
				if(--cur[1] > 0 && cur[0] > i) {
					pq.add(cur);
				}
				ans++;					
			}
			i++;
		}
		
		return ans;
	}

}
