package leet;

import java.util.Stack;

public class Leet388 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
		Leet388 obj = new Leet388();
		System.out.println(obj.lengthLongestPath(input));
	}

	public int lengthLongestPath(String input) {
		//�ָ�\n
		String[] words = input.split("\n");
		int res = 0;
		int sum = 0;
		//ջ��¼ÿһ��ĳ���
		Stack<Integer> stack = new Stack<>();
		
		for(String word : words) {
			//��¼���ڲ���
			int k = 0;
			while(word.charAt(k) == '\t') k++;
			//ȥ��\t��ʣ��ĳ���
			int len = word.length() - k;
			//�������С��ջ��¼�Ĳ�����Ҫ��ջ
			while(stack.size() > k) {
				sum -= stack.pop();
			}
			
			sum += len;
			stack.push(len);
			//������ļ�������¼��res����k����k��ġ�/"��
			if(word.contains(".")) {
				res = Math.max(res, sum+k);
			}
			
		}
		
		return res;
    }
}
