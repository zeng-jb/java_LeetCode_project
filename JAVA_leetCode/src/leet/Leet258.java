package leet;

public class Leet258 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int num = 98;
		System.out.println(addDigits(num));
	}

	//ѭ���ⷨ����������
	public static int addDigits1(int num) {
		while(num >= 10) {
			int sum = 0;
			while(num != 0) {				
				sum += num %10;
				num /= 10;
			}
			num = sum;
		}
		return num;
    }
	
	//��ѧ������
	public static int addDigits(int num) {
		if(num == 0) {
			return 0;
		}
		//����������������9 �� ��ô������λ��ȡ��һ������9��
		if(num % 9 == 0) {
			return 9;
		}
		//�������������9����ô������λ��ȡ��9����������ȡ��9��
		return num % 9;
	}
	
}
