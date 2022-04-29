package jainzhi;

public class J15 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 int n = -3;
		System.out.println(hammingWeight(n));
	}

	/**
	 * �����޷��������Ķ�������λ��Ϊ1�ĸ���
	 * @param n	ʮ��������ע��java��û���޷�������˵����int��32λ��
	 * @return	λ��Ϊ1�ĸ���
	 */
	public static int hammingWeight(int n) {
        int count = 0;
        while(n!=0) {
        	//��n�룭1֮�����룬ȥ�������λ��1���ж��ٸ�1�Ϳ���������ٴ�
        	count++;
        	n &= n-1;
        }
//       return Integer.bitCount(n);   //�⺯��������һ�����Ķ�����1�ĸ���
        return count;
    }
	
	/**
	 * ������ i λʱ�����ǿ����� n�� 2^i���������㣬���ҽ��� n �ĵ� i λΪ 1 ʱ����������Ϊ 0��
	 * @param n
	 * @return
	 */
	   public int hammingWeight1(int n) {
	        int ret = 0;
	        for (int i = 0; i < 32; i++) {
	            if ((n & (1 << i)) != 0) {
	                ret++;
	            }
	        }
	        return ret;
	    }


}
