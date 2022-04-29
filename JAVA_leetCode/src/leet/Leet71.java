package leet;

import java.util.ArrayDeque;
import java.util.Deque;

public class Leet71 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		String path = "/a/./b/../../c/";
//		String path ="/home//foo/";
//		String path = "/../";
		String path = "/home/";
		System.out.println(simplifyPath(path));
	}

	public static String simplifyPath(String path) {
		String[] str = path.split("/");
		Deque<String> q = new ArrayDeque<String>();
		
		for(int i=0;i<str.length;i++) {
			String s = str[i];
			
			if("..".equals(s)) {
				if(!q.isEmpty()) q.pollLast();
			}else if(!(".".equals(s)) && s.length()>0) {
				q.offerLast(s);
			}
		}
		StringBuilder sb = new StringBuilder();
		if(q.isEmpty()) {
			sb.append("/");
		}else {
			while(!q.isEmpty()) {
				sb.append("/");
				sb.append(q.pollFirst());
			}
		}
	
		
		return sb.toString();
    }
}
