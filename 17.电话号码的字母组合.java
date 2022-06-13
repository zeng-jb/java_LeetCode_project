import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=17 lang=java
 *
 * [17] 电话号码的字母组合
 */

// @lc code=start
class Solution {
    List<String> list = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0){
            return list;
        }
        //初始对应所有的数字，为了直接对应2-9，新增了两个无效的字符串""
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backTracking(digits,numString,0);
        return list;
    }

    StringBuilder temp = new StringBuilder();

    public void backTracking(String digits , String[] numString , int num){
        if(num == digits.length()){
            list.add(temp.toString());
            return;
        }
        String str = numString[digits.charAt(num) - '0'];
        for(int i=0;i<str.length();i++){
            temp.append(str.charAt(i));
            backTracking(digits, numString, num+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
// @lc code=end

