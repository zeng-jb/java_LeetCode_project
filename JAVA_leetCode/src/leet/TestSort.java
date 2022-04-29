package leet;
import java.io.*;
import java.util.*;


public class TestSort {

	/*
	 * ������һ������Ϊn���������С�

����ʹ�ÿ��������������а��մ�С�����������

�����ź�������а�˳�������

�����ʽ
���빲���У���һ�а������� n��

�ڶ��а��� n ��������������������1~109��Χ�ڣ�����ʾ�������С�

�����ʽ
�����һ�У����� n ����������ʾ�ź�������С�

���ݷ�Χ
1��n��100000
����������
5
3 1 2 4 5
���������
1 2 3 4 5

	 */
	// �������ģ��
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	public static void main(String[] args) throws IOException {
		n = Integer.parseInt(in.readLine());
		String s[] = in.readLine().split(" ");// ��������
		
		Arrays.sort(s, new Comparator<String>() {
			//����
			@Override
			public int compare(String o1, String o2) {
				// TODO �Զ����ɵķ������
				if(o1.length()==o2.length())
					return o2.compareTo(o1);
				else
					return o2.length()-o1.length();
			}
			
		});
		
//		Arrays.sort(s, new Comparator<String>() { // ����
//			public int compare(String a, String b) {  
//	        	if(a.length() == b.length()){ // ������������ֱ�ӱȽ��ֵ���
//	        		return a.compareTo(b);
//	        	}
//	        	else{ // ���ȳ���һ����
//	        		return a.length() - b.length();
//	        	}
//			}
//		});
		
		for(String p : s){
			out.write(p+" ");
		}
		
		out.flush();
		
	}


}
