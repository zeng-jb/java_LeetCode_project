package mainc;

import java.util.Scanner;

public class Main1439 {
	
	static int []child = new int[100000];
	static int n,sum=0;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			child[i] = scanner.nextInt();
		}
		sortheight();
		System.out.println(sum);
	}
	
	public static void sortheight() {
		for(int i=0;i<n;i++) {
			//左边比他大的
			int leftmax=0;
			for(int l=0;l<i;l++) {
				if(child[l]>child[i]) leftmax++;
			}
			//右边比他小的
			int rightmin=0;
			for(int r=i+1;r<n;r++) {
				if(child[r]<child[i]) rightmin++;
			}
			
			//等差公项和sn,等差是1
			int an = leftmax+rightmin;
			int sn = (1+an)*an/2;
			sum+=sn;
		}
	}
}

/*


import java.util.Scanner;

public class Main {
    //h数组存放每个小朋友身高
    private static int h[];
    //树状数组c统计每个身高出现的次数
    public static int []c;
    //cnt数组存放每个小朋友的交换次数
    public static long []cnt;
    static int maxH=-1;
    //求二进制数第一个1所代表得十进制数值    
    /*如1100（十进制的12）的为100（十进制的4）
    求解过程如下
     *        1100
    *&        1011
    *得       1000
     *则1100减1000得100为4    
     *   
    private static int lowbit(int k) {
        return k-(k&(k-1));
    }
    //更新树状数组
    private static void update(int i,int n,int v,int []c) {
        for (int k = i; k<=n; k+=lowbit(k)) {
            c[k]+=v;
        }
    }
    //求树状数组前缀和
    private static long getSum(int i,int []c) {
        long ans=0;
        for (int k = i; k>=1 ; k-=lowbit(k)) {
            ans+=c[k];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        int n=reader.nextInt();
        h=new int[n];
        cnt=new long[n];
        for (int i = 0; i < n; i++) {
            h[i]=reader.nextInt();
            if(h[i]>maxH) maxH=h[i];
        }
        //身高作为动态数组c的下标 身高的最大值+1即为数组长度
        c=new int[maxH+2];
        //从左往右扫描一遍
        for (int i = 0; i < n; i++) {
            //动态维护树状数组
            update(h[i]+1,maxH+1,1,c);
            long sum=getSum(h[i]+1,c);//小于等于h[i]+1的数据的个数
            cnt[i]+=(i+1)-sum;    //总数减去小于等于h[i]+1的数据的个数得到 当前数据左侧比数据大的数的个数
        }
        //清零
        c=new int[maxH+2];
        //从右往左扫描一遍
        for (int i = n-1; i >= 0; i--) {
            //动态维护树状数组
            update(h[i]+1,maxH+1,1,c);
            cnt[i]+=getSum(h[i],c);//当前数据右侧比数据小的数据个数
        }
        long ans=0;
        for(int i=0;i<n;i++) {
            ans+=cnt[i]*(cnt[i]+1)/2;
        }
        System.out.println(ans);
//        for (int i = 1; i < c.length; i++) {
//            System.out.println(i+"----"+c[i]);
//        }
    }
}

*/
