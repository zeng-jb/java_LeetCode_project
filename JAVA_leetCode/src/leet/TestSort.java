package leet;
import java.io.*;
import java.util.*;


public class TestSort {

	/*
	 * 给定你一个长度为n的整数数列。

请你使用快速排序对这个数列按照从小到大进行排序。

并将排好序的数列按顺序输出。

输入格式
输入共两行，第一行包含整数 n。

第二行包含 n 个整数（所有整数均在1~109范围内），表示整个数列。

输出格式
输出共一行，包含 n 个整数，表示排好序的数列。

数据范围
1≤n≤100000
输入样例：
5
3 1 2 4 5
输出样例：
1 2 3 4 5

	 */
	// 输入输出模板
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(in.readLine());
		String s[] = in.readLine().split(" ");// 读入数据
		
		Arrays.sort(s, new Comparator<String>() {
			//降序
			@Override
			public int compare(String o1, String o2) {
				// TODO 自动生成的方法存根
				if(o1.length()==o2.length())
					return o2.compareTo(o1);
				else
					return o2.length()-o1.length();
			}
			
		});
		
//		Arrays.sort(s, new Comparator<String>() { // 排序
//			public int compare(String a, String b) {  
//	        	if(a.length() == b.length()){ // 如果长度相等则直接比较字典序
//	        		return a.compareTo(b);
//	        	}
//	        	else{ // 长度长的一定大
//	        		return a.length() - b.length();
//	        	}
//			}
//		});
		
		for(String p : s){
			out.write(p+" ");
		}
		
		out.flush();
		
	}


}
