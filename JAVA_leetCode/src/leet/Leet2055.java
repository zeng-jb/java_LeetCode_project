package leet;

public class Leet2055 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s = "**|**|***|";
		int [][]queries = {{2,5},{5,9}};
		System.out.println(platesBetweenCandles(s, queries));
	}
	
	/**
	 * ǰ׺�ͽ������
	 * @param s
	 * @param queries
	 * @return
	 */
	public static int[] platesBetweenCandles(String s, int[][] queries) {
		int n = s.length();
		int m = queries.length;
		char[] str = s.toCharArray();
		
		int [] L = new int[n];		//L�����¼��iλ�õ���ߣ�����i����i������Ǹ�������±�
		int [] R = new int[n];		//R�����¼��iλ�õ��ұߣ�����i����i������Ǹ�������±�
		int []sum = new int[n+1];	//sum�����¼��0��n��*�ĸ�����sum[0]Ϊ0��
		
		//��ʼ��ǰ׺������
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
			int c = R[a];		//c��ʾ��ǰa���λ����a������ұߵ�������±�
			int d = L[b];		//d��ʾ��ǰb���λ����b�������ߵ�������±�
			if(c != -1 && c <= d) {
				ans[i] = sum[d+1] - sum[c];
			}
		}
		
		return ans;
    }

}
