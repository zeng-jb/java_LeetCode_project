package leet;

public class Leet2029 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		int []stones = {2,1};
		int []stones = {5,1,2,4,3};
		System.out.println(stoneGameIX(stones));
	}

	public static boolean stoneGameIX(int[] stones) {
		
		int[] cnt = new int[3];
		
		for (int i : stones) {
			cnt[i%3]++;	//ģ3Ԥ����
		}
		
		if(cnt[0]%2==0) {	//���3�ı�����ż��������ôA���Կ������֣�ֻҪ1��2������������Ϊ0
			return (cnt[1]>0 && cnt[2]>0);
		}else {		//�����������3�ı�����Ҫ��1��2������������������ܵߵ���A����Ӯ
			return (Math.abs(cnt[1]-cnt[2]) > 2) ? true:false; 
		}	
    }
}
