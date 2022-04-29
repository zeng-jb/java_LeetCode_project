package leet;

public class Leet0167 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int []numbers = {2,7,11,15};
		int target = 9;
		Leet0167 obj = new Leet0167();
		System.out.println(obj.twoSum(numbers, target));
	}

	public int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length-1;
		
		while(left < right) {
			if(numbers[left] + numbers[right] > target) {
				right--;
			}else if(numbers[left] + numbers[right] < target) {
				left++;
			}else {
				return new int[] {left+1,right+1};
			}
		}
		
		return new int[0];
    }
}
