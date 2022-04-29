package mainc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main1492 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		String number = scanner.next();
		int k = scanner.nextInt();
		int ori , change = 0; //改变前后的数字
		int [][] can = new int [10][10]; //改变图，十个数字
		
		while(k-- != 0) {
			ori = scanner.nextInt();
			change = scanner.nextInt();
			//can标志ori-》change的变换图，有为1
			can[ori][change] = 1;
		}
		
		for(int t =0;t<10;t++) {
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					//floyd
					if(can[i][t] == 1 && can[t][j] == 1) {
						//创建新的变换规则
						can[i][j] = 1;
					}
				}
			}
		}
		
		double sum = 1;
		for(int i=0;i<number.length();i++) {
			int n1 = number.charAt(i)-'0';
			int count = 1;
			for(int j=0;j<10;j++) {
				if(can[n1][j] == 1 && n1 != j) {
					//可变换的次数
					count++;
				}
			}
			sum *= count;
		}
		
		NumberFormat nf = NumberFormat.getInstance();//初始化
		nf.setMaximumFractionDigits(20);
		nf.setGroupingUsed(false);
		
		System.out.println(nf.format(sum));
	}

}
