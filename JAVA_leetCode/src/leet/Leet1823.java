package leet;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Leet1823 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 5, k = 2;
		Leet1823 obj = new Leet1823();
		System.out.println(obj.findTheWinner1(n, k));
	}

	public int findTheWinner(int n, int k) {
		Queue<Integer> q = new LinkedList();
		for(int i=1;i<=n;i++) {
			q.add(i);
		}
		while(q.size() != 1) {
			int idx = k;
			while(idx > 1) {
				int ret = q.poll();
				idx--;
				q.add(ret);
			}
			q.poll();
		}
		return q.peek();
    }
	
	public int findTheWinner1(int n, int k) {
		//https://blog.csdn.net/u011500062/article/details/72855826
		int p = 0;
		for(int i=2;i<=n;i++) {
			p = (p + k) % i;
		}
		return p+1;
	}
}
