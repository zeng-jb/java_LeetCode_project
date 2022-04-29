package leet;

import java.io.BufferedInputStream;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;


public class TestCalendar {
	
	   static int[] nums = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    static int[] f = new int[13];
	    static {
	        for (int i = 1; i <= 12; i++) f[i] = f[i - 1] + nums[i - 1];
	    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		/*
		 * 用它：String[] c = s.split(“ “);还是用它：String[] c = s.split(“\s+”);
假如我们输入的是：1 2 3 12 11这样的数据，换言之就是数字之间有多个空格的时候，方法1将会报错，而方法2正常排序运行。因为方法1只能匹配一个空格，而方法2可以匹配多个空格。
		 */
//		Scanner sc = new Scanner(new BufferedInputStream(System.in));
//        int n=sc.nextInt();
//        sc.nextLine();
//        for (int i = 0; i <n; i++) {
//            String tempString=sc.nextLine();
//            System.out.println(tempString);
//            System.out.println();
//        }
//        while(sc.hasNextLine()){
//            String tempString=sc.nextLine();
//            String [] str = tempString.trim().split("\\s+");
//            for(int i=0;i<str.length;i++)
//            {
//                System.out.println(str[i]+'\n');
//            }
//        }
	
		String date = "2004-03-01";
		System.out.println(dayOfYear(date));
		
		//调用api
		System.out.println(LocalDate.parse(date).getDayOfYear());
		
		//打表前缀
		System.out.println(dayOfYear1(date));
		
		
		
		Calendar calendar = Calendar.getInstance();//赋值给calendar
		System.out.println(calendar);
		
		int year = 2021;
		int month = 0;//1是二月 0是1月
		int day = 12;
		
		calendar.set(Calendar.YEAR, year);// 将year的值赋给calender的YEAR字段
		calendar.set(Calendar.MONTH, month);//将month的值赋给calender的MONTH字段
		calendar.set(Calendar.DAY_OF_MONTH, day);//将day的值赋值给calendder的DAT_OF_MONTH字段
		
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		//以上就完成了对calender的字段设置。
		//有趣的是MONTH字段是从0月开始计数的，所以12月对应的值是11。DAY_OF_WEEK中星期天对应的是1，星期一对应的是2，星期六对应的是7，而YEAR和DAY_OF_MONTH都是从1开始计数
	}

	public static int dayOfYear(String date) {
		
		String [] dates = date.split("-");
		int year = Integer.parseInt(dates[0]);
		int month = Integer.parseInt(dates[1]) - 1;//月份1在这里表示0，月份12表示11,；
		int day = Integer.parseInt(dates[2]);
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);//将month的值赋给calender的MONTH字段
		calendar.set(Calendar.DAY_OF_MONTH, day);//将day的值赋值给calendder的DAT_OF_MONTH字段
		
		return calendar.get(Calendar.DAY_OF_YEAR);
		
    }
	
 
    public static int dayOfYear1(String date) {
        String[] ss = date.split("-");
        int y = Integer.parseInt(ss[0]), m = Integer.parseInt(ss[1]), d = Integer.parseInt(ss[2]);
        boolean isLeap = (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
        int ans = m > 2 && isLeap ? f[m - 1] + 1 : f[m - 1];
        return ans + d;
    }


}
