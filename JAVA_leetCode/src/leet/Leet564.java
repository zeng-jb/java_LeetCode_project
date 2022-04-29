package leet;

import java.util.ArrayList;
import java.util.List;

public class Leet564 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s = "9876";
		System.out.println(nearestPalindromic(s));
	}

	
	/*
	 * Ѱ������Ļ�����
	 * ��ԭ����ǰ�벿���滻��벿�ֵõ��Ļ���������

		��ԭ����ǰ�벿�ּ�һ��Ľ���滻��벿�ֵõ��Ļ���������
		
		��ԭ����ǰ�벿�ּ�һ��Ľ���滻��벿�ֵõ��Ļ���������
		
		Ϊ��ֹλ���仯���¹���Ļ��������������ֱ�ӹ��� 999\dots 999999��999 �� 100\dots 001100��001 ��Ϊ��ѡ�𰸡�

	 * 
	 * 
	 */
	public static String nearestPalindromic(String n) {
		long selfNumber = Long.parseLong(n) ,  ans = -1;
		
		List<Long> candidates = getCandidates(n);
		
		for(long candidate : candidates) {
			if(candidate != selfNumber) {
				if(ans == -1 ||
					Math.abs(candidate - selfNumber) < Math.abs(ans - selfNumber) ||
					Math.abs(candidate - selfNumber) == Math.abs(ans - selfNumber) && candidate < ans) {	//�������ֵ��ȷ�����ߵ�
						ans = candidate;
				}
			}
		}
		return Long.toString(ans);
    }


	private static List<Long> getCandidates(String s) {
		// TODO �Զ����ɵķ������
		int len = s.length();
		List<Long> candidates = new ArrayList<Long>() {
			{
				add((long)Math.pow(10, len-1) - 1);		//����߽�����123��99 �� 1001
				add((long)Math.pow(10, len) + 1);
			}
		};
		
		long selfPrefix = Long.parseLong(s.substring(0, (len+1)/2));	//�����ǰһ��
		for(long i=selfPrefix-1 ; i<= selfPrefix+1 ; i++) {
			//�������ǰһ���-1 `  +1�ҳ����ġ� 
			StringBuilder sb = new StringBuilder();
			String prefix = String.valueOf(i);
			sb.append(prefix);
			
			StringBuilder suffix = new StringBuilder(prefix).reverse();
			//�����׺�����len����Ϊ������ô��ʼ�Ӵ�Ϊ1��������ʼΪ0
			sb.append(suffix.substring(len & 1));
			
			String candidate = sb.toString();
			candidates.add(Long.parseLong(candidate));
		}
		
		return candidates;
	}
}
