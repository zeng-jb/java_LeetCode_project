import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=811 lang=java
 *
 * [811] 子域名访问计数
 */

// @lc code=start
class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {

        Map<String,Integer> map = new HashMap<>();
        for(String s : cpdomains){
            String[] str = s.split(" ");
            int a = Integer.parseInt(str[0]);
            map.put(str[1], map.getOrDefault(str[1], 0)+a);
            for(int j=0;j<str[1].length();j++){
                if(str[1].charAt(j) == '.'){
                    String net = str[1].substring(j+1);
                    map.put(net, map.getOrDefault(net, 0)+a);
                }
            }
        }

        List<String> list = new ArrayList<>();
        for(String key : map.keySet()){
            list.add(map.get(key) +" "+ key);
        }
        return list;
    }
}
// @lc code=end

