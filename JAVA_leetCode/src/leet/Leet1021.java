package leet;

import java.util.Stack;

public class Leet1021 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "(()())(())(()(()))";
		Leet1021 obj = new Leet1021();
		System.out.println(obj.removeOuterParentheses(s));
	}

	public String removeOuterParentheses1(String s) {
		Stack<Character> stack = new Stack<>();
		StringBuilder ans = new StringBuilder();
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch == ')') {
				stack.pop();
			}
			if(!stack.isEmpty()) {
				ans.append(ch);
			}
			if(ch == '(') {
				stack.push(ch);
			}
		}
		return ans.toString();
    }
	
	public String removeOuterParentheses(String s) {
		StringBuilder sb = new StringBuilder();
		
		for(int i=0,score=0;i<s.length();) {
			int j=i;
			while(i == j || score != 0) score += s.charAt(j++) == '(' ? 1 : -1;
			sb.append(s.substring(i+1, j-1));
			i = j;
			score = 0;
		}
		
		return sb.toString();
	}
}
