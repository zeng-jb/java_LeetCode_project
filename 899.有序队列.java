import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=899 lang=java
 *
 * [899] 有序队列
 */

// @lc code=start
class Solution {
    public String orderlyQueue(String s, int _k) {
        char[] cs = s.toCharArray();
        if(_k==1){
            /* 
            int i = 0, j = 1, k = 0, n = cs.length;
            while (i < n && j < n && k < n) {
                char a = cs[(i + k) % n], b = cs[(j + k) % n];
                if (a == b) k++;
                else {
                    if (a > b) i += k + 1;
                    else j += k + 1;
                    if (i == j) i++;
                    k = 0;
                }
            }
            i = Math.min(i, j);
            return s.substring(i) + s.substring(0, i);
            */
            String smallest = s;
            StringBuilder sb = new StringBuilder(s);
            for(int i=0;i<s.length();i++){
                char c = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(c);
                if(sb.toString().compareTo(smallest) <0 ){
                    smallest = sb.toString();
                }
            }
            return smallest;
        }else{
            
            Arrays.sort(cs);
            return String.valueOf(cs);
        }
    }
}
// @lc code=end

