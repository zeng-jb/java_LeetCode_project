package leet;

import java.util.Arrays;

public class Leet937 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		Leet937 obj = new Leet937();
		System.out.println(obj.reorderLogFiles(logs));
	}
	public String[] reorderLogFiles(String[] logs) {
		Arrays.sort( logs , (log1,log2) -> {
			String[] split1 = log1.split(" ",2);
			String[] split2 = log2.split(" ",2);
			 boolean isDigit1 = Character.isDigit(split1[1].charAt(0));//�жϳ���ʶ����ĵ�һ���ַ�������true����ĸfalse
	         boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            if (!isDigit1 && !isDigit2) { //���������־������ĸ��־
                int cmp = split1[1].compareTo(split2[1]); //�ȱȽ�������ĸsplit1>split2�򷵻�1�����ڷ�0��С�ڷ�-1
                if (cmp != 0) return cmp;
                return split1[0].compareTo(split2[0]);//��������ĸ��ͬ��Ƚϱ�ʶ��
            }
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
		});
		return logs;
    }

}
