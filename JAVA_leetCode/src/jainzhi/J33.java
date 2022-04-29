package jainzhi;

import java.util.Stack;

public class J33 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] postorder = {1,3,2,6,5};
		System.out.println(verifyPostorder1(postorder));
	}

	public static boolean verifyPostorder(int[] postorder) {
		if(postorder.length <= 2) return true;
		return verify(postorder,0,postorder.length-1);
    }

	private static boolean verify(int[] postorder, int left, int right) {
		// TODO 自动生成的方法存根
		if(left >= right) return true;
		//当前树根值
		int rootValue = postorder[right];
		
		int k = left;
		while(k < right && postorder[k] < rootValue) {
			//找到大于根的结点，为右子树
			k++;
		}
		//验证右子树是否有小于根结点的
		for(int i=k;i<right;i++) {
			if(postorder[i] < rootValue) return false;
		}
		//验证左右子树
		if(!verify(postorder, left, k-1)) return false;
		if(!verify(postorder, k, right-1)) return false;
		
		
		return true;
	}
	
	public static boolean verifyPostorder1(int[] postorder) {
		//单调栈分析后序遍历倒叙
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
