package leet;

public class Leet507 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num = 3355033;
		System.out.println(checkPerfectNumber(num));
	}
    public static boolean checkPerfectNumber1(int num) {
    	int ans = 0;
    	
    	for(int i=1;i<=num/2;i++) {
    		if(num%i==0) {
    			ans+=i;
    		}
    	}
    	if(ans==num) {    		
    		return true;
    	}
    	return false;
    }
    
    public static boolean checkPerfectNumber(int num) {
    	//完美数只有 6, 28, 496, 8128, 33550336 这几个
    	/*
    	switch(num) {
    	case 6:
    	case 28:
    	case 496:
    	case 8128:
    	case 33550336:
    		return true;
    	}
    		
    	return false;
    	*/
    	
    	if(num==1) {
    		return false;
    	}
    	int ans = 1;
    	for(int i=2;i<=num/i;i++) {
    		if(num%i==0) {
    			ans+=i+num/i;
    		}
    	}
    	return ans==num;
    }
}
