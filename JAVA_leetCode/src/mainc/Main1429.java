package mainc;

import java.util.Scanner;


public class Main1429 {
	static Scanner scanner = new Scanner(System.in);
	static int N = 100;
	static int[][] borad = new int[N][N];
	static String dict = "URDL";
	static int [][] dicxy = {{-1,0},{0,1},{1,0},{0,-1}};
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				borad[i][j] = scanner.nextInt();
			}
		}
		int p = scanner.nextInt();
		int q = scanner.nextInt();
		String c = scanner.next();
		int k = scanner.nextInt();
		
		Ant ant = new Ant(p,q,dict.indexOf(c));
		walk(ant, k);
		
		System.out.println(ant.x +" "+ant.y);
	}
	
	public static void walk(Ant ant,int k) {
		while(k-- > 0) {
			if(borad[ant.x][ant.y] == 1) {
				//如果蚂蚁在黑格，那么顺时针右转90度
				ant.dic = (ant.dic+1)%4;
			}else {
				ant.dic = (ant.dic+3)%4;	//白格左转
			}
			//先变色
			if(borad[ant.x][ant.y] == 1) {
				borad[ant.x][ant.y] = 0;
			}else {
				borad[ant.x][ant.y] = 1;
			}
			//朝着头方向走一格
			ant.x = ant.x + dicxy[ant.dic][0];
			ant.y = ant.y + dicxy[ant.dic][1];
		}
	}
	
}

class Ant {
	int x , y ,dic;
	public Ant(int x,int y,int dic) {
		// TODO 自动生成的构造函数存根
		this.x = x;
		this.y = y;
		this.dic = dic;
	}
	
}

