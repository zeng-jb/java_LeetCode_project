/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    public int myAtoi(String s) {
        // String regex = "^[\+\-]?\d+";
        char[] str = s.toCharArray();
        int idx = 0;
        boolean negative = false;
        //去掉前导空格
        while(idx < str.length && str[idx] == ' ') idx++;
        if(idx == str.length) return 0;
        if(str[idx] == '-') {
            negative = true;
            idx++;
        }else if(str[idx] == '+'){
            idx++;
        }else if(!Character.isDigit(str[idx])){
            return 0;
        }
        int ans = 0;
        //-+号后要是数字了
        while(idx < str.length && Character.isDigit(str[idx])){
            int digit = str[idx] - '0';
            //防止越界
            if(ans > (Integer.MAX_VALUE -digit) / 10){
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans*10 + digit;
            idx++;
        }
        return negative ? -ans : ans;
    }
}
// @lc code=end

