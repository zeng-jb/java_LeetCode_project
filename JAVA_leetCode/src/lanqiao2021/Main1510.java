package lanqiao2021;

/**
 * ���ξ�������������
 * @author 123
 *
 */
public class Main1510 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int N = 40;
		int [][] nums = new int[N*2][N*2];
		
		int num = 1;
		
		for(int i=0;i<N;i++) {
			//�����Ͻ�б�ſ�����iΪż��ʱ�����Ǵ����µ���������
			if(i % 2 == 0) {
				int x = i;
				int y = 0;
				while(x >= 0) {
					nums[x][y] = num++;
					x--;
					y++;
				}
			}else {
				//��iΪ������ʱ�����Ǵ���������������
				int x = 0;
				int y = i;
				while(y >= 0) {
					nums[x][y] = num++;
					x++;
					y--;
				}
			}
		}
		
//		for(int i=0;i<N;i++) {
//			for(int j=0;j<N;j++) {
//				System.out.print(nums[i][j] + "\t");
//			}
//			System.out.println();
//		}
		
		System.out.println(nums[19][19]);
	}

}
