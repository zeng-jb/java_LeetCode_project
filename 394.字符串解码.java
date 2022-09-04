import java.util.Stack;

/*
 * @lc app=leetcode.cn id=394 lang=java
 *
 * [394] 字符串解码
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {
        Stack<Integer> mulStack = new Stack<>();
        Stack<String> resStr = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int multi = 0;

        for(char c : s.toCharArray()){
            if(c == '['){
                mulStack.push(multi);
                resStr.push(sb.toString());
                multi = 0;
                sb = new StringBuilder();
            }else if(c == ']'){
                StringBuilder tmp = new StringBuilder();
                int curMul = mulStack.pop();
                for(int i=0;i<curMul;i++) tmp.append(sb);
                sb = new StringBuilder(resStr.pop() + tmp);
            }else if(Character.isDigit(c)){
                multi = multi * 10 + Integer.parseInt(c+"");
            }else{
                sb.append(c);
            }

        }

        return sb.toString();
    }
}
// @lc code=end

