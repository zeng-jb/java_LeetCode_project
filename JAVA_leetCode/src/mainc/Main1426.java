package mainc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main1426 {
	public static String start,end;
	public static int x1,y1;	//	�հ׸�������
	public static HashSet<String> set = new HashSet<>();	//�洢ÿһ��������״̬
	public static int[][] move = {{0,1},{0,-1},{1,0},{-1,0}};
	static class Move{
		public int x,y;	//��ǰ�հ׸��λ��
		public int step; 	//�ӳ�ʼ״̬����ǰ״̬����Ĳ���
		public String temp;	//��ǰ״̬�Ź���
		public Move(int x,int y,int step,String temp) {
			super();
			this.x = x;
			this.y = y;
			this.step = step;
			this.temp = temp;
		}
	}
	
	public  void bfs1() {
		for (int i = 0; i < start.length(); i++) {  //�ҵ���ʼ״̬�Ŀհ׸�����
			if(start.charAt(i)=='.'){
				x1 = i/3;
				y1 = i%3;
			}
		}
		ArrayList<Move> list = new ArrayList<Move>(); //bfsģ�����
		list.add(new Move(x1,y1,0,start));
		set.add(start);
		while(!list.isEmpty()){  
			Move now = list.get(0);
			list.remove(0);
			if(now.temp.equals(end)){
				System.out.println(now.step);
				return;
			}
			for (int i = 0; i < 4; i++) {  //ģ�����������ƶ������
				int x = now.x+move[i][0];
				int y = now.y+move[i][1];
				if(x<0 || x>2 || y<0 || y>2)  //�ж��Ƿ�Խ��  Խ������ȥ��һ������
					continue;
				int step = now.step+1;
				char n = now.temp.charAt(x*3+y);
				String temp0 = now.temp;
				temp0 = temp0.replace(n, '-');
				temp0 = temp0.replace('.', n);
				temp0 = temp0.replace('-', '.');
				if(!set.contains(temp0)){  //�жϸò��Ƿ���ֹ������ֹ���ֱ����ȥ����Ϊ����ض��������ţ�֮ǰ�Ѿ��в��赽�����
					set.add(temp0);
					list.add(new Move(x,y,step,temp0));
				}
			}
		}
		System.out.println("-1");
		return;
	}
	
	public void bfs() {
		//��ȡ.��λ��
		for(int i=0;i<start.length();i++) {
			if('.' == (start.charAt(i))){
				x1 = i / 3;
				y1 = i % 3;
			}
		}
		//ģ��bfs����
		ArrayList<Move> list = new ArrayList<>();
		list.add(new Move(x1, y1, 0, start));	//��ʼ״̬
		set.add(start);
		while(!list.isEmpty()) {
			Move now = list.get(0);
			list.remove(0);
			if(now.temp.equals(end)) {
				System.out.println(now.step);
				return;
			}
			
			for(int i=0;i<4;i++) {
				//ģ��4�������ƶ�
				int x = now.x + move[i][0];
				int y = now.y + move[i][1];
				if(x<0 || x>2 || y<0 || y>2) {
					continue;	//�ж�Խ��
				}
				int step = now.step+1;	//������һ
				char n = now.temp.charAt(x*3+y);	//����������
				String temp0 = now.temp;	//��ǰ״̬
				
				temp0 = temp0.replace(n, '-');
				temp0 = temp0.replace('.', n);
				temp0 = temp0.replace('-', '.');
				
				if(!set.contains(temp0)) {		//�жϵ�ǰ״̬�Ƿ��Ѿ�����
					set.add(temp0);
					list.add(new Move(x, y, step, temp0));
				}
			}
		}
		System.out.println(-1);
		return;
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		start = scanner.next();
		end  = scanner.next();
		Main1426 m = new Main1426();
		m.bfs();
		
	}

}
