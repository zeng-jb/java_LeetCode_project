package jainzhi;

public class J04 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s = "We are happy.";
		s=s.replaceAll(" ", "%20");
		System.out.println(s);
	}

	public static boolean findNumberIn2DArray(int[][] matrix, int target) {
		if(matrix==null || matrix.length ==0) return false;
		int n = matrix.length;
		int m = matrix[0].length;
		int row = 0,col = m-1;
		//�����Ͻǿ�ʼ�������ǰ����Ŀ�꣬��col--��������row++�����򷵻�true
		while(row < n && col >=0) {
			if(matrix[row][col] > target) {
				col--;
			}else if(matrix[row][col] < target) {
				row++;
			}else {
				return true;
			}
		}
		
		return false;
    }
}
