package leet;

public class Leet1716 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int n = 20;
		System.out.println(totalMoney(n));
	}
	
	public static int totalMoney(int n) {
		int mon = 1;
		int sum = 0;
		int x = mon;
		for(int i=1;i<=n;i++) {
			sum+=x;
			if(i%7==0) {
				mon++;
				x = mon;
			}else {				
				x++;
			}
		}		
		return sum;
    }
}
