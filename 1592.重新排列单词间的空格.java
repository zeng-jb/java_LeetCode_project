import java.util.List;

/*
 * @lc app=leetcode.cn id=1592 lang=java
 *
 * [1592] 重新排列单词间的空格
 */

// @lc code=start
class Solution {
    public String reorderSpaces(String text) {
        int cnt = 0;
        int n = text.length();
        List<String> list = new ArrayList<>();

        for(int i=0;i<n;){
            if(text.charAt(i) == ' ' && ++i>=0 && ++cnt>=0) continue;
            int j = i;
            while(j<n && text.charAt(j) != ' ') j++;
            list.add(text.substring(i, j));
            i = j;
        }

        StringBuilder sb = new StringBuilder();
        int m = list.size();
        int t = cnt / Math.max(m-1,1);
        
        String k = "";
        while(t-- > 0) k += " ";

        for(int i=0;i<m;i++){
            sb.append(list.get(i));
            if(i != m-1) sb.append(k);
        }

        while(sb.length() != n) sb.append(" ");

        return sb.toString();
    }
}
// @lc code=end

