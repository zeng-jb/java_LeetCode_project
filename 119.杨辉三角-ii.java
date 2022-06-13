import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> pre = new ArrayList<>();
        pre.add(1);

        for(int i=0;i<rowIndex;i++){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j=1;j<pre.size();j++){
                temp.add(pre.get(j-1) + pre.get(j));
            }
            temp.add(1);
            pre = temp;
        }
        return pre;
    }
}
// @lc code=end

