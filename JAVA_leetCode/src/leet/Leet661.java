package leet;

public class Leet661 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][]img = {{100,200,100},{200,50,200},{100,200,100}};
		Leet661 obj = new Leet661();
		System.out.println(obj.imageSmoother(img));
	}
	
	public int[][] imageSmoother(int[][] img) {
		int m = img.length , n = img[0].length;
		int[][] smoother = new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				int sum = 0;
				int count = 0;
				for(int x=-1;x<=1;x++) {
					for(int y=-1;y<=1;y++) {
						int nx = i + x;
						int ny = j + y;
						if(nx < 0 || nx >= m ||ny < 0 || ny >= n) continue;
						sum += img[nx][ny];
						count++;
					}
				}
				smoother[i][j] = Math.floorDiv(sum, count);
			}
		}
		
		return smoother;
    }

}
