package mainc;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main1493 {

	/*
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if(year < 2007) return;
		int month = scanner.nextInt();
		
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(Calendar.YEAR, year);
//		calendar.set(Calendar.MONTH, month-1);
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, 1);// 对年份，月份，以及第一天来创建对象
		int totalDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);// 获取该月份的天数
        int startDay = calendar.get(Calendar.DATE) +1;// 获取该月的第一天是星期几
        
        System.out.println("---------------------");
        System.out.println(" Su Mo Tu We Th Fr Sa");
        System.out.println("---------------------");
        int i;
        for (i = 0; i < startDay; i++)
            System.out.print("   ");// 输出第一天前的空格
        for (int day = 1; day <= totalDays; day++) {
            if (day <= 9) { // 用于输出控制
                System.out.print("  " + day);// 依次输出每一天
            } else {
                System.out.print(" " + day);
            }
            i++;
            if (day < totalDays) {
                if (i == 7) { // 每个星期输完换行
                    System.out.println();
                    i = 0;
                }
            } else {
                System.out.println();
            }
        }
        System.out.println("---------------------");
	}

*/

	public static void main(String[] args) {
		// 其日历字段已由当前日期和时间初始化：
		Calendar rightNow = Calendar.getInstance(); // 子类对象
		// 获取年
		int year = rightNow.get(Calendar.YEAR);
		// 获取月
		int month = rightNow.get(Calendar.MONTH);
		// 获取日
		int date = rightNow.get(Calendar.DATE);
		//获取几点
		int hour=rightNow.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(rightNow.get(Calendar.DAY_OF_WEEK));//今天是星期几，注意1为星期天，7为星期六
		
		//获取上午下午
		int moa=rightNow.get(Calendar.AM_PM);
		if(moa==1)
			System.out.println("下午");
		else
			System.out.println("上午");
 
		System.out.println(year + "年" + (month + 1) + "月" + date + "日"+hour+"时");
		rightNow.add(Calendar.YEAR,5);
		rightNow.add(Calendar.DATE, -10);
		int year1 = rightNow.get(Calendar.YEAR);
		int date1 = rightNow.get(Calendar.DATE);
		System.out.println(year1 + "年" + (month + 1) + "月" + date1 + "日"+hour+"时");
		
		
		rightNow.set(2022, 1, 1);
		System.out.println(rightNow.get(Calendar.DAY_OF_WEEK));
	}

}
