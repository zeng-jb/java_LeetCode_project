/**
 * 
 */
package leet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author 123
 * 630. 课程表 III
 *这里有 n 门不同的在线课程，按从 1 到 n 编号。给你一个数组 courses ，其中 courses[i] = [durationi, lastDayi] 表示第 i 门课将会 持续 上 durationi 天课，并且必须在不晚于 lastDayi 的时候完成。

你的学期从第 1 天开始。且不能同时修读两门及两门以上的课程。

返回你最多可以修读的课程数目。

输入：courses = [[100, 200], [200, 1300], [1000, 1250], [2000, 3200]]
输出：3
解释：
这里一共有 4 门课程，但是你最多可以修 3 门：
首先，修第 1 门课，耗费 100 天，在第 100 天完成，在第 101 天开始下门课。
第二，修第 3 门课，耗费 1000 天，在第 1100 天完成，在第 1101 天开始下门课程。
第三，修第 2 门课，耗时 200 天，在第 1300 天完成。
第 4 门课现在不能修，因为将会在第 3300 天完成它，这已经超出了关闭日期。

输入：courses = [[1,2]]
输出：1


输入：courses = [[3,2],[4,3]]
输出：0
 */
public class Leet630 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] courses = {{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}};
//		int [][] courses = {{1,2}};
//		int [][] courses = {{3,2}, {4,3}};
		System.out.println(scheduleCourse(courses));
	}
	
	public static int scheduleCourse(int[][] courses) {
		int sumdays = 0;
		
		Arrays.sort(courses, new Comparator<int []>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO 自动生成的方法存根
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}else
					return o1[1] - o2[1];
			}
		});
		
		//优先队列实现，由大到小排序
		PriorityQueue<Integer> pq = new  PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO 自动生成的方法存根
				return o2-o1;
			}
		});
		
		for (int i = 0; i < courses.length; i++) {
			int[] js = courses[i];
			sumdays += js[0];
			pq.add(js[0]);
			if(sumdays > js[1]) {
				sumdays -= pq.poll();
			}
		}
		
		
//		for (int[] is : courses) {
//			System.out.println(Arrays.toString(is));
//		}
		return pq.size();
		
    }

}
