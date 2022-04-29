package leet;

public class Leet717 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] bits = {1, 1, 1, 0};
		System.out.println(isOneBitCharacter(bits));
	}

	public static boolean isOneBitCharacter(int[] bits) {
		int n = bits.length;
		int start = 0 ;
		
		while(start < n-1) {
			if(bits[start] == 0) {
				start++;
			}else {
				start+=2;
			}
			
//			start += bits[start] +1;
		}
		
		return start==n-1;
    }
}
