package leet;

public class Leet796 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String  s = "abcde", goal = "cdeab";
		Leet796 obj = new Leet796();
		System.out.println(obj.rotateString(s, goal));
	}

	public boolean rotateString1(String s, String goal) {
		String sb = s;
		
		 do{
			s = s.substring(1, s.length()) + s.charAt(0);
			if(s.equals(goal)) {
				return true;
			}
		}while(!s.equals(sb));
		return false;
    }
	public boolean rotateString(String s, String goal) {
		return s.length()==goal.length() && (s+s).contains(goal);
	}
}
