package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Leet373 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int []nums1 = {1,7,11}, nums2 = {2,4,6};
		int k = 3;
		
	}

	public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
		List<List<Integer>> ans = new ArrayList<>();
		//���ȶ��м�¼k������������,ע���Ǽ�¼�±�
		PriorityQueue<int[]> pq = new PriorityQueue<>(
				(a,b)->(nums1[a[0]]+nums2[a[1]])-(nums1[b[0]]+nums2[b[1]]));
		int m = nums1.length;
		int n = nums2.length;
		for(int i=0;i<Math.min(m, k);i++) {
			//����С�ļ��룬����ȫ�����ʣ�Ϊ��ȥ��
			pq.offer(new int[] {i,0});
		}
		
		while(k-->0 && !pq.isEmpty()) {
			int [] idx = pq.poll();
			List<Integer> list = new ArrayList<>();
			list.add(nums1[idx[0]]);
			list.add(nums2[idx[1]]);
			ans.add(list);
			if(idx[1]+1<n) {
				pq.offer(new int[] {idx[0],idx[1]+1});
			}
		}
		return ans;
    }
	
	public static List<List<Integer>> kSmallestPairs1(int[] nums1, int[] nums2, int k) {
		List<List<Integer>> ans = new ArrayList<>();
		/*
		 * ����1��ȡǰmin(nums1.length, k)������

			����2��ȡǰmin(nums2.length, k)������

			��Ϻ�������ȡǰmin(ans.size(), k)���ͣ���Ϊ��
		 */
		int m = nums1.length;
		int n = nums2.length;
		for(int i=0;i<Math.min(k, m);i++) {
			for(int j=0;j<Math.min(n, k);j++) {
				ans.add(Arrays.asList(nums1[i],nums2[j]));
			}
		}
		ans.sort(Comparator.comparingInt(item -> item.get(0)+item.get(1)));
		int len = Math.min(k, ans.size());
		
		return ans.subList(0, len);
    }
}
