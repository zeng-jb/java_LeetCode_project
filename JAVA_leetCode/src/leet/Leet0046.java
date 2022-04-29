package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Leet0046 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int nums[] = {1,2,3};
		System.out.println(permute(nums));
	}

	//ȫ����
	static List<List<Integer>> res;
	
	public static List<List<Integer>> permute(int[] nums) {
		res = new LinkedList<>();
		LinkedList<Integer> track = new LinkedList<>();
		boolean used[] = new boolean[nums.length];
		backTrack(nums,track,used);
		return res;
    }
	private static void backTrack(int[] nums, LinkedList<Integer> track, boolean[] used) {
		// TODO �Զ����ɵķ������
		if(track.size() == nums.length) {
			res.add(new LinkedList<>(track));
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(used[i] == true) continue;
			used[i] = true;
			track.add(nums[i]);
			backTrack(nums, track, used);
			used[i] = false;
			track.removeLast();
			
		}
	}
	
}
