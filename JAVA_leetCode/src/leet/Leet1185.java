package leet;

import java.util.Calendar;

public class Leet1185 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
//		int day = 31, month = 8, year = 2019;
		int day = 18, month = 7, year = 1999;
		System.out.println(dayOfTheWeek1(day, month, year));
	}
    public static String dayOfTheWeek(int day, int month, int year) {
    	String [] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    	Calendar calendar = Calendar.getInstance();
    	calendar.set(Calendar.YEAR, year);
    	calendar.set(Calendar.MONTH, month-1);	//MONTH�ֶ��Ǵ�0��ʼ�����ģ�0��һ�£�1�Ƕ���
    	calendar.set(Calendar.DAY_OF_MONTH, day);
    	
    	int idx = calendar.get(Calendar.DAY_OF_WEEK);	//DAY_OF_WEEK�ֶ�1�������죬2������һ��
    	
    	return days[idx-1];
    }
    public static String dayOfTheWeek1(int day, int month, int year) {
    	String [] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    
    	/*
    	 * W= (d+2m+3(m+1)/5+y+y/4-y/100+y/400+1)%7 //C++���㹫ʽ
    	 * �ڹ�ʽ��d��ʾ�����е�������m��ʾ�·�����y��ʾ������

w��ʾ���ڣ�w��ȡֵ��Χ��0~6��0���������գ�1~6����һ��������
		ע�⣺�ڹ�ʽ���и���������ʽ��ͬ�ĵط���

��һ�ºͶ��¿�������һ���ʮ���º�ʮ���£����������2004-1-10����ɣ�2003-13-10�����빫ʽ���㡣��ժ�԰ٶȰٿơ�

    	 */
    	if(month==1||month==2) {
    		month+=12;
    		year--;
    	}
    	 int index = 0 ;
         //��ķ����ɭ���㹫ʽ
         index = ( day + 2 * month + 3 * ( month + 1 ) / 5 + year + year / 4 - year / 100 + year / 400 ) % 7 ;
         return week[index] ;

    }
}
