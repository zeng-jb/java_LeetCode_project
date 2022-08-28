import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

/*
 * @lc app=leetcode.cn id=658 lang=java
 *
 * [658] 找到 K 个最接近的元素
 */

// @lc code=start
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        for(int i=0;i<n-k;i++){
            if(Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)){
                right--;
            }else{
                left++;
            }
        }
        return Arrays.stream(arr,left,right+1).boxed().collect(Collectors.toList());
    }
}
// @lc code=end

