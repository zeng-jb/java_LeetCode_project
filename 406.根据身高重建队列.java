import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=406 lang=java
 *
 * [406] 根据身高重建队列
 */

// @lc code=start
class Solution {
    public int[][] reconstructQueue(int[][] people) {

        // 对h降序，k升序
        Arrays.sort(people, new Comparator<int[]>() {
            
            @Override
            public int compare(int[] o1, int[] o2){
                // h相同则k升序
                if(o1[0] == o2[0]) return o1[1] - o2[1];
                // h降序
                return o2[0] - o1[0];
            }

        });

        LinkedList<int[]> list = new LinkedList<>();

        for(int[] peop : people){
            // 插入到对应的位置
            list.add(peop[1], peop);
        }

        return list.toArray(new int[list.size()][2]);
    }
}
// @lc code=end

