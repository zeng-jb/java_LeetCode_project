package mainc;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main1441 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		for(int i=1;i<n;i++) {
			if(i%2==0) continue;
			else list.add(i);
		}
		
		int index = 2;
		while(true) {
			int k = list.get(index);
			ArrayList<Integer> temp = new ArrayList<>();
			temp.add(-1);
			for(int i=1;i<list.size();i++) {
				if(i%k==0) continue;
				else temp.add(list.get(i));
			}
			list = temp;
			index++;
			
			if(index > list.size()-1) break;
		}
		
		int num = 0;
		for(int i=1;i<list.size();i++) {
			if(m < list.get(i) ) {
				num++;
			}
		}
		System.out.println(num);
	}

}
