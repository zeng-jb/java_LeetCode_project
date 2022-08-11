import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1417 lang=java
 *
 * [1417] 重新格式化字符串
 */

// @lc code=start
class Solution {
    public String reformat(String s) {
        List<String> letStr = new ArrayList<>();
        List<String> digStr = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                letStr.add(String.valueOf(c));
            }else{
                digStr.add(String.valueOf(c));
            }
        }

        int letLen = letStr.size();
        int digLen = digStr.size();
        int flag = letLen - digLen;

        StringBuilder sb = new StringBuilder();
        if(flag <= 1 && flag >= -1){
            if(flag == 1 || flag == 0){
                for(int i=0;i<digLen;i++){
                    sb.append(letStr.get(i));
                    sb.append(digStr.get(i));
                }
                if(flag == 1){
                    sb.append(letStr.get(letLen-1));
                }
            }else{
                for(int i=0;i<letLen;i++){
                    sb.append(digStr.get(i));
                    sb.append(letStr.get(i));
                }
                sb.append(digStr.get(digLen-1));
            }
        }else{
            return "";
        }
        return sb.toString();
    }
}
// @lc code=end

