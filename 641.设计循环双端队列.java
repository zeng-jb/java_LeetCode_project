/*
 * @lc app=leetcode.cn id=641 lang=java
 *
 * [641] 设计循环双端队列
 */

// @lc code=start
class MyCircularDeque {

    int[] elements;
    int size = 0,head = 0, tail = 0;
    

    public MyCircularDeque(int k) {
        elements = new int[k];
        head = 0;
        tail = k-1;
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        // 头指针左移
        elements[head = head == 0 ? elements.length-1 : head - 1] = value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()) return false;
        // 尾指针右移
        elements[tail = tail == elements.length - 1 ? 0 : tail + 1] = value;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()) return false;
        // 头指针右移
        head = head == elements.length -  1 ? 0 : head + 1;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()) return false;
        // 尾指针左移
        tail = tail == 0 ? elements.length - 1 : tail - 1;
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        return elements[head];
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        return elements[tail];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == elements.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
// @lc code=end

