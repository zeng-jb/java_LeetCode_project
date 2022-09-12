/*
 * @lc app=leetcode.cn id=667 lang=java
 *
 * [667] 优美的排列 II
 */

// @lc code=start
class Solution {
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        // 下标从[0, k]中，偶数下标填充[1,2,3…]，奇数下标填充[k + 1, k, k - 1…]，后面[k + 1, n - 1]都是顺序填充
        int index1 = 1;
        int index2 = k+1;
        for(int i=0;i<=k;i++){
            if(i%2==0){
                ans[i] = index1++;
            }else{
                ans[i] = index2--;
            }
        }

        for(int i=k+1;i<n;i++){
            ans[i] = i+1;
        }
        return ans;
    }
}
// @lc code=end

