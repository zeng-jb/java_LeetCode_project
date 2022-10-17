import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1441 lang=java
 *
 * [1441] 用栈操作构建数组
 */

// @lc code=start
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int index = 1;
        for(int i=0;i<target.length;){
            if(target[i] == index){
                res.add("Push");
                i++;
            }else{
                res.add("Push");
                res.add("Pop");
            }
            index++;
        }

        return res;
    }
}
// @lc code=end

