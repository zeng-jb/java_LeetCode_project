package mainc;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main1493 {

	/*
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		if(year < 2007) return;
		int month = scanner.nextInt();
		
//		Calendar calendar = Calendar.getInstance();
//		calendar.set(Calendar.YEAR, year);
//		calendar.set(Calendar.MONTH, month-1);
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, 1);// ����ݣ��·ݣ��Լ���һ������������
		int totalDays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);// ��ȡ���·ݵ�����
        int startDay = calendar.get(Calendar.DATE) +1;// ��ȡ���µĵ�һ�������ڼ�
        
        System.out.println("---------------------");
        System.out.println(" Su Mo Tu We Th Fr Sa");
        System.out.println("---------------------");
        int i;
        for (i = 0; i < startDay; i++)
            System.out.print("   ");// �����һ��ǰ�Ŀո�
        for (int day = 1; day <= totalDays; day++) {
            if (day <= 9) { // �����������
                System.out.print("  " + day);// �������ÿһ��
            } else {
                System.out.print(" " + day);
            }
            i++;
            if (day < totalDays) {
                if (i == 7) { // ÿ���������껻��
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
		// �������ֶ����ɵ�ǰ���ں�ʱ���ʼ����
		Calendar rightNow = Calendar.getInstance(); // �������
		// ��ȡ��
		int year = rightNow.get(Calendar.YEAR);
		// ��ȡ��
		int month = rightNow.get(Calendar.MONTH);
		// ��ȡ��
		int date = rightNow.get(Calendar.DATE);
		//��ȡ����
		int hour=rightNow.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(rightNow.get(Calendar.DAY_OF_WEEK));//���������ڼ���ע��1Ϊ�����죬7Ϊ������
		
		//��ȡ��������
		int moa=rightNow.get(Calendar.AM_PM);
		if(moa==1)
			System.out.println("����");
		else
			System.out.println("����");
 
		System.out.println(year + "��" + (month + 1) + "��" + date + "��"+hour+"ʱ");
		rightNow.add(Calendar.YEAR,5);
		rightNow.add(Calendar.DATE, -10);
		int year1 = rightNow.get(Calendar.YEAR);
		int date1 = rightNow.get(Calendar.DATE);
		System.out.println(year1 + "��" + (month + 1) + "��" + date1 + "��"+hour+"ʱ");
		
		
		rightNow.set(2022, 1, 1);
		System.out.println(rightNow.get(Calendar.DAY_OF_WEEK));
	}

}
