import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.stylesheets.LinkStyle;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        list.add(first);
        for(int i=1;i<numRows;i++){
            List<Integer> pre = list.get(i-1);
            List<Integer> cur = new ArrayList<>();
            cur.add(1);
            for(int j=1;j<pre.size();j++){
                cur.add(pre.get(j-1) + pre.get(j));
            }
            cur.add(1);
            list.add(cur);
        }
        return list;
    }
}
// @lc code=end

