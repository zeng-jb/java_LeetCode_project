/*
 * @lc app=leetcode.cn id=733 lang=java
 *
 * [733] 图像渲染
 */

// @lc code=start
class Solution {
    int oldColor = 0;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        oldColor = image[sr][sc];
        return dfs(image,sr,sc,oldColor,color);
    }

    public int[][] dfs(int[][] image, int sr, int sc, int oldColor, int color){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] == color || image[sr][sc] != oldColor){
            return image;
        }
        if(image[sr][sc] == oldColor){
            image[sr][sc] = color;
        }
        dfs(image, sr+1, sc, oldColor, color);
        dfs(image, sr-1, sc, oldColor, color);
        dfs(image, sr, sc+1, oldColor, color);
        dfs(image, sr, sc-1, oldColor, color);


        return image;
    }
}
// @lc code=end

