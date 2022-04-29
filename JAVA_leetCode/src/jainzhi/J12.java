package jainzhi;

public class J12 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		String word = "ABCCED";
		System.out.println(exist(board, word));
	}
	
	public static final int [][] dict = {{-1,0},{1,0},{0,-1},{0,1}};
	
	public static  boolean exist(char[][] board, String word) {
		char[] words = word.toCharArray();
		int m = board.length;
		int n = board[0].length;
		if(board==null || m==0 || n==0)	return false;
		boolean [][]vis = new boolean [m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(dfs(board,words,vis,i,j,0))	return true;				
			}
		}
		
		return false;
    }
	
	public static boolean dfs(char[][] board,char[] words,boolean[][]vis, int i,int j,int k) {
		if(i<0 || i>= board.length 
				|| j<0 || j>=board[0].length
				|| words[k]!=board[i][j] 
				|| vis[i][j] ) return false;
		if(k == words.length-1) return true;
		vis[i][j] = true;
		boolean ans = false;
		ans = dfs(board, words, vis, i, j+1, k+1) || dfs(board, words, vis, i, j-1, k+1)
				|| dfs(board, words, vis, i+1, j, k+1) || dfs(board, words, vis, i-1, j, k+1);
		vis[i][j] = false;
		
		return ans;
	}
}
