package leet;

public class Leet2024 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Leet2024 obj = new Leet2024();
		String answerKey = "TTFTTFTT";int k = 1;
		System.out.println(obj.maxConsecutiveAnswers(answerKey, k));
	}

	public int maxConsecutiveAnswers(String answerKey, int k) {
		return Math.max( get_max(answerKey, k,'T') , get_max(answerKey,k,'F') );
    }

	private int get_max(String answerKey, int k, char c) {
		// TODO 自动生成的方法存根
		int l = 0 ,r = 0;
		int max = Integer.MIN_VALUE;
		int n = answerKey.length();
		for( ;r<n;r++) {
			if(answerKey.charAt(r) == c) k--;
			while(k<0) {
				if(answerKey.charAt(l) == c) k++;
				l++;
			}
			max = Math.max(max, r-l+1);
		}
		return max;
	}
}
