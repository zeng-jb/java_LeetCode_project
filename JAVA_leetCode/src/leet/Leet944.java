package leet;

public class Leet944 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] strs = {"zyx","wvu","tsr"};
		System.out.println(new Leet944().minDeletionSize(strs));
	}

	public int minDeletionSize(String[] strs) {
		int m = strs.length;
		int n = strs[0].length();
		int count = 0;
		
		for(int j=0;j<n;j++) {
			for(int i=1;i<m;i++) {
				if(strs[i].charAt(j) < strs[i-1].charAt(j)) {
					count++;
					break;
				}
			}
		}
		return count;
    }
}
