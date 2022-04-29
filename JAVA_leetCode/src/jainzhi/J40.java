package jainzhi;

import java.util.Arrays;
import java.util.PriorityQueue;

public class J40 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] arr = {3,2,1};
		int k = 2;
		System.out.println(getLeastNumbers(arr, k));
	}

	public static int[] getLeastNumbers1(int[] arr, int k) {
		if(k==0 || arr.length==0) {
			return new int[0];
		}
		//快排，k-1是查找到下标之前的数
		return quickSearch(arr,0,arr.length-1,k-1);
	}

	private static int[] quickSearch(int[] arr, int low, int hight, int k) {
		// TODO 自动生成的方法存根
		//利用快排定位k
		int j = partition(arr,low,hight);
		if(j == k) {
			return Arrays.copyOf(arr, j+1);
		}
		//如果j大于k说明在右边，否则左边
		return j > k ? quickSearch(arr, low, j-1, k) : quickSearch(arr, j+1, hight, k);
	}

	 // 快排切分，返回下标j，使得比nums[j]小的数都在j的左边，比nums[j]大的数都在j的右边。
	private static int partition(int[] arr, int low, int hight) {
		// TODO 自动生成的方法存根
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
	
	//利用大根堆，维护堆k的大小，存储k个数字，把大的都排除，剩下的都是小的
	public static int[] getLeastNumbers(int[] arr, int k) {
		if(k==0 || arr.length==0) {
			return new int[0];
		}
		//从大到小的优先队列，大跟堆
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
