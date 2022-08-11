/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    int m, n;
    int[][] dict = {{0,1},{0,-1},{1,0},{-1,0}};
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(board,visited,word,i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, boolean[][] visited, String word, int i, int j, int step){
        if(step == word.length()-1 && board[i][j] == word.charAt(step)) return true;

        if(board[i][j] == word.charAt(step)){
            visited[i][j] = true;
            for(int[] dic : dict){
                int x = i + dic[0];
                int y = j + dic[1];
                if(x>=0 && x<m && y>=0 && y<n && !visited[x][y]){
                    if(dfs(board, visited, word, x, y, step+1)){
                        return true;
                    }
                }
            }
            visited[i][j] = false;
        }
        return false;

    }
}
// @lc code=end

