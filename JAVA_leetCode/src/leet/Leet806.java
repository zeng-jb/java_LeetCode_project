package leet;

public class Leet806 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		String S = "bbbcccdddaaa";
		Leet806 obj = new Leet806();
		System.out.println(obj.numberOfLines(widths, S));
	}

	public int[] numberOfLines(int[] widths, String s) {
		int count = 0;
		int row = 1;
		for(char ch : s.toCharArray()) {
			if(count+widths[ch-'a'] > 100) {
				count = 0;
				row++;
			}
			count += widths[ch-'a'];
		}
		return new int[] {row,count};
    }
}
