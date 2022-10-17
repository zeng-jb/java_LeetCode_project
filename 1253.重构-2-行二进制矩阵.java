import java.util.ArrayList;
import java.util.*;

/*
 * @lc app=leetcode.cn id=1253 lang=java
 *
 * [1253] 重构 2 行二进制矩阵
 */

// @lc code=start
class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int sum = Arrays.stream(colsum).sum();
        List<List<Integer>> result = new ArrayList<>();
        if(upper+lower != sum) return result;

        List<Integer> u = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for(int col : colsum){
            if(col == 2){
                u.add(1);
                l.add(1);
                upper--;
                lower--;
            }else if(col == 1){
                if(upper > lower){
                    u.add(1);
                    upper--;
                    l.add(0);
                }else{
                    l.add(1);
                    lower--;
                    u.add(0);
                }
            }else if(col == 0){
                u.add(0);
                l.add(0);
            }
        }

        if(upper == 0 && lower == 0){
            result.add(u);
            result.add(l);
        }

        return result;
    }
}
// @lc code=end

