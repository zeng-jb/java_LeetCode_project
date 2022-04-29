package jainzhi;

import java.util.Arrays;
import java.util.PriorityQueue;

public class J40 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int [] arr = {3,2,1};
		int k = 2;
		System.out.println(getLeastNumbers(arr, k));
	}

	public static int[] getLeastNumbers1(int[] arr, int k) {
		if(k==0 || arr.length==0) {
			return new int[0];
		}
		//���ţ�k-1�ǲ��ҵ��±�֮ǰ����
		return quickSearch(arr,0,arr.length-1,k-1);
	}

	private static int[] quickSearch(int[] arr, int low, int hight, int k) {
		// TODO �Զ����ɵķ������
		//���ÿ��Ŷ�λk
		int j = partition(arr,low,hight);
		if(j == k) {
			return Arrays.copyOf(arr, j+1);
		}
		//���j����k˵�����ұߣ��������
		return j > k ? quickSearch(arr, low, j-1, k) : quickSearch(arr, j+1, hight, k);
	}

	 // �����з֣������±�j��ʹ�ñ�nums[j]С��������j����ߣ���nums[j]���������j���ұߡ�
	private static int partition(int[] arr, int low, int hight) {
		// TODO �Զ����ɵķ������
		int v = arr[low];
		int i = low , j = hight+1;
		while(true) {
			while(++i <= hight && arr[i] < v);
			while(--j >= low && arr[j] > v);
			
			if(i >= j) break;
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		arr[low] = arr[j];
		arr[j] = v;
		return j;
	}
	
	//���ô���ѣ�ά����k�Ĵ�С���洢k�����֣��Ѵ�Ķ��ų���ʣ�µĶ���С��
	public static int[] getLeastNumbers(int[] arr, int k) {
		if(k==0 || arr.length==0) {
			return new int[0];
		}
		//�Ӵ�С�����ȶ��У������
		PriorityQueue<Integer> pq = new PriorityQueue<>((v1,v2) -> v2-v1);
		
		for(int num : arr) {
			if(k > pq.size()) {
				pq.offer(num);
			}else if(num < pq.peek()) {
				pq.poll();
				pq.offer(num);
			}
		}
		
		int [] ans = new int[k];
		for(int i=0;i<k;i++) {
			ans[i] = pq.poll();
		}
		
		return ans;
	}
	
}
