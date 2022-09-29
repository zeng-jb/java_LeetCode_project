import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=401 lang=java
 *
 * [401] 二进制手表
 */

// @lc code=start
class Solution {
    int[] hours = new int[]{1, 2, 4, 8, 0, 0, 0, 0, 0, 0};
    int[] minutes = new int[]{0, 0, 0, 0, 1, 2, 4, 8, 16, 32};
    List<String> res = new ArrayList<>();

    public List<String> readBinaryWatch(int turnedOn) {
        // List<String> list = new ArrayList<>();
        // for(int i=0;i<12;i++){
        //     for(int j=0;j<60;j++){
        //         if(count1(i) + count1(j) == turnedOn){
        //             list.add(i+":"+ (j<10 ? "0"+j : j) );
        //         }
        //     }
        // }
        // return list;


        backtrack(turnedOn,0,0,0);
        return res;

    }

    public void backtrack(int num, int index, int hour, int minute){
        if(hour >= 12 || minute >= 60) return;

        if(num == 0){
            res.add(hour+":"+(minute<10?"0"+minute:minute));
            return;
        }

        for(int i=index;i<10;i++){
            backtrack(num-1, i+1, hour+hours[i], minute+minutes[i]);
        }
    }

    public int count1(int n){
        int res = 0;
        while(n!=0){
            n = n&(n-1);
            res++;
        }
        return res;
    }
}
// @lc code=end

