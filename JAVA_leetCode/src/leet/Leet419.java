package leet;

public class Leet419 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		char [][] board = {{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}};
		System.out.println(countBattleships(board));
	}
	
	public static int countBattleships(char[][] board) {
		int ans = 0;
		
		for(int i = 0;i<board.length;i++) {
			for(int j=0;j<board[i].length;j++) {
				if(board[i][j] == 'X') {
					if(j>0 && board[i][j-1] == 'X') continue;
					if(i>0 && board[i-1][j] == 'X') continue;
					ans++;
				}
			}
		}
		
		return ans;
    }

}
