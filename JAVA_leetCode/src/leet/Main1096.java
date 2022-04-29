package leet;


import java.util.Scanner;

public class Main1096 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int count=0;
		while (sc.hasNext()) {
			int m = sc.nextInt() ;
			int n = sc.nextInt();
			if(m==0 && n==0) break;
			char [][] minesweeper =  readChar(m,n);
			int [][] numCount = sort(minesweeper);
			count++;
			output(numCount,count);
		}
	}
	
	public static char[][] readChar(int m,int n) {
		
		char [][] minesweeper = new char[m][n];
		String [] filds = new String[m] ;
		sc.nextLine();
		for(int i = 0;i<m;i++) {
			filds[i] = sc.nextLine();
		}
		
		for(int i=0;i<filds.length;i++) {
			String[] str = filds[i].split(" ");
			
			for(int j = 0;j<n;j++) {
				minesweeper[i][j] = str[0].charAt(j);
			}
		}
		
		return minesweeper;
	}
	
	public static int[][] sort(char [][] minesweeper) {
		int [][]  numcount  = new int [minesweeper.length][minesweeper[0].length];
		
		int [][] direc = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
		int m = minesweeper.length , n = minesweeper[0].length;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(minesweeper[i][j]=='*') {
					numcount[i][j] = -1;
					for(int k =0;k<8;k++) {
						int ni = i+ direc[k][0], nj = j + direc[k][1];
						if((ni>=0 && ni < m) && (nj>=0 && nj < n) && numcount[ni][nj]!=-1){
							numcount[ni][nj]++;
						}
					}
				}
			}
		}
		
		return numcount;
		
	}
	
	public static void output(int [][] numCount,int count) {
		System.out.println("Field #"+count+":");
		for(int i=0;i<numCount.length;i++) {
			for(int j=0;j<numCount[i].length;j++) {
				if(numCount[i][j]==-1)
					System.out.print('*');
				else
					System.out.print(numCount[i][j]);
					
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
