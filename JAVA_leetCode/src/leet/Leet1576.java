package leet;

import java.util.Scanner;

public class Leet1576 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		String s ="??yw?ipkj?";
		System.out.println(modifyString(s));
	}

	public static String modifyString(String s) {
		char[] sb = s.toCharArray();
		int n = sb.length;
		for(int i=0;i<n;i++) {
			if(sb[i] == '?') {
				for(char c = 'a';c<='c';c++) {
					if((i>0 && sb[i-1] == c) || (i<n-1 && sb[i+1]==c)) {
						continue;
					}else {
						sb[i] = c;
						break;
					}
				}
			}
		}
		return new String(sb);
    }
}
