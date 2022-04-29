package jainzhi;

import java.util.Stack;

public class J30 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println( minStack.min());   //--> ���� -3.
		minStack.pop();
		System.out.println( minStack.top());     // --> ���� 0.
		System.out.println( minStack.min());   //--> ���� -2.

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
     * ÿ��push����ֵ����push��ǰ��Сֵ����push x
     * @param x
     */
    public void push(int x) {
    	stack.push(minNum);
    	minNum = Math.min(x, minNum);
    	stack.push(x);
    }
    
    /**
     * ��popջ��ֵ����pop��ǰ��Сֵ��
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