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
		// TODO �Զ����ɵķ������
		/*
		 * ������String[] c = s.split(�� ��);����������String[] c = s.split(��\s+��);
��������������ǣ�1 2 3 12 11���������ݣ�����֮��������֮���ж���ո��ʱ�򣬷���1���ᱨ��������2�����������С���Ϊ����1ֻ��ƥ��һ���ո񣬶�����2����ƥ�����ո�
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
		
		//����api
		System.out.println(LocalDate.parse(date).getDayOfYear());
		
		//���ǰ׺
		System.out.println(dayOfYear1(date));
		
		
		
		Calendar calendar = Calendar.getInstance();//��ֵ��calendar
		System.out.println(calendar);
		
		int year = 2021;
		int month = 0;//1�Ƕ��� 0��1��
		int day = 12;
		
		calendar.set(Calendar.YEAR, year);// ��year��ֵ����calender��YEAR�ֶ�
		calendar.set(Calendar.MONTH, month);//��month��ֵ����calender��MONTH�ֶ�
		calendar.set(Calendar.DAY_OF_MONTH, day);//��day��ֵ��ֵ��calendder��DAT_OF_MONTH�ֶ�
		
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		//���Ͼ�����˶�calender���ֶ����á�
		//��Ȥ����MONTH�ֶ��Ǵ�0�¿�ʼ�����ģ�����12�¶�Ӧ��ֵ��11��DAY_OF_WEEK���������Ӧ����1������һ��Ӧ����2����������Ӧ����7����YEAR��DAY_OF_MONTH���Ǵ�1��ʼ����
	}

	public static int dayOfYear(String date) {
		
		String [] dates = date.split("-");
		int year = Integer.parseInt(dates[0]);
		int month = Integer.parseInt(dates[1]) - 1;//�·�1�������ʾ0���·�12��ʾ11,��
		int day = Integer.parseInt(dates[2]);
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month);//��month��ֵ����calender��MONTH�ֶ�
		calendar.set(Calendar.DAY_OF_MONTH, day);//��day��ֵ��ֵ��calendder��DAT_OF_MONTH�ֶ�
		
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
