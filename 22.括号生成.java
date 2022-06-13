import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=22 lang=java
 *
 * [22] 括号生成
 */

// @lc code=start
class Solution {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backTracking("",0,0,n);
        return list;
    }
    /**
     * 
     * @param res   括号生成字符串
     * @param count1 记录（ 的个数
     * @param count2 记录 ）的个数
     * @param n       
     */
    public void backTracking(String res, int count1, int count2 , int n ){
        if(count1 > n || count2 > n) return;
        if(count1 == n && count2 == n){
            list.add(res);
            return;
        }
        //需要左括号多于有括号
        if(count1 >= count2){
            backTracking(res + "(", count1+1, count2, n);
            backTracking(res + ")", count1, count2+1, n);
        }
        return;
    }
}
// @lc code=end

