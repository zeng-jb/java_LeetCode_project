package jainzhi;

public class J11 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] numbers = {3,4,0,1,2};
		System.out.println(minArray(numbers));
	}
	
	 public static int minArray(int[] numbers) {
		 int left = 0;
		 int right = numbers.length-1;
		 int mid = 0;
		 while(right>left) {
			 mid = left+(right-left)/2;
			 if(numbers[right] > numbers[mid]) {
				 right = mid;	//如果右边的元素大于中间元素，则说明右边有序，忽略右边部分
			 }else if(numbers[right] < numbers[mid]){
				 left = mid+1;	//如果右边小于中间，忽略左边
			 }else {
				 right--;		//相同让右边--；
			 }
		 }
		 
		 return numbers[left];
	 }
}
