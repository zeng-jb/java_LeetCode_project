package leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leet954 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int []arr = {2,1,2,6};
		Leet954 obj = new Leet954();
		System.out.println(obj.canReorderDoubled(arr));
	}
	public boolean canReorderDoubled(int[] arr) {
		Arrays.sort(arr);
		Map<Integer, Integer> map = new HashMap<>();
		for (int i : arr) {
			//���iС��0������Ҫ�ұ���С�����ģ����������ɶԼ�һ����iҲ����map������i��map
			if(i < 0) {
				if(map.containsKey(i * 2) && map.get(i * 2) != 0 ) {
					map.put(i * 2, map.get(i * 2) - 1);
				}else {
					map.put(i, map.getOrDefault(i, 0) + 1);
				}
			}else {
				//���i����0����map����i����i��һ������ͽ�i���������뵽map
				if(map.containsKey(i) && map.get(i) != 0) {
					map.put(i, map.get(i) - 1);
				}else {
					map.put(i * 2, map.getOrDefault(i * 2, 0) + 1);
				}
			}
		}
		//������ڲ�Ϊ0 ���������û�гɶԳ��ְ���
		for( int v : map.values()) {
			if(v != 0) return false;
		}
		return true;
    }

}
