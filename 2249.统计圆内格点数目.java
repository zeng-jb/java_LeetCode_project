import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=2249 lang=java
 *
 * [2249] 统计圆内格点数目
 */

// @lc code=start
class Solution {
    public int countLatticePoints(int[][] circles) {
        Map<Integer,Set<Integer>> map_set = new HashMap<>();
        int ans = 0;
        for(int[] circle : circles){
            int x = circle[0];
            int y = circle[1];
            int r = circle[2];
            for(int i=x-r;i<=x+r;i++){
                for(int j=y-r;j<=y+r;j++){
                    if(isCircle(i,j,x,y,r)){
                        if(!map_set.containsKey(i)){
                            Set<Integer> temp = new HashSet<>();
                            temp.add(j);
                            map_set.put(i, temp);
                            ans++;
                        }else if(!map_set.get(i).contains(j)){
                            Set<Integer> temp = map_set.get(i);
                            temp.add(j);
                            map_set.put(i, temp);
                            ans++;
                        }
                    }
                }
            }
        }

        return ans;
    }

    public boolean isCircle(int x, int y, int x0, int y0, int r){
        return (x-x0)*(x-x0)+(y-y0)*(y-y0) <= (r*r);
    }
}
// @lc code=end

