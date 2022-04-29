package leet;

public class Leet504 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num = 0;
		System.out.println(convertToBase7(num));
	}

	
	public static String convertToBase7(int num) {
		
		if(num == 0)return "0";
//		return Integer.toString(num, 7);
		StringBuilder sbBuilder = new StringBuilder();
	    boolean nati = false;
	    
	    if(num < 0) {
	    	nati = true;
	    	num = -num;
	    }
	    
	    while(num>0) {
	    	sbBuilder.append(num%7);
	    	num /= 7;
	    }
	    
	    if(nati) {
	    	sbBuilder.append("-");
	    }
	    
	    return String.valueOf( sbBuilder.reverse());
    }
}
