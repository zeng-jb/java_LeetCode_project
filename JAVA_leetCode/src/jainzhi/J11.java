package jainzhi;

public class J11 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
				 right = mid;	//����ұߵ�Ԫ�ش����м�Ԫ�أ���˵���ұ����򣬺����ұ߲���
			 }else if(numbers[right] < numbers[mid]){
				 left = mid+1;	//����ұ�С���м䣬�������
			 }else {
				 right--;		//��ͬ���ұ�--��
			 }
		 }
		 
		 return numbers[left];
	 }
}
