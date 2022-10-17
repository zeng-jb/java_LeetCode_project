import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=914 lang=java
 *
 * [914] 卡牌分组
 */

// @lc code=start
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int d : deck){
            map.put(d, map.getOrDefault(d, 0)+1);
        }
        
        int x = 0;
        for(int v : map.values()){
            x = gcd(x, v);
            if(x == 1){
                return false;
            }
        }
        return x >= 2;
    }

    public int gcd(int a, int b){
        return b==0 ? a : gcd(b, a%b);
    }
}
// @lc code=end

