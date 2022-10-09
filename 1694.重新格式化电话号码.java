import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1694 lang=java
 *
 * [1694] 重新格式化电话号码
 */

// @lc code=start
class Solution {
    public String reformatNumber(String number) {
        String number1 = number.replaceAll("-", "").replaceAll(" ", "");
        // number = number.replace(" ","");
        // number = number.replace("-","");
        // number = number.replaceAll("(?<=\\G\\d{3})(?!$)", "-");
        // number = number.replaceAll("\\b(\\d{2})(\\d+)-(\\d)$", "$1-$2$3");

        StringBuilder sb = new StringBuilder();
        
    

        int i = 0;
        int n = number1.length();
        while(i < n && n-i>4){
            sb.append(number1.substring(i, i+3));
            i+= 3;
            sb.append("-");
        }
        if(n-i==4){
            sb.append(number1.substring(i,i+2));
            sb.append("-");
            i+=2;
            sb.append(number1.substring(i,i+2));
        }else{
            sb.append(number1.substring(i));
        }

        return sb.toString();
    }
}
// @lc code=end

