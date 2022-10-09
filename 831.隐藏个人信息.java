/*
 * @lc app=leetcode.cn id=831 lang=java
 *
 * [831] 隐藏个人信息
 */

// @lc code=start
class Solution {
    public String maskPII(String s) {
        if(s.contains("@")){
            s=s.toLowerCase();
            int index = s.indexOf("@");
            return s.charAt(0)+"*****"+s.substring(index-1);
        }else{
            s=s.replace("+", "");
            s=s.replace("-", "");
            s=s.replace("(", "");
            s=s.replace(")", "");
            s=s.replace(" ", "");
            int len = s.length();
            String ss = "";
            if(len%10==0){
                ss = "***-***-"+s.substring(len-4);
            }else if(len%10==1){
                ss = "+*-***-***-"+s.substring(len-4);
            }else if(len%10==2){
                ss = "+**-***-***-"+s.substring(len-4);
            }else if(len%10==3){
                ss = "+***-***-***-"+s.substring(len-4);
            }

            return ss;
        }
    }
}
// @lc code=end

