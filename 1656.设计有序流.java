import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=1656 lang=java
 *
 * [1656] 设计有序流
 */

// @lc code=start
class OrderedStream {
    String[] str;
    int ptr;
    public OrderedStream(int n) {
        ptr = 1;
        str = new String[n+1];
    }
    
    public List<String> insert(int idKey, String value) {
        str[idKey] = value;
        List<String> res = new ArrayList<>();
        while(ptr < str.length && str[ptr] != null){
            res.add(str[ptr++]);
        }
        return res;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
// @lc code=end

