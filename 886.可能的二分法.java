/*
 * @lc app=leetcode.cn id=886 lang=java
 *
 * [886] 可能的二分法
 */

// @lc code=start
class Solution {
    int[] fa = new int[4040];
    public int find(int x){
        return x == fa[x] ? x : (fa[x] = find(fa[x]));
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        for(int i=0;i<=n*2;i++){
            fa[i] = i;
        }

        for(int[] dis : dislikes){
            int a = find(dis[0]);
            int b = find(dis[1]);
            if(a == b) return false;
            fa[find(a+n)] = b;
            fa[find(b+n)] = a;
        }

        return true;
    }
}
// @lc code=end

