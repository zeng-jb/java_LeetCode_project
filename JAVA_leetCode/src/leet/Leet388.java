package leet;

import java.util.Stack;

public class Leet388 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
		Leet388 obj = new Leet388();
		System.out.println(obj.lengthLongestPath(input));
	}

	public int lengthLongestPath(String input) {
		//分割\n
		String[] words = input.split("\n");
		int res = 0;
		int sum = 0;
		//栈记录每一层的长度
		Stack<Integer> stack = new Stack<>();
		
		for(String word : words) {
			//记录所在层数
			int k = 0;
			while(word.charAt(k) == '\t') k++;
			//去掉\t的剩余的长度
			int len = word.length() - k;
			//如果层数小于栈记录的层数，要退栈
			while(stack.size() > k) {
				sum -= stack.pop();
			}
			
			sum += len;
			stack.push(len);
			//如果是文件名，记录到res，＋k是有k层的“/"；
			if(word.contains(".")) {
				res = Math.max(res, sum+k);
			}
			
		}
		
		return res;
    }
}
