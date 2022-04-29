package leet;

public class Leet682 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String [] ops = {"5","2","C","D","+"};
		Leet682 obj = new Leet682();
		System.out.println(obj.calPoints(ops));
	}

	
	public int calPoints(String[] ops) {
		int sum  = 0;
		int len = ops.length;
		int arr[] = new int[len];
		int i = 0;
		for(String s : ops) {
			switch(s) {
				case "+": arr[i] = arr[i-1] + arr[i-2];i++;break;
				case "D": arr[i] = 2*arr[i-1];i++;break;
				case "C": arr[i-1] = 0;i--;break;
				default : arr[i] = Integer.valueOf(s);i++;
			}
		}
		for(int j=0;j<arr.length;j++) {
			sum += arr[j];
		}
		return sum;
    }
}
