/**
 * 
 */
package leet;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author 123
 *
 */
public class Main1110 {

	   static BigInteger ans;
	    //c(7,3)=A(7,3)/A(3,3)    
	    public static long combination(long max,int x) {
	        //�зǷ�
	        if(max<x)
	            return 0;
	        //�������c(max,x)����ʾ��max����ѡx�����֣���ֵ
	        long res=1;
	        //����A(7,3)
	        for (int i = 0; i < x; i++) {
	            res=res*(max-i);
	        }
	        //����A(7,3)/A(3,3)
	        for(int i=1;i<=x;i++) {
	            res/=i;
	        }
	        return res;
	    }
	    public static void main(String[] args) {
	        int k,w;
	        ans=new BigInteger("0");
	        Scanner reader=new Scanner(System.in);
	        k=reader.nextInt();
	        w=reader.nextInt();
	        // �ȴ����ȥ�׶ε�w/k�Σ���Ϊw/k���ܳ����� ��������൱���ȴ����ȥ�׶ε������Σ�
	        /*
	         * ����ʹ��new BigInteger(long)�������ᱨ "The constructor BigInteger(long) is not visible"�Ĵ���
	         */
	        long max=(long) Math.pow(2,k);
	        for(int i=2;i<=w/k;i++) {
	            BigInteger temp=BigInteger.valueOf(combination(max-1,i));
	            //���껹Ҫ�ٸ�ֵ��ȥ
	            ans=ans.add(temp);
	        }
	        max=(long) Math.pow(2,w%k)-1;
	        for(int i=1;i<=max;i++) {
	            long f=(long) Math.pow(2,k)-1-i;
	            BigInteger temp=BigInteger.valueOf(combination(f,w/k));
	            ans=ans.add(temp);
	        }
	        System.out.println(ans);
	    }
	}
