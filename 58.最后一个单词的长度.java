import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=58 lang=java
 *
 * [58] 最后一个单词的长度
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        // int last = 0;
        // boolean flag = true;
        // for(int i=s.length()-1;i>=0;i--){
        //     if(s.charAt(i) == ' ' ){
        //         if(flag){
        //             continue;
        //         }else{
        //             return last;
        //         }
        //     }else{
        //         last++;
        //         flag = false;
        //     }
        // }
        // return last;
            String[] ss = s.trim().split(" ");
        return ss[ss.length-1].length();

    }
}
// @lc code=end

