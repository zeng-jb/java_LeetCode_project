/*
 * @lc app=leetcode.cn id=67 lang=java
 *
 * [67] 二进制求和
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
    //    long A =  Long.parseLong(a, 2);
    //    long B = Long.parseLong(b, 2);
    //    long C = A + B;
    //    System.out.prlongln(A + " "+  B + "  "+ C);
    //    System.out.prlongln(longeger.toBinaryString(C));
    //    return Long.toBinaryString(C);
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;

        int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder s = new StringBuilder();
        int carry = 0;
        while(i >= 0 || j >= 0){
            carry += i>=0 ? a.charAt(i--) - '0' : 0;
            carry += j>=0 ? b.charAt(j--) - '0' : 0;
            s.append(carry%2);
            carry >>= 1;
        }
        return carry!=0 ? "1" + s.reverse().toString() : s.reverse().toString();
    }
}
// @lc code=end

