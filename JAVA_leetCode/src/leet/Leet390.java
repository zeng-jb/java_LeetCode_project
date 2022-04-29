package leet;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Leet390 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int n = 24;
		System.out.println(lastRemaining(n));
	}
	
	public static int lastRemaining(int n) {
		/*
		# f(n) 表示从左到右剩下的数字的结果, f'(n) 表示从右到左删除的结果
		# 对称性: f(n) + f'(n) = n + 1
		# 递归性: f(n) = 2 * f'(n/2)
		# 初始条件: f(1) = f'(1) = 1

		# 根据以上条件可得: f(2 * n)/2 + f(n) = n + 1
		# f(n)/2 + f(n/2) = n/2 + 1
		# f(n) = (n/2 + 1 - f(n/2)) * 2
	*/
		//return n > 1 ? 2 * (n/2 + 1 - lastRemaining(n/2)) : 1;
		int head = 1;	//头
		int step = 1;	//当前步数
		boolean left = true;//从左边开始
		
		while(n>1) {
			if(left || n%2==1) {
				//从左边开始删除、、、或者从右边开始，数量是奇数	head就要改变
				head = head + step;	
			}
			step *= 2;	//步长*2
			left = !left;	//改变删除方向
			n /= 2;		//每次减少一半
		}
		
		return head;
    }
}
