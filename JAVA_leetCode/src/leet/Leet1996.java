package leet;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;

public class Leet1996 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int [][] properties = {{5,5},{6,3},{3,6}};
		System.out.println(numberOfWeakCharacters1(properties));
	}
	
	public static int numberOfWeakCharacters(int[][] properties) {
		int ans = 0;
		Arrays.sort(properties,new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO �Զ����ɵķ������
				if(o1[0]==o2[0]) return o1[1]-o2[1];
				return o2[0]-o1[0];
			}
		});
		int n = properties.length;
		int max = -1;
		for(int i=0;i<n;i++) {
			if(max>properties[i][1]) {
				ans++;
			}
			max = Math.max(max, properties[i][1]);
		}
		
		return ans;
    }
	
	public static int numberOfWeakCharacters1(int[][] properties) {
		int ans = 0;
		//����ջ��������ֵ���������Ȱ�����ֵ����
		Arrays.sort(properties,new Comparator<int[]>() {
			
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO �Զ����ɵķ������
				if(o1[0]==o2[0]) return o2[1]-o1[1];
				return o1[0]-o2[0];
			}
		});
		int n = properties.length;
		 Deque<Integer> st = new ArrayDeque<>();	//�洢����ֵ
		for(int i=0;i<n;i++) {
			while(!st.isEmpty() && st.peek() < properties[i][1]) {
				ans++;
				st.pop();
			}
			st.push(properties[i][1]);
		}
		
		return ans;
    }
}
