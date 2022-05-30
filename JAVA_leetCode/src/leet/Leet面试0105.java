package leet;

public class Leet面试0105 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String first = "pale",
				second = "ple";
		System.out.println(oneEditAway(first, second));
	}

	public static boolean oneEditAway(String first, String second) {
		int m = first.length();
		int n = second.length();
		if(Math.abs(m-n) > 1) {
			return false;
		}
		if(m > n) {
			return oneEditAway(second, first);
		}
		
		for(int i=0,edit=0;i<m;i++) {
			if(first.charAt(i) != second.charAt(i - (m-n)*edit) && ++edit < 1) {
				return false;
			}
		}
		return true;
    }
}
