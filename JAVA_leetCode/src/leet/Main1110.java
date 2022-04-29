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
	        //判非法
	        if(max<x)
	            return 0;
	        //计算组合c(max,x)（表示从max中挑选x个数字）的值
	        long res=1;
	        //计算A(7,3)
	        for (int i = 0; i < x; i++) {
	            res=res*(max-i);
	        }
	        //计算A(7,3)/A(3,3)
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
	        // 先处理除去首段的w/k段（因为w/k可能除不尽 那这里就相当于先处理除去首段的其他段）
	        /*
	         * 这里使用new BigInteger(long)构造器会报 "The constructor BigInteger(long) is not visible"的错误
	         */
	        long max=(long) Math.pow(2,k);
	        for(int i=2;i<=w/k;i++) {
	            BigInteger temp=BigInteger.valueOf(combination(max-1,i));
	            //加完还要再赋值回去
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
