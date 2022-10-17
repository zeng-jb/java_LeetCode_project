/*
 * @lc app=leetcode.cn id=2333 lang=java
 *
 * [2333] 最小差值平方和
 */

// @lc code=start
class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] arr = new int[100010];
        for(int i=0;i<n;i++) arr[Math.abs(nums1[i]-nums2[i])]++;
        
        int k = k1+k2;
        int i = 100000;
        for(;i>=1;i--){
            if(arr[i] == 0) continue;
            if(k > arr[i]){
                arr[i-1] += arr[i];
                k -= arr[i];
                
            }else if(k == arr[i]){
                arr[i-1] += arr[i];
                i--;
                k=0;
                break;
            }else{
                arr[i-1] += k;
                arr[i] -= k;
                break;
            }
        }

        long ans = 0;
        for(;i>=1;i--){
            if(arr[i]==0) continue;
            ans += (long)i*i*arr[i];
        }

        return ans;
    }
}
// @lc code=end

