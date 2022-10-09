import java.util.PriorityQueue;

/*
 * @lc app=leetcode.cn id=1845 lang=java
 *
 * [1845] 座位预约管理系统
 */

// @lc code=start
class SeatManager {

    PriorityQueue<Integer> pq;

    public SeatManager(int n) {
        pq = new PriorityQueue<>();
        for(int i=1;i<=n;i++) pq.add(i);
    }
    
    public int reserve() {
        return pq.poll();
        
    }
    
    public void unreserve(int seatNumber) {
        pq.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
// @lc code=end

