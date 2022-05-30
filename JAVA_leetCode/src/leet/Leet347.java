package leet;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class Leet347 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] nums = {1,1,1,2,2,3};
		int k = 2;
		Leet347 obj = new Leet347();
		System.out.println(obj.topKFrequent(nums, k));
		
	}

	public int[] topKFrequent(int[] nums, int k) {
		//����map������Ƶ��ͳ��
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		
		Set<Map.Entry<Integer, Integer>> entryset =  map.entrySet();
		//��Ƶ�������С����
		PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((o1,o2) -> o1.getValue() - o2.getValue());
		
		entryset.forEach(entry ->{
			pq.add(entry);
			//����k�����ѶӶ�����
			if(pq.size() > k) {
				pq.poll();
			}
		});
		
		int[] ans = new int[k];
		for(int i=0;i<k;i++) {
			ans[i] = pq.poll().getKey();
		}
		
		return ans;
    }
}
