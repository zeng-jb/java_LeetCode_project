import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=927 lang=java
 *
 * [927] 三等分
 */

// @lc code=start
class Solution {
    int[] arr;
    public int[] threeEqualParts(int[] arr) {
        int n = arr.length;
        this.arr = arr;
        int cnt = Arrays.stream(arr).sum();
        if(cnt%3 != 0) return new int[] {-1,-1};
        if(cnt == 0) return new int[] {0,n-1};

        cnt /= 3;

        // 找出三指针1开始的位置，
        int i=find(1), j=find(cnt+1), k=find(cnt*2+1);
        // 三指针同步移动，知道k为n结束
        for(;k<n&&arr[i]==arr[j]&&arr[j]==arr[k];i++,j++,k++);

        if(k==n){
            return new int[]{i-1,j};
        }else{
            return new int[]{-1,-1};
        }
    }

    public int find(int x){
        int s = 0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            if(s==x){
                return i;
            }
        }
        return 0;
    }
}
// @lc code=end

