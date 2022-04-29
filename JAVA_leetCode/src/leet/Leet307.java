package leet;

import java.util.ArrayList;

public class Leet307 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}


class NumArray1 {
	
	class tree{
		int l , r , sum;
		tree(int l , int r){
			this.l = l;
			this.r = r;
		}
	}
	tree [] tr;
	void build(int i ,int l ,int r) {
		tr[i] = new tree(l,r);
		if(l == r) return ;
		int mid = (l + r) >> 1;
		build(i << 1, l, mid);
		build(i << 1 | 1, mid + 1, r);
	}
	
	int search(int i ,int l ,int r) {
		if(tr[i].l >= l && tr[i].r <= r) return tr[i].sum;
		if(tr[i].l < l || tr[i].r > r) return 0;
		int s = 0;
		if(tr[i*2].r >= l) s += search(i*2, l, r);
		if(tr[i*2+1].l <= r) s += search(i*2+1, l, r);
		return s;
 	}
	
	void add(int i,int dis,int k) {
		if(tr[i].l == tr[i].r) {
			tr[i].sum += k;
			return ;
		}
		if(dis <= tr[i*2].r) add(i*2, dis, k);
		else add(i*2+1, dis, k);
		
		tr[i].sum = tr[i*2].sum + tr[i*2+1].sum;
		return;
	}
	
	int [] nums;
	
    public NumArray1(int[] nums) {
    	this.nums = nums;
    	int n = nums.length;
    	tr = new tree[n * 4];
    	build(1, 1, n);
    	for(int i=0;i<n;i++) {
    		add(1, i+1, nums[i]);
    	}
    }
    
    public void update(int index, int val) {
    	add(1, index+1, val-nums[index]);
    	nums[index] = val;
    }
    
    public int sumRange(int left, int right) {
    	return search(1, left+1, right+1);
    }
}