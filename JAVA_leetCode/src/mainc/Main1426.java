package mainc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main1426 {
	public static String start,end;
	public static int x1,y1;	//	空白格子坐标
	public static HashSet<String> set = new HashSet<>();	//存储每一步的整体状态
	public static int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};
	static class Move{
		public int x,y;	//当前空白格的位置
		public int step; 	//从初始状态到当前状态所需的步数
		public String temp;	//当前状态九宫格
		public Move(int x,int y,int step,String temp) {
			super();
			this.x = x;
			this.y = y;
			this.step = step;
			this.temp = temp;
		}
	}
	
	public  void bfs1() {
		for (int i = 0; i < start.length(); i++) {  //找到初始状态的空白格坐标
			if(start.charAt(i)=='.'){
				x1 = i/3;
				y1 = i%3;
			}
		}
		ArrayList<Move> list = new ArrayList<Move>(); //bfs模拟队列
		list.add(new Move(x1,y1,0,start));
		set.add(start);
		while(!list.isEmpty()){  
			Move now = list.get(0);
			list.remove(0);
			if(now.temp.equals(end)){
				System.out.println(now.step);
				return;
			}
			for (int i = 0; i < 4; i++) {  //模拟上下左右移动的情况
				int x = now.x+move[i][0];
				int y = now.y+move[i][1];
				if(x<0 || x>2 || y<0 || y>2)  //判断是否越界  越界则舍去这一步继续
					continue;
				int step = now.step+1;
				char n = now.temp.charAt(x*3+y);
				String temp0 = now.temp;
				temp0 = temp0.replace(n, '-');
				temp0 = temp0.replace('.', n);
				temp0 = temp0.replace('-', '.');
				if(!set.contains(temp0)){  //判断该步是否出现过，出现过则直接舍去，因为这个必定不是最优，之前已经有步骤到达过。
					set.add(temp0);
					list.add(new Move(x,y,step,temp0));
				}
			}
		}
		System.out.println("-1");
		return;
	}
	
	public void bfs() {
		//获取.的位置
		for(int i=0;i<start.length();i++) {
			if('.' == (start.charAt(i))){
				x1 = i / 3;
				y1 = i % 3;
			}
		}
		//模拟bfs队列
		ArrayList<Move> list = new ArrayList<>();
		list.add(new Move(x1, y1, 0, start));	//初始状态
		set.add(start);
		while(!list.isEmpty()) {
			Move now = list.get(0);
			list.remove(0);
			if(now.temp.equals(end)) {
				System.out.println(now.step);
				return;
			}
			
			for(int i=0;i<4;i++) {
				//模拟4个方向移动
				int x = now.x + move[i][0];
				int y = now.y + move[i][1];
				if(x<0 || x>2 || y<0 || y>2) {
					continue;	//判断越界
				}
				int step = now.step+1;	//步数加一
				char n = now.temp.charAt(x*3+y);	//被交换数字
				String temp0 = now.temp;	//当前状态
				
				temp0 = temp0.replace(n, '-');
				temp0 = temp0.replace('.', n);
				temp0 = temp0.replace('-', '.');
				
				if(!set.contains(temp0)) {		//判断当前状态是否已经存在
					set.add(temp0);
					list.add(new Move(x, y, step, temp0));
				}
			}
		}
		System.out.println(-1);
		return;
	}
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		start = scanner.next();
		end  = scanner.next();
		Main1426 m = new Main1426();
		m.bfs();
		
	}

}
