package leet;

import java.util.ArrayList;
import java.util.List;

public class Leet89 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int n =2;
		//   1<<3  ����1����3λ��ʵ�ʾ���2��3�η�8
		System.out.println(1<<n);
		System.out.println(grayCode(n));
	}
	
	public static List<Integer> grayCode(int n) {
		/**
        �ؼ��Ǹ�������ױ�������ɹ���, G(i) = i ^ (i/2);
        i/2��λ������i����һλ��i*2������һλ
        �� n = 3: 
        G(0) = 000, 
        G(1) = 1 ^ 0 = 001 ^ 000 = 001
        G(2) = 2 ^ 1 = 010 ^ 001 = 011 
        G(3) = 3 ^ 1 = 011 ^ 001 = 010
        G(4) = 4 ^ 2 = 100 ^ 010 = 110
        G(5) = 5 ^ 2 = 101 ^ 010 = 111
        G(6) = 6 ^ 3 = 110 ^ 011 = 101
        G(7) = 7 ^ 3 = 111 ^ 011 = 100
        **/
		List<Integer> ret = new ArrayList<>();
		for(int i=0;i< 1<<n;i++) {
			ret.add(i ^ i>>1);
		}
		return ret;
		
    }
}
