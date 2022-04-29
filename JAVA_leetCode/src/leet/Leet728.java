package leet;

import java.util.ArrayList;
import java.util.List;

public class Leet728 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Leet728 obj = new Leet728();
		int left = 47;
		int right = 85;
		System.out.println(obj.selfDividingNumbers(left, right));
	}

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<>();
		for(int i=left;i<=right;i++) {
			int num = i;
			boolean flag = true;
			while(num != 0) {
				int j = num%10;
				num /= 10;
				if( j == 0 || i%j != 0) {
					flag = false;
					break;
				}
			}
			if(flag) {
				list.add(i);
			}
		}
		return list;
    }
}
