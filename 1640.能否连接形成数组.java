import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=1640 lang=java
 *
 * [1640] 能否连接形成数组
 */

// @lc code=start
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        // for(int i=0;i<arr.length;i++){
        //     int idx = findIndex(arr[i],pieces);
        //     if(idx == -1) return false;
        //     for(int j=0;j<pieces[idx].length;j++){
        //         if(arr[i+j] != pieces[idx][j]) return false;
        //     }
        //     i += pieces[idx].length-1;
        // }
        // return true;


        Map<Integer,int[]> map = new HashMap<>();
        for(int[] d : pieces){
            map.put(d[0], d);
        }

        for(int i=0;i<arr.length;){
            if(!map.containsKey(arr[i])) return false;
            for(int v : map.get(arr[i])){
                if(arr[i++] != v) return false;
            }
        }
        return true;
    }
    public int findIndex(int num, int[][] pieces){
        for(int i=0;i<pieces.length;i++){
            if(num == pieces[i][0]) return i;
        }
        return -1;
    }
}
// @lc code=end

