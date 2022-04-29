package leet;

public class Leet393 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] data = {235,140,4};
		System.out.println(validUtf8(data));
	}

	
	public static boolean validUtf8(int[] data) {
		int n = 0;
		
		for(int i=0;i<data.length;i++) {
			if(n>0) {
				//���n����0��˵��������n��10��ͷ��
				if(data[i] >> 6 != 0b10) return false;
				n--;
			}else if(data[i] >> 7 == 0b0) {
				//һ���ֽڣ�����û�и�10
				n = 0;
			}else if(data[i] >> 5 == 0b110) {
				n = 1;
			}else if(data[i] >> 4 == 0b1110) {
				n = 2;
			}else if(data[i] >> 3 == 0b11110) {
				//4���ֽڣ������3��10��
				n = 3;
			}else {
				return false;
			}
		}
		
		return n == 0;
    }
}
