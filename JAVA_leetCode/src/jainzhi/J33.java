package jainzhi;

import java.util.Stack;

public class J33 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int [] postorder = {1,3,2,6,5};
		System.out.println(verifyPostorder1(postorder));
	}

	public static boolean verifyPostorder(int[] postorder) {
		if(postorder.length <= 2) return true;
		return verify(postorder,0,postorder.length-1);
    }

	private static boolean verify(int[] postorder, int left, int right) {
		// TODO �Զ����ɵķ������
		if(left >= right) return true;
		//��ǰ����ֵ
		int rootValue = postorder[right];
		
		int k = left;
		while(k < right && postorder[k] < rootValue) {
			//�ҵ����ڸ��Ľ�㣬Ϊ������
			k++;
		}
		//��֤�������Ƿ���С�ڸ�����
		for(int i=k;i<right;i++) {
			if(postorder[i] < rootValue) return false;
		}
		//��֤��������
		if(!verify(postorder, left, k-1)) return false;
		if(!verify(postorder, k, right-1)) return false;
		
		
		return true;
	}
	
	public static boolean verifyPostorder1(int[] postorder) {
		//����ջ���������������
		Stack<Integer> stack = new Stack<>();
		int root = Integer.MAX_VALUE;
		for(int i=postorder.length-1;i>=0;i--) {
			if(postorder[i] > root) return false;
			while(!stack.isEmpty() && stack.peek() > postorder[i]) {
				root = stack.pop();
			}
			stack.push(postorder[i]);
		}
		
		return true;
	}
}