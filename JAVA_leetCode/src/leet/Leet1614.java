package leet;

import java.util.Stack;

public class Leet1614 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "(1+(2*3)+((8)/4))+1";
//		String s = "(1)+((2))+(((3)))";
//		String s = "1+(2*3)/(2-1)";
		System.out.println(maxDepth(s));
	}
	
    public static int maxDepth(String s) {	
    	int max =0;
    	Stack<Character> stack = new Stack<>();
    	for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(') {
				stack.add(c);			
				max = stack.size() > max ? stack.size():max;
			}else if(c == ')') {
				if(!stack.isEmpty()) {
					stack.pop();				
				}
			}
		}
    	return max;
    }
}
