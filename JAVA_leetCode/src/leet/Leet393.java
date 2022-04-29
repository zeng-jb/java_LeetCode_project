package leet;

public class Leet393 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] data = {235,140,4};
		System.out.println(validUtf8(data));
	}

	
	public static boolean validUtf8(int[] data) {
		int n = 0;
		
		for(int i=0;i<data.length;i++) {
			if(n>0) {
				//如果n大于0，说明后面有n个10开头的
				if(data[i] >> 6 != 0b10) return false;
				n--;
			}else if(data[i] >> 7 == 0b0) {
				//一个字节，后面没有跟10
				n = 0;
			}else if(data[i] >> 5 == 0b110) {
				n = 1;
			}else if(data[i] >> 4 == 0b1110) {
				n = 2;
			}else if(data[i] >> 3 == 0b11110) {
				//4个字节，后面跟3个10的
				n = 3;
			}else {
				return false;
			}
		}
		
		return n == 0;
    }
}
