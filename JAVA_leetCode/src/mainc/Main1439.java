package mainc;

import java.util.Scanner;

public class Main1439 {
	
	static int []child = new int[100000];
	static int n,sum=0;
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		n = scanner.nextInt();
		for(int i=0;i<n;i++) {
			child[i] = scanner.nextInt();
		}
		sortheight();
		System.out.println(sum);
	}
	
	public static void sortheight() {
		for(int i=0;i<n;i++) {
			//��߱������
			int leftmax=0;
			for(int l=0;l<i;l++) {
				if(child[l]>child[i]) leftmax++;
			}
			//�ұ߱���С��
			int rightmin=0;
			for(int r=i+1;r<n;r++) {
				if(child[r]<child[i]) rightmin++;
			}
			
			//�Ȳ���sn,�Ȳ���1
			int an = leftmax+rightmin;
			int sn = (1+an)*an/2;
			sum+=sn;
		}
	}
}

/*


import java.util.Scanner;

public class Main {
    //h������ÿ��С�������
    private static int h[];
    //��״����cͳ��ÿ����߳��ֵĴ���
    public static int []c;
    //cnt������ÿ��С���ѵĽ�������
    public static long []cnt;
    static int maxH=-1;
    //�����������һ��1�������ʮ������ֵ    
    /*��1100��ʮ���Ƶ�12����Ϊ100��ʮ���Ƶ�4��
    ����������
     *        1100
    *&        1011
    *��       1000
     *��1100��1000��100Ϊ4    
     *   
    private static int lowbit(int k) {
        return k-(k&(k-1));
    }
    //������״����
    private static void update(int i,int n,int v,int []c) {
        for (int k = i; k<=n; k+=lowbit(k)) {
            c[k]+=v;
        }
    }
    //����״����ǰ׺��
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
        //�����Ϊ��̬����c���±� ��ߵ����ֵ+1��Ϊ���鳤��
        c=new int[maxH+2];
        //��������ɨ��һ��
        for (int i = 0; i < n; i++) {
            //��̬ά����״����
            update(h[i]+1,maxH+1,1,c);
            long sum=getSum(h[i]+1,c);//С�ڵ���h[i]+1�����ݵĸ���
            cnt[i]+=(i+1)-sum;    //������ȥС�ڵ���h[i]+1�����ݵĸ����õ� ��ǰ�����������ݴ�����ĸ���
        }
        //����
        c=new int[maxH+2];
        //��������ɨ��һ��
        for (int i = n-1; i >= 0; i--) {
            //��̬ά����״����
            update(h[i]+1,maxH+1,1,c);
            cnt[i]+=getSum(h[i],c);//��ǰ�����Ҳ������С�����ݸ���
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
