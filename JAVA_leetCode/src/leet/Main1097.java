/**
 * 
 */
package leet;

import java.util.Scanner;

/**
 * @author 123
 *蛇形矩阵是由1开始的自然数依次排列成的一个矩阵上三角形。
 *	输入
		本题有多组数据，每组数据由一个正整数N组成。（N不大于100）
	输出
		对于每一组数据，输出一个N行的蛇形矩阵。两组输出之间不要额外的空行。矩阵三角中同一行的数字用一个空格分开。行尾不要多余的空格。
 */
public class Main1097 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num =  scanner.nextInt();
			int [][] sneike = new int[num][num];
			sneike[0][0] = 1;
			for(int i=1;i<num;i++) {
				//处理第一列
				sneike[i][0] = sneike[i-1][0] + i;
			}
			//处理其他；
			for(int i=0;i<num;i++) {
				for(int j=1;j<num-i;j++) {
					sneike[i][j] = sneike[i][j-1] + i + j + 1;
				}
			}
			//输出
			for(int i=0;i<num;i++) {
				for(int j= 0;j<num-i;j++) {
					if(j!=num-i-1)
						System.out.print(sneike[i][j] + " ");
					else
						System.out.println(sneike[i][j]);						
				}
			}
			
		}
	}

}
