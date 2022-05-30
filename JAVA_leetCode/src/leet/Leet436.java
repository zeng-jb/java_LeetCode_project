package leet;

import java.util.Map;
import java.util.TreeMap;

public class Leet436 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[][] intervals = {{3,4},{2,3},{1,2}};
		Leet436 obj = new Leet436();
		System.out.println(obj.findRightInterval(intervals));
	}

	public int[] findRightInterval(int[][] intervals) {
		TreeMap<Integer, Integer> left2index = new TreeMap<>();
		for(int i=0;i<intervals.length;i++) {
			left2index.put(intervals[i][0], i);
		}
		int[] ans = new int[intervals.length];
		for(int i=0;i<intervals.length;i++) {
			Map.Entry<Integer, Integer> entry = left2index.ceilingEntry(intervals[i][1]);
			ans[i] = entry == null ? -1 : entry.getValue();
		}
		return ans;
    }
}
