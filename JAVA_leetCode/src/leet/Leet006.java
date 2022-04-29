package leet;

public class Leet006 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "PAYPALISHIRING";
		int numRows = 3;
		System.out.println(convert(s, numRows));
	}

	public static String convert(String s, int numRows) {
		int n = s.length();
		int r = numRows;
		if(r==1 || r>n) return s;
		
		int t = r + r - 2;
		int c = (n + t - 1) / t * (r-1);
		
		char [][] mat = new char[n][c];
		
		for(int i=0,x=0,y=0;i<n;i++) {
			mat[x][y] = s.charAt(i);
			if(i%t < r-1) {
				x++;
				//向下移动
			}else {
				//向上移动
				x--;
				y++;
			}
		}
		
		StringBuilder ans = new StringBuilder();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<c;j++) {
				if(mat[i][j] != 0) {
					ans.append(mat[i][j]);
				}
			}
		}
		
		return String.valueOf(ans);
    }
}
