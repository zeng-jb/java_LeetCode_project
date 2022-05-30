package leet;

import java.util.HashSet;
import java.util.Set;

public class Leet961 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = new int[] {5,1,5,2,5,3,5,4};
		Leet961 obj = new Leet961();
		System.out.println(obj.repeatedNTimes(nums));
	}

    public int repeatedNTimes(int[] nums) {
    	Set<Integer> set = new HashSet<>();
    	for(int num : nums) {
    		if(!set.contains(num)) {
    			set.add(num);
    		}else {
    			return num;
    		}
    	}
    	return -1;
    }
}
