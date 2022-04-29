package mainc;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main1462 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

//		5 
//		5 3 8 2 9
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<n;i++) {
			pq.add(scanner.nextInt());
		}
		System.out.println(Huffman(pq));
	}

	public static int Huffman(PriorityQueue<Integer> pq) {
		int sum = 0;
		int x = 0;
		while(!pq.isEmpty()) {
			x = pq.poll();
			if(pq.isEmpty()) break;
			x += pq.poll();
			sum += x;
			pq.add(x);
		}
		
		return sum;
	}
}
