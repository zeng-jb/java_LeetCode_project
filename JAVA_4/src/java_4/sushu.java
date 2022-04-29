package java_4;

public class sushu {
	public static void main(String argc[]) {
		int sum=0;
		 int i;
		for( i=2;i<100;i++) {
			int flag=1,j;
			for(j=2;j<i;j++) {
				if(i%j==0) {flag=0;break;}
			}
			if(flag==1) {System.out.print(j+" ");sum+=j;}
		}
		System.out.println();
		System.out.println(sum);
	}
}
