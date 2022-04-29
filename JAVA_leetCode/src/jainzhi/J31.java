package jainzhi;

import java.util.Stack;

public class J31 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		int []pushed = {1,2,3,4,5}, popped = {4,5,3,2,1};
		int [] pushed = {1,2,3,4,5}, popped = {4,3,5,1,2};
		System.out.println(validateStackSequences(pushed, popped));
	}

	public static boolean validateStackSequences(int[] pushed, int[] popped) {
		
		Stack<Integer> stack = new Stack<>();
		
		int indexpop = 0;
		
		for(int pushnum : pushed) {
			stack.push(pushnum);
			while(indexpop < popped.length && !stack.isEmpty() && stack.peek() == popped[indexpop]) {
				stack.pop();
				indexpop++;
			}
		}
		
		
		return indexpop == popped.length;
	 }
}
