package leet;

import java.util.Arrays;

public class Leet937 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		Leet937 obj = new Leet937();
		System.out.println(obj.reorderLogFiles(logs));
	}
	public String[] reorderLogFiles(String[] logs) {
		Arrays.sort( logs , (log1,log2) -> {
			String[] split1 = log1.split(" ",2);
			String[] split2 = log2.split(" ",2);
			 boolean isDigit1 = Character.isDigit(split1[1].charAt(0));//判断除标识符外的第一个字符是数字true，字母false
	         boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            if (!isDigit1 && !isDigit2) { //如果两个日志都是字母日志
                int cmp = split1[1].compareTo(split2[1]); //先比较内容字母split1>split2则返回1，等于返0，小于返-1
                if (cmp != 0) return cmp;
                return split1[0].compareTo(split2[0]);//若内容字母相同则比较标识符
            }
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
		});
		return logs;
    }

}
