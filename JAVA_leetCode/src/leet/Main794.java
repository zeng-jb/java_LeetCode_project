package leet;

public class Main794 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
//		String[] board = {"O  ","   ","   "};
		String[] board = {"XOX","O O","XOX"};
		System.out.println(validTicTacToe(board));
	}
	
	 static boolean validTicTacToe(String[] board) {
		
		//x��o��1������ȣ�����false
		if(!boradDiff(board))
			return false;
		
		//x��o����ͬʱ��ʤ������false
		if(isWinner(board,'X') && isWinner(board,'O'))
			return false;
		
		//x��ʤ�ұ�o��һ��������false
		int xnum = count(board, 'X');
		int onum = count(board, 'O');
		if(isWinner(board, 'X') && xnum-onum != 1)
			return false;
		//o��ʤ�����x������false
		if(isWinner(board, 'O') && xnum-onum != 0)
			return false;
		
		return true;
	}
	
	static boolean boradDiff(String[] board) {
		int xnum = 0 , onum = 0;
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length();j++) {
				if(board[i].charAt(j) == 'X') xnum++;
				if(board[i].charAt(j) == 'O') onum++;

			}
		}
		if(xnum-onum == 1 || xnum == onum)
			return true;
		else
			return false;
	}
	
	static boolean isWinner(String[] board, char c) {
		
		//��ʤ����б����
		if(board[0].charAt(0) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(2) && board[0].charAt(0) == c)  return true;
		if(board[0].charAt(2) == board[1].charAt(1) && board[1].charAt(1) == board[2].charAt(0) && board[0].charAt(2) == c)  return true;
		for (int i = 0; i < board.length; i++) {
			if(board[i].charAt(0) == board[i].charAt(1) && board[i].charAt(1) == board[i].charAt(2) && board[i].charAt(0) == c) return true;
			if(board[0].charAt(i) == board[1].charAt(i) && board[1].charAt(i) == board[2].charAt(i) && board[0].charAt(i) == c) return true;	
		}
		
		return false;
	}
	
	 static int count(String[] board ,char c) {
		int num = 0;
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board[i].length();j++) {
				if(board[i].charAt(j) == c) num++;
			}
		}
		
		return num;
	}
	
}
