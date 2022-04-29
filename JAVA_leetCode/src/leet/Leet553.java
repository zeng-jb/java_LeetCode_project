package leet;

public class Leet553 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {3,2};
		System.out.println(optimalDivision(nums));
		//"1000/(100/10/2)"
	}

	public static String optimalDivision(int[] nums) {
		String s = "";
		int n = nums.length;
		for(int i=0;i<n;i++) {
			s += nums[i];
			if(n>=2) {				
				if(i!=n-1) s += "/";
				if(n>2) {					
					if(i==0) s += "(";
					if(i==n-1) s += ")";
				}
			}
		}
		
		return s;
    }
}
