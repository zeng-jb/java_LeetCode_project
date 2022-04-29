package jainzhi;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class J41 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		MedianFinder obj = new MedianFinder();
		obj.addNum(1);
		obj.addNum(2);
		System.out.println(obj.findMedian());
		obj.addNum(3);
		System.out.println(obj.findMedian());
	}

}

class MedianFinder {

    /** initialize your data structure here. */
	PriorityQueue<Integer> left; //大跟堆
	PriorityQueue<Integer> right; // 小跟堆
	public MedianFinder() {
    	left = new PriorityQueue<>((v1,v2) -> v2-v1);
    	right = new PriorityQueue<>();
    }

    public void addNum(int num) {
    	//先加入大跟堆
    	left.offer(num);
    	//把大跟堆的最大值加入到小跟堆，保持平衡
    	right.offer(left.poll());
    	//如果小跟堆数量比大跟堆超过1，那么移除一个小跟堆
    	if(right.size()-left.size()>1) {
    		left.offer(right.poll());
    	}
    }
    
    public double findMedian() {
    	//如果为奇数取出小跟堆一个数
    	if(right.size()>left.size()) {
    		return (double)right.peek();
    	}
    	return (double)((left.peek() + right.peek())/2.0);
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */