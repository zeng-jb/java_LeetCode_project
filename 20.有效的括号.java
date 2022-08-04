import java.util.Stack;

import javax.swing.plaf.TextUI;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        /* 
        if(s.isEmpty()) return true;
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(')');
            }else if(ch == '['){
                stack.push(']');
            }else if(ch == '{'){
                stack.push('}');
            }else if(stack.isEmpty() || ch!=stack.pop()){
                return false;
            }
        }
        if(stack.isEmpty()) return true;
        return false;
        */
        // Stack<Character> stack = new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i) == '(') stack.push(')');
        //     else if(s.charAt(i) == '[') stack.push(']');
        //     else if(s.charAt(i) == '{') stack.push('}');
        //     else if(stack.isEmpty() || stack.pop() != s.charAt(i)) return false;
        // }
        // if(stack.isEmpty()) return true; 
        // return false;
        int length = s.length() / 2;
		for (int i = 0; i < length; i++) {
			s = s.replace("()", "").replace("{}", "").replace("[]", "");
		}

		return s.length() == 0;
    }
}
// @lc code=end

