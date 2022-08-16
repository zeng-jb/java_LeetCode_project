import java.util.LinkedHashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=146 lang=java
 *
 * [146] LRU 缓存
 */

// @lc code=start
class LRUCache {
    int capacity;
    Map<Integer,Integer> map = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.keySet().contains(key)){
            int value = map.get(key);
            // 删除掉当前key重新放到最后
            map.remove(key);
            map.put(key, value);
            return value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.keySet().contains(key)){
            map.remove(key);
        }else if(map.size() == capacity){
            int firstKey = map.keySet().iterator().next();
            map.remove(firstKey);
        }
        map.put(key, value);

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

