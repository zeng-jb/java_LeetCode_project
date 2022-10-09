/*
 * @lc app=leetcode.cn id=2129 lang=java
 *
 * [2129] 将标题首字母大写
 */

// @lc code=start
class Solution {
    public String capitalizeTitle(String title) {
        String[] str = title.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length;i++){
            if(i!=0){
                sb.append(" ");
            }
            if(str[i].length() <= 2){
                sb.append(str[i]);
            }else{
                sb.append(Character.toUpperCase(str[i].charAt(0)) + str[i].substring(1));
            }
        }
        return sb.toString();
    }
}
// @lc code=end

