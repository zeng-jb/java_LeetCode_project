package leet;

import java.util.List;
import java.util.ArrayList;

public class Leet1447 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = 4;
		System.out.println(simplifiedFractions(n));
	}
	
	public static List<String> simplifiedFractions(int n) {
		List<String> list = new ArrayList<String>();
		
		for(int i=1;i<=n-1;i++) {
			for(int j=i+1;j<=n;j++) {
				if(gcd(i, j) == 1) {
					list.add(""+i+"/"+j);
				}
			}
		}
		
		return list;
    }
	
	private static int gcd(int a,int b) {
		if(b == 0) return a;
		else return gcd(b, a%b);
	}
}
