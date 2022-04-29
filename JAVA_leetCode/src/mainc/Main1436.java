package mainc;

import java.util.Scanner;

/*
 * ����˼·:
    ��d[i][j][k][c]Ϊ�ߵ�(i,j)��ʱ�����Ϲ�K����Ʒ������ֵС��c

    ��d[i][j][k][c]ת�Ʒ����ǣ�

              ��ǰ�������Ʒ: s1= d[i-1][j][k-1][ w[i][j] ](���ϱ߼̳�)+d[i][j-1][k-1][ w[i][j] ](����߼̳�)

                     ��ǰ�����������Ʒ��������(c>a[i][j]&&k>0);

              ��ǰ������Ʒ   : s2= d[i-1][j][k][c](���ϱ߼̳�)+d[i][j-1][k][c](����߼̳�)

               �ۺ� d[i][j][k][c]= (s1+s2)%mod;

    ���ʱ�临�Ӷ�O(T)=O(i*j*k*c)=O(50*50*13*13)=O(422500) 

    ����ACʱ��:6ms;

ע������:

    ��ʼ��(i==0||j==0)��ʱ��d[i][j][k][c]=0;

    �ٽ�����(i==1&&j==1)��k!=0���� k==1��c>a[i][j]��ʱ������Ϊ1������ʱ��0��

    ����d[n][m][k][12];
 */
public class Main1436 {
	static long [][][][]dp = new long [55][55][15][15];
	static int [][]a = new int [55][55];
	static long mod = 1000000007;
	static Scanner scanner = new Scanner(System.in);
	static int n,m,K;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
