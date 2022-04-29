package leet;

import java.util.ArrayList;
import java.util.List;

public class Leet969 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int arr [] = {3,2,4,1};
		System.out.println(pancakeSort(arr));
	}

	 public static List<Integer> pancakeSort(int[] arr) {
		 List<Integer> res = new ArrayList<>();
		 for(int n=arr.length;n>1;n--) {
			 int index = 0;
			 for(int i=1;i<n;i++) {
				 if(arr[i]>=arr[index]) {
					 index = i;
				 }				 
			 }
			 if(index == n-1) continue;
			 reverse(arr,index);
			 reverse(arr,n-1);
			 res.add(index+1);
			 res.add(n);	
		 }
		 
		 return res;
	 }

	private static void reverse(int[] arr, int end) {
		// TODO 自动生成的方法存根
		for(int i=0,j=end;i<j;i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
