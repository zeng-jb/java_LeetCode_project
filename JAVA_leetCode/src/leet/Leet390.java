package leet;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Leet390 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		int n = 24;
		System.out.println(lastRemaining(n));
	}
	
	public static int lastRemaining(int n) {
		/*
		# f(n) ��ʾ������ʣ�µ����ֵĽ��, f'(n) ��ʾ���ҵ���ɾ���Ľ��
		# �Գ���: f(n) + f'(n) = n + 1
		# �ݹ���: f(n) = 2 * f'(n/2)
		# ��ʼ����: f(1) = f'(1) = 1

		# �������������ɵ�: f(2 * n)/2 + f(n) = n + 1
		# f(n)/2 + f(n/2) = n/2 + 1
		# f(n) = (n/2 + 1 - f(n/2)) * 2
	*/
		//return n > 1 ? 2 * (n/2 + 1 - lastRemaining(n/2)) : 1;
		int head = 1;	//ͷ
		int step = 1;	//��ǰ����
		boolean left = true;//����߿�ʼ
		
		while(n>1) {
			if(left || n%2==1) {
				//����߿�ʼɾ�����������ߴ��ұ߿�ʼ������������	head��Ҫ�ı�
				head = head + step;	
			}
			step *= 2;	//����*2
			left = !left;	//�ı�ɾ������
			n /= 2;		//ÿ�μ���һ��
		}
		
		return head;
    }
}
