package leet;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Leet825 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] ages = {16,17,18};
//		int []ages = {20,30,100,110,120};
//		int [] ages = {8,85,24,85,69};
		System.out.println(numFriendRequests(ages));
	}
	
	public static int numFriendRequests(int[] ages) {
		int ans = 0;
		Arrays.sort(ages);
		int size = ages.length;
		
		for(int i=0,j=0,k=0;k<size;k++) {
			while(i<k && !check(ages[i], ages[k])) i++;
			if(j<k) j = k;
			while(j<size && check(ages[j], ages[k])) j++;
			
			if(j>i) ans+=j-i-1;
		}
		
		return ans;
    }
	
    public static int numFriendRequests1(int[] ages) {
        Arrays.sort(ages);
        int n = ages.length, ans = 0;
        for (int k = 0, i = 0, j = 0; k < n; k++) {
            while (i < k && !check(ages[i], ages[k])) i++;
            if (j < k) j = k;
            while (j < n && check(ages[j], ages[k])) j++;
            if (j > i) ans += j - i - 1;
        }
        return ans;
    }
    static boolean check(int x, int y) {
        if (y <= 0.5 * x + 7) return false;
        if (y > x) return false;
        if (y > 100 && x < 100) return false; 
        return true;
    }
	

}
