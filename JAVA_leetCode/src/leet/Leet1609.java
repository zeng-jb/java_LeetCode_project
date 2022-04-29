/**
 * 
 */
package leet;

import java.util.List;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

/**
 * @author 123
 *
 */
public class Leet1609 {

	/**
	 * @param args
	 */
//	 private int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private int[] array = {5,4,2,3,3,7 };
	 private static List<TreeNode> nodeList = null; 
	class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	}
	public void createBinTree() {  
        nodeList = new LinkedList<TreeNode>();  
        // 将一个数组的值依次转换为Node节点  
        for (int nodeIndex = 0; nodeIndex < array.length; nodeIndex++) {  
            nodeList.add(new TreeNode(array[nodeIndex]));  
        }  
        // 对前lastParentIndex-1个父节点按照父节点与孩子节点的数字关系建立二叉树  
        for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {  
            // 左孩子  
            nodeList.get(parentIndex).left = nodeList  
                    .get(parentIndex * 2 + 1);  
            // 右孩子  
            nodeList.get(parentIndex).right = nodeList  
                    .get(parentIndex * 2 + 2);  
        }  
        // 最后一个父节点:因为最后一个父节点可能没有右孩子，所以单独拿出来处理  
        int lastParentIndex = array.length / 2 - 1;  
        // 左孩子  
        nodeList.get(lastParentIndex).left = nodeList  
                .get(lastParentIndex * 2 + 1);  
        // 右孩子,如果数组的长度为奇数才建立右孩子  
        if (array.length % 2 == 1) {  
            nodeList.get(lastParentIndex).right = nodeList  
                    .get(lastParentIndex * 2 + 2);  
        }  
    }  
	
    public static void preOrderTraverse(TreeNode node) {  
        if (node == null)  
            return;  
        System.out.print(node.val + " ");  
        preOrderTraverse(node.left);  
        preOrderTraverse(node.right);  
    } 
	
    public static void levelT(TreeNode node) {
		Queue<TreeNode> q = new ArrayDeque<>();
		if(node != null) {
			q.offer(node);
		}
		while(!q.isEmpty()) {
			System.out.print(q.peek().val + " -> ");
			if(q.peek().left != null) {
				q.offer(q.peek().left);
			}
			if(q.peek().right != null) {
				q.offer(q.peek().right);
			}
			q.poll();
		}
	}
    public static boolean isEvenOddTree(TreeNode root) {
    	boolean flag = true;
    	int level = 0;
    	Queue<TreeNode> q = new ArrayDeque<>();
    	if(root != null)
    		q.offer(root);
    	while(!q.isEmpty()) {
    		int size = q.size();
    		int prev = level%2 == 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
    		while(size-- > 0) {
    			TreeNode node = q.poll();
    			int value = node.val;
    			if(level%2 == value%2)	//偶数层有偶数，奇数层有奇数
    				flag = false;
    			if((level%2==0 && value <= prev) || (level%2==1 && value>=prev))
    				flag = false;
    			prev = value;
    			if(node.left != null) {
					q.offer(node.left);
				}
				if(node.right != null) {
					q.offer(node.right);
				}
    		}
    		level++;
    		
    	}
    	
    	return flag;
    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Leet1609 tree = new Leet1609();
        tree.createBinTree();  
        // nodeList中第0个索引处的值即为根节点  
        TreeNode root = nodeList.get(0);  
  
        System.out.println("先序遍历：");  
        preOrderTraverse(root);  
        System.out.println();  
        
        System.out.println("ceng序遍历：");  
        levelT(root);  
        System.out.println(); 
        
        System.out.println(isEvenOddTree(root));
	}

}
