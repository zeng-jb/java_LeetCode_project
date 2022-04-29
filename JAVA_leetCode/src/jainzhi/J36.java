package jainzhi;

public class J36 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	
	/*
	Node head, tail;
	public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        
        inOrder(root);
        
        head.left = tail;
        tail.right = head;
        
        return head;
    }
	private void inOrder(Node root) {
		// TODO 自动生成的方法存根
		if(root == null) return;
		
		inOrder(root.left);
		
		if(head == null) {
			head = root;
			tail = root;
		}else {
			//头部结点不动，尾结点动
			tail.right = root;
			root.left = tail;
			tail = root;
		}
		
		inOrder(root.right);
	}
	
	*/
}


/*
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

*/