package jainzhi;

import java.util.ArrayList;
import java.util.List;

public class J45 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] nums = {3,30,34,5,9};
		System.out.println(minNumber(nums));
	}
	
	public static String minNumber(int[] nums) {
		List<String> list = new ArrayList<>();
		
		for (int num : nums) {
			list.add(String.valueOf(num));
		}
		
		list.sort((o1,o2) -> (o1+o2).compareTo(o2+o1));
		
		return String.join("", list);
    }

}
