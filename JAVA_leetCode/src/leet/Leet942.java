package leet;

public class Leet942 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "IDID";
		Leet942 obj = new Leet942();
		System.out.println(obj.diStringMatch(s));
	}

	public int[] diStringMatch(String s) {
		int n = s.length();
		int[] perm = new int[n+1];
		int start = 0;
		int end = n;
		for(int i=0;i<n;i++) {
			if(s.charAt(i) == 'I') {
				perm[i] = start++;
			}else {
				perm[i] = end--;
			}
		}
		perm[n] = end;
		return perm;
    }
}
