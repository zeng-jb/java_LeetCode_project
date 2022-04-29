package leet;

import java.util.Calendar;

public class Leet1185 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
//		int day = 31, month = 8, year = 2019;
		int day = 18, month = 7, year = 1999;
		System.out.println(dayOfTheWeek1(day, month, year));
	}
    public static String dayOfTheWeek(int day, int month, int year) {
    	String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    	Calendar calendar = Calendar.getInstance();
    	calendar.set(Calendar.YEAR, year);
    	calendar.set(Calendar.MONTH, month-1);	//MONTH字段是从0开始计数的，0是一月，1是二月
    	calendar.set(Calendar.DAY_OF_MONTH, day);
    	
    	int idx = calendar.get(Calendar.DAY_OF_WEEK);	//DAY_OF_WEEK字段1是星期天，2是星期一。
    	
    	return days[idx-1];
    }
    public static String dayOfTheWeek1(int day, int month, int year) {
    	String [] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    
    	/*
    	 * W= (d+2m+3(m+1)/5+y+y/4-y/100+y/400+1)%7 //C++计算公式
    	 * 在公式中d表示日期中的日数，m表示月份数，y表示年数。

w表示星期，w的取值范围是0~6，0代表星期日，1~6星期一到星期六
		注意：在公式中有个与其他公式不同的地方：

把一月和二月看成是上一年的十三月和十四月，例：如果是2004-1-10则换算成：2003-13-10来代入公式计算。【摘自百度百科】

    	 */
    	if(month==1||month==2) {
    		month+=12;
    		year--;
    	}
    	 int index = 0 ;
         //基姆拉尔森计算公式
         index = ( day + 2 * month + 3 * ( month + 1 ) / 5 + year + year / 4 - year / 100 + year / 400 ) % 7 ;
         return week[index] ;

    }
}
