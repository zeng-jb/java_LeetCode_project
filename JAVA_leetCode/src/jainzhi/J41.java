package jainzhi;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class J41 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
	PriorityQueue<Integer> left; //�����
	PriorityQueue<Integer> right; // С����
	public MedianFinder() {
    	left = new PriorityQueue<>((v1,v2) -> v2-v1);
    	right = new PriorityQueue<>();
    }

    public void addNum(int num) {
    	//�ȼ�������
    	left.offer(num);
    	//�Ѵ���ѵ����ֵ���뵽С���ѣ�����ƽ��
    	right.offer(left.poll());
    	//���С���������ȴ���ѳ���1����ô�Ƴ�һ��С����
    	if(right.size()-left.size()>1) {
    		left.offer(right.poll());
    	}
    }
    
    public double findMedian() {
    	//���Ϊ����ȡ��С����һ����
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