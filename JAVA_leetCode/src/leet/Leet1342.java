package leet;

public class Leet1342 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int num =123;
		System.out.println(numberOfSteps(num));
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(3);
		head.next.next = new ListNode(2);
		
		System.out.println(reversePrint(head));
	}
	
	public static int numberOfSteps(int num) {
		int ans = 0;
		while(num>0) {
			if(num%2==0) {
				num /= 2;
			}else {
				num -= 1;
			}
			ans++;
		}
		
		return ans;
    }
	
	public static int[] reversePrint(ListNode head) {
		int [] ans = new int [10000];
		int flag = 0;
		while(head!=null) {
			ans[flag++] = head.val;
			head = head.next;
		}
		int [] res = new int[flag];
		for(int i = flag-1 , j=0;i>=0;i--,j++) {
			res[i] = ans[j];
		}
		return res;
    }
}

class ListNode{
	int val;
	ListNode next;
	public ListNode(int x) {
		// TODO 自动生成的构造函数存根
		this.val = x;
	}
}
