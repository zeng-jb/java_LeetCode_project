import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=1608 lang=java
 *
 * [1608] 特殊数组的特征值
 */

// @lc code=start
class Solution {
    public int specialArray(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length;
        // if(nums[0] >= n) return n;
    
        // for(int i=1;i<n;i++){
        //     if(nums[n-i] >= i && nums[n-i-1] < i){
        //         return i;
        //     }
        // }
        // return -1;


        // 二分法
        Arrays.sort(nums);
        int n = nums.length;
        if(nums[0] >= n) return n;

        int l = 1, r = n-1;
        while(l < r){
            int mid = (l + r) >> 1;
            if(nums[n - mid] >= mid && nums[n-mid-1] < mid){
                return mid;
            }else if(nums[n - mid] < mid){
                r = mid - 1;
            }else{
                l = mid + 1;
            }

            if(l >= r-1){
                if(nums[n-l] >= l && nums[n-l-1] < l){return l;}
                if(nums[n-r] >= r && nums[n-r-1] < r){return r;}
                break;
            }
        }
        return -1;
        // Arrays.sort(nums);
        // int n=nums.length;
        // if(nums[0]>=n){return n;}
        // int l=1,r=n-1;
        // while(l<r){
        //     int mid=(l+r)>>1;
        //     if(nums[n-mid]>=mid&&nums[n-mid-1]<mid){return mid;}
        //     else if(nums[n-mid]<mid){r=mid-1;}
        //     else{l=mid+1;}
        //     if(l>=r-1){
        //         if(nums[n-l]>=l&&nums[n-l-1]<l){return l;}
        //         if(nums[n-r]>=r&&nums[n-r-1]<r){return r;}
        //         break;
        //     }
        // }
        // return -1;
    }
}
// @lc code=end

