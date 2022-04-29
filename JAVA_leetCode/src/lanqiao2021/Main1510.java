package lanqiao2021;

/**
 * 蛇形矩阵（三角形填数
 * @author 123
 *
 */
public class Main1510 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int N = 40;
		int [][] nums = new int[N*2][N*2];
		
		int num = 1;
		
		for(int i=0;i<N;i++) {
			//在左上角斜着看，当i为偶数时，数是从左下到右上填充的
			if(i % 2 == 0) {
				int x = i;
				int y = 0;
				while(x >= 0) {
					nums[x][y] = num++;
					x--;
					y++;
				}
			}else {
				//当i为奇数的时候，数是从右上往左下填充的
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
