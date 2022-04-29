package leet;

public class Leet2055 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "**|**|***|";
		int [][]queries = {{2,5},{5,9}};
		System.out.println(platesBetweenCandles(s, queries));
	}
	
	/**
	 * 前缀和解决问题
	 * @param s
	 * @param queries
	 * @return
	 */
	public static int[] platesBetweenCandles(String s, int[][] queries) {
		int n = s.length();
		int m = queries.length;
		char[] str = s.toCharArray();
		
		int [] L = new int[n];		//L数组记录在i位置的左边（包括i）离i最近的那根蜡烛的下标
		int [] R = new int[n];		//R数组记录在i位置的右边（包括i）离i最近的那根蜡烛的下标
		int []sum = new int[n+1];	//sum数组记录从0到n的*的个数，sum[0]为0；
		
		//初始化前缀和数组
		for(int i=0,j=n-1,p=-1,q=-1;i<n && j>=0;i++,j--) {
			if(str[i] == '|') p = i;
			if(str[j] == '|') q = j;
			L[i] = p;
			R[j] = q;
			sum[i+1] = sum[i] + (str[i]=='*' ? 1 : 0);
		}
		
		int [] ans = new int[m];
		for(int i=0;i<m;i++) {
			int a = queries[i][0];
			int b = queries[i][1];
			int c = R[a];		//c表示当前a这个位置离a最近的右边的蜡烛的下标
			int d = L[b];		//d表示当前b这个位置离b最近的左边的蜡烛的下标
			if(c != -1 && c <= d) {
				ans[i] = sum[d+1] - sum[c];
			}
		}
		
		return ans;
    }

}
