/**
 * 
 */
package leet;

import java.util.Scanner;

/**
 * @author 123
 *���ξ�������1��ʼ����Ȼ���������гɵ�һ�������������Ρ�
 *	����
		�����ж������ݣ�ÿ��������һ��������N��ɡ���N������100��
	���
		����ÿһ�����ݣ����һ��N�е����ξ����������֮�䲻Ҫ����Ŀ��С�����������ͬһ�е�������һ���ո�ֿ�����β��Ҫ����Ŀո�
 */
public class Main1097 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int num =  scanner.nextInt();
			int [][] sneike = new int[num][num];
			sneike[0][0] = 1;
			for(int i=1;i<num;i++) {
				//�����һ��
				sneike[i][0] = sneike[i-1][0] + i;
			}
			//����������
			for(int i=0;i<num;i++) {
				for(int j=1;j<num-i;j++) {
					sneike[i][j] = sneike[i][j-1] + i + j + 1;
				}
			}
			//���
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
