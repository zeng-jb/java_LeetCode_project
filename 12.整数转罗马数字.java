/*
 * @lc app=leetcode.cn id=12 lang=java
 *
 * [12] 整数转罗马数字
 */

// @lc code=start
class Solution {
    int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
   
    String[] thousands = {"", "M", "MM", "MMM"};
    String[] hundreds  = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] tens      = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] ones      = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

    public String intToRoman(int num) {
        // String res = "";
        // for(int i=0;i<13;i++){
        //     while(num >= values[i]){
        //         num -= values[i];
        //         res += symbols[i];
        //     }
        // }
        // return res;
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(thousands[num/1000]);
        sBuilder.append(hundreds[num%1000/100]);
        sBuilder.append(tens[num%100/10]);
        sBuilder.append(ones[num%10]);
        return sBuilder.toString();
    }
}
// @lc code=end

