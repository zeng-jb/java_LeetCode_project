package jainzhi;

import java.util.Stack;

public class J30 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println( minStack.min());   //--> 返回 -3.
		minStack.pop();
		System.out.println( minStack.top());     // --> 返回 0.
		System.out.println( minStack.min());   //--> 返回 -2.

	}

}

class MinStack {
	
	Stack<Integer> stack;
	int minNum  = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
    	stack = new Stack<>();
    }
    
    /**
     * 每次push两个值，先push当前最小值，再push x
     * @param x
     */
    public void push(int x) {
    	stack.push(minNum);
    	minNum = Math.min(x, minNum);
    	stack.push(x);
    }
    
    /**
     * 先pop栈顶值，再pop当前最小值；
     */
    public void pop() {
    	stack.pop();
    	minNum = stack.pop();
    }
    
    public int top() {
    	return stack.peek();
    }
    
    public int min() {
    	
    	return minNum;
    }
}