package mainc;

import java.util.Scanner;

/*
 * 解题思路:
    设d[i][j][k][c]为走到(i,j)的时候，手上共K个物品，最大价值小于c

    则d[i][j][k][c]转移方程是：

              当前拿这个物品: s1= d[i-1][j][k-1][ w[i][j] ](从上边继承)+d[i][j-1][k-1][ w[i][j] ](从左边继承)

                     当前可以拿这个物品的条件是(c>a[i][j]&&k>0);

              当前不拿物品   : s2= d[i-1][j][k][c](从上边继承)+d[i][j-1][k][c](从左边继承)

               综合 d[i][j][k][c]= (s1+s2)%mod;

    最大时间复杂度O(T)=O(i*j*k*c)=O(50*50*13*13)=O(422500) 

    本题AC时间:6ms;

注意事项:

    初始化(i==0||j==0)的时候d[i][j][k][c]=0;

    临界条件(i==1&&j==1)当k!=0或者 k==1且c>a[i][j]的时候设置为1，其他时候0；

    答案是d[n][m][k][12];
 */
public class Main1436 {
	static long [][][][]dp = new long [55][55][15][15];
	static int [][]a = new int [55][55];
	static long mod = 1000000007;
	static Scanner scanner = new Scanner(System.in);
	static int n,m,K;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		n = scanner.nextInt();
		m = scanner.nextInt();
		K = scanner.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i+1][j+1] = scanner.nextInt();
			}
		}
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<m+1;j++) {
				for(int k=0;k<K+1;k++) {
					for(int c=0;c<13;c++) {
						long na=0,buna=0;
						
						if(i==1 && j==1) {
							if(k==0 || (k==1 && c>a[i][j])) {
								dp[i][j][k][c] = 1;
							}				 
							continue;
						}
						
						if(k>0 && c>a[i][j]) {
							na = dp[i-1][j][k-1][a[i][j]] + dp[i][j-1][k-1][a[i][j]];
						}
						
						buna = dp[i-1][j][k][c] + dp[i][j-1][k][c];
						
						dp[i][j][k][c] = (na+buna)%mod;
					}
				}
			}
		}
		
		System.out.println(dp[n][m][K][12]);
	}

}
