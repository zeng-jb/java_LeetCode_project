package mainc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main1492 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		String number = scanner.next();
		int k = scanner.nextInt();
		int ori , change = 0; //�ı�ǰ�������
		int [][] can = new int [10][10]; //�ı�ͼ��ʮ������
		
		while(k-- != 0) {
			ori = scanner.nextInt();
			change = scanner.nextInt();
			//can��־ori-��change�ı任ͼ����Ϊ1
			can[ori][change] = 1;
		}
		
		for(int t =0;t<10;t++) {
			for(int i=0;i<10;i++) {
				for(int j=0;j<10;j++) {
					//floyd
					if(can[i][t] == 1 && can[t][j] == 1) {
						//�����µı任����
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
					//�ɱ任�Ĵ���
					count++;
				}
			}
			sum *= count;
		}
		
		NumberFormat nf = NumberFormat.getInstance();//��ʼ��
		nf.setMaximumFractionDigits(20);
		nf.setGroupingUsed(false);
		
		System.out.println(nf.format(sum));
	}

}
