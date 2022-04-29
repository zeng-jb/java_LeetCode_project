package leet;

public class Leet2038 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String colors = "AAABABB";
		System.out.println(winnerOfGame(colors));
	}

	public static boolean winnerOfGame(String colors) {
		int count = 0;
		for(int i=0;i<colors.length()-2;i++) {
			if(colors.substring(i, i+3).equals("AAA")) count++;
			if(colors.substring(i, i+3).equals("BBB")) count--;
 		}
		
		return count > 0;
	}
}
