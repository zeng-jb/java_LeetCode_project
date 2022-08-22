import java.util.Stack;

/*
 * @lc app=leetcode.cn id=155 lang=java
 *
 * [155] 最小栈
 */

// @lc code=start
class MinStack {

    // 考虑每个元素都有当前的最小值，既保存【值，最小值】
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(val);
            stack.push(val);
        }else{
            int minVal = stack.peek();
            if(minVal > val) minVal = val;
            stack.push(val);
            stack.push(minVal);
        }
    }
    
    public void pop() {
        stack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.get(stack.size()-2);
    }
    
    public int getMin() {
        return stack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
// @lc code=end

