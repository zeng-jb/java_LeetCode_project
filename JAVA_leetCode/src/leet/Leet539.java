package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet539 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		String[] timePoints = {"23:59","00:00"};
		List<String> timePoints = new ArrayList<>();
		timePoints.add("00:00");
		timePoints.add("23:59");
		;
		
		System.out.println(findMinDifference(timePoints));
	}

	public static int findMinDifference(List<String> timePoints) {
		int len = timePoints.size();
		
		if(len>1440) {
			//一共有 24 *60=1440。由鸽巢原
			return 0;
		}
		
		int [] s = new int[len];
		
		for(int i=0;i<len;i++) {
			String time = timePoints.get(i);
			String [] HHMM = time.split(":");
			int H = Integer.parseInt(HHMM[0]);
			int M = Integer.parseInt(HHMM[1]);
			s[i] = H*60 + M;
			
		}
		
		Arrays.sort(s);
		int min = Integer.MAX_VALUE;
		for(int i=1;i<len;i++) {
			int temp = s[i]-s[i-1];
			if(min > temp) min = temp;
		}
		min = Math.min(s[0]+1440-s[len-1], min);
		return min;
    }
	
	public int findMinDifference1(List<String> timePoints) {
        int[] arr = new int[timePoints.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(timePoints.get(i).substring(0, 2)) * 60 + Integer.parseInt(timePoints.get(i).substring(3));
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i] - arr[i - 1]);
        }
        return Math.min(min, arr[0] + 1440 - arr[arr.length - 1]);
    }
}
