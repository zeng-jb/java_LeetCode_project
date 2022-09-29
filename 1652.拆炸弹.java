import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1652 lang=java
 *
 * [1652] 拆炸弹
 */

// @lc code=start
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        if(k == 0) {
            Arrays.fill(code, 0);
        }else if (k > 0){
            int[] tmp = new int[n];
            for(int i=0;i<n;i++){
                for(int j=i+1;j<=i+k;j++){
                    int index = j%n;
                    tmp[i] += code[index];
                }
            }
            code = tmp;
        }else if(k < 0){
            int[] tmp = new int[n];
            for(int i=0;i<n;i++){
                for(int j=i+k;j<i;j++){
                    int index = (j+n)%n;
                    tmp[i] += code[index];
                }
            }
            code = tmp;
        }


        return code;
    }
}
// @lc code=end

