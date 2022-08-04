import javax.swing.plaf.TextUI;

/*
 * @lc app=leetcode.cn id=622 lang=java
 *
 * [622] 设计循环队列
 */

// @lc code=start
class MyCircularQueue {
    int val[];
    int l,r,k,count; //l指向头部，r尾部，count计数节点
    public MyCircularQueue(int k) {
        this.k = k;
        val = new int[k];
        l = r = count = 0;
    }
    
    public boolean enQueue(int value) {
        if(count == k) return false;
        val[r] = value;
        r = (r+1)%k;
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(count == 0) return false;
        l = (l+1)%k;
        count--;
        return true;
    }
    
    public int Front() {
        return count == 0 ? -1 : val[l];
    }
    
    public int Rear() {
        return count == 0 ? -1 : val[(r-1+k)%k];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == k;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
// @lc code=end

