package jainzhi;

public class J44 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		J44 obJ44 = new J44();
		int n = 1000000000;
		int ans = obJ44.findNthDigit(n);
		System.out.println(ans);
	}
	
	public int findNthDigit(int n) {
		/* ���ַ�Χ    ����  λ��    ռ����λ
	    1-9        9      1       9
	    10-99      90     2       180
	    100-999    900    3       2700
	    1000-9999  9000   4       36000  ...

	    ���� 2901 = 9 + 180 + 2700 + 12 ��һ����4λ��,��12λ   n = 12;
	    ����Ϊ = 1000 + (12 - 1)/ 4  = 1000 + 2 = 1002
	    ��λ1002�е�λ�� = (n - 1) %  4 = 3    s.charAt(3) = 2;
	*/
		long start = 1;	//��ʼ���֣�����Ϊ1��ע����ĿҪ��0��ʼ����˺����󵽵�n��Ҫ-1
		long count = 9;	//��ǰλ��������
		int digit = 1;	//��ǰ��λ��
		
		while(count < n) {
			n -= count;
			digit++;
			start *= 10;
			count = digit*start*9;
		}
		long num = start + (n-1)/digit;
		int ans = Long.toString(num).charAt((n-1)%digit)-'0';
		return ans;
    }
}
