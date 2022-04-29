package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leet0051 {

	/*
	 *        
	 *         // 1.�������
        String[] list1 = new String[10];
        Arrays.fill(list1, "111");
        System.out.println(JSON.toJSONString(list1));
 
        // 2.���ϸ���
        List<String> list2 = Collections.nCopies(10, "111");
//        List<String> list2 = new ArrayList<>(Collections.nCopies(10, "111"));
        System.out.println(JSON.toJSONString(list2));
 
        // 3.Java8 stream����
        List<String> list3 = Stream.generate(() -> "111").limit(10).collect(toList());
        System.out.println(JSON.toJSONString(list3));
	
	 */
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Leet0051 obj = new Leet0051();
		System.out.println(obj.solveNQueens(4));
	}

	List<List<String>> res = new ArrayList<>();
	public List<List<String>> solveNQueens(int n) {
		List<String> ans = new ArrayList<>(Collections.nCopies(n, "."));
		
		backTrack(ans,0);
		return res;
    }
	private void backTrack(List<String> ans, int row) {
		// TODO �Զ����ɵķ������
		
	}
}
