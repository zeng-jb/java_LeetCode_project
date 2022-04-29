package jainzhi;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class J49 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 11;
		System.out.println(nthUglyNumber(n));
	}

	public static int nthUglyNumber1(int n) {
		int uglyNum[] = new int[n];
		uglyNum[0] = 1;
		int id2 = 0 , id3 = 0, id5 = 0;
		
		for(int i=1;i<n;i++) {
			int temp = Math.min(uglyNum[id2]*2, Math.min(uglyNum[id3]*3, uglyNum[id5]*5));
			if(uglyNum[id2]*2 == temp) id2++;
			if(uglyNum[id3]*3 == temp) id3++;
			if(uglyNum[id5]*5 == temp) id5++;
			uglyNum[i] = temp;
		}
		return uglyNum[n-1];
    }
	
	public static int nthUglyNumber(int n) {
		PriorityQueue<Long> pq = new PriorityQueue<>();
		Set<Long> set = new HashSet<>();
		pq.add(1L); set.add(1L);
		int []nums = {2,3,5};
		int ugly = 0;
		for(int i=0;i<n;i++) {
			long temp = pq.poll();
			ugly = (int) temp;
			for(int num : nums) {
				long next = num * temp;
				if(!set.contains(next)) {
					set.add(next);
					pq.add(next);
				}
			}
		}
		return ugly;
	}
}
