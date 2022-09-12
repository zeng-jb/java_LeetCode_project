import java.util.Stack;

/*
 * @lc app=leetcode.cn id=1598 lang=java
 *
 * [1598] 文件夹操作日志搜集器
 */

// @lc code=start
class Solution {
    public int minOperations(String[] logs) {
        // Stack<String> stack = new Stack<>();
        int n = 0;
        for(String log : logs){
            // if(log.equals("../")){
            //     if(stack.isEmpty()) continue;
            //     stack.pop();
            // }else if(log.equals("./")){
            //     continue;
            // }else{
            //     stack.push(log);
            // }


            if(log.equals("./")){
                continue;
            }else if(log.equals("../")){
                n = n == 0 ? n : n-1;
            }else{
                n++;
            }
            
        }

        return n;
    }
}
// @lc code=end

