import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=1346 lang=java
 *
 * [1346] 检查整数及其两倍数是否存在
 */

// @lc code=start
class Solution {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
			int num = arr[i] * 2;
			for (int j = 0; j < arr.length; j++)
				if (num == arr[j] && i != j)
					return true;
		}
		return false;
    }
}
// @lc code=end

