/**
 * 
 */
package leet;

import java.util.Scanner;

/**
 * @author 123
 *
 */
public class Leet1518 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println(numWaterBottles(num1,num2));
	}
	public static int numWaterBottles(int numBottles, int numExchange) {
		int ans =numBottles;
		int yushu = 0;
		while(numBottles >= numExchange) {
			yushu = numBottles %numExchange;
			ans += numBottles / numExchange;
			numBottles = numBottles / numExchange + yushu;
		}
		
		return ans;
    }
}
