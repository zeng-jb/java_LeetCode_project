/*
 * @lc app=leetcode.cn id=1041 lang=java
 *
 * [1041] 困于环中的机器人
 */

// @lc code=start
class Solution {
    int[][] vecs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 
    public boolean isRobotBounded(String instructions) {
        int x = 0, y = 0, dir = 0;
        for (char c : instructions.toCharArray()) {
            if (c == 'G') {
                x += vecs[dir][0];
                y += vecs[dir][1];
            } else if (c == 'L') {
                dir = (dir + 3) % 4;
            } else {
                dir = (dir + 1) % 4;
            }
        }
        if (dir == 0) return x == 0 && y == 0;
        return true;
    }
}
// @lc code=end

