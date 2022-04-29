package leet;

import java.util.HashSet;
import java.util.Set;

public class Leet1189 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String text = "loonbalxballpoon";
		System.out.println(maxNumberOfBalloons(text));
	}

	public static int maxNumberOfBalloons(String text) {
		int b = 0 , a = 0 , l = 0 , o = 0 , n = 0;
		char [] texts = text.toCharArray();
		
		for(char c : texts) {
			
			switch (c) {
				case 'b':
					b++;
					break;
				case 'a':
					a++;
					break;
				case 'l':
					l++;
					break;
				case 'o':
					o++;
					break;
				case 'n':
					n++;
					break;
				default:
					break;
			}
		
		}
		
		return Math.min( Math.min(a, Math.min(n, b)) , Math.min(l/2, o/2) ) ;
		
    }
}
