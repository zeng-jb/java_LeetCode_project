package jainzhi;

public class J20 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s = "12e";
		System.out.println(isNumber(s));
	}
	
	public static boolean isNumber(String s) {
		//String regex = "\\s*[+-]?[0-9]*((\\.[0-9])|([0-9]\\.)|[0-9])[0-9]*([eE][+-]?[0-9]+)?\\s*";
		String regex = "\\s*[+-]?\\d*((\\.\\d|\\d\\.)|\\d)\\d*([eE][+-]?\\d+)?\\s*";
		return s.matches(regex);
    }
	
	public static boolean isNumber1(String s) {
		if(s == null || s.length() == 0) return false;
		char [] str = s.trim().toCharArray();
		boolean isNum = false , isDot = false , ise_or_E = false;
		for(int i=0;i<str.length;i++) {
			if(str[i] >= '0' && str[i] <= '9') isNum = true;
			else if(str[i] == '.') {
				if(isDot || ise_or_E) return false;
				isDot = true;
			}else if(str[i] == 'e' || str[i] == 'E') {
				if(!isNum || ise_or_E) return false;
				ise_or_E = true;
				isNum = false;
			}else if(str[i] == '+' || str[i] == '-') {
				if(i!=0 && str[i-1] != 'e' && str[i-1] != 'E') return false;
			}else {
				return false;
			}
		}
		
		return isNum;
	}
}
