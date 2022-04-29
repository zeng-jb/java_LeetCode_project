package leet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leet429 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

	
	public List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
        	List<Integer> ans = new ArrayList<>();
        	int size = q.size();
        	while(size-- > 0) {
        		Node temp = q.poll();
        		ans.add(temp.val);
        		for(Node childNode : temp.children) {
        			q.add(childNode);
        		}
        	}
        	list.add(ans);
        }
        return list;
    }
}
