package leet;

public class Leet521 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String a = "aa", b = "aaa";
		System.out.println(findLUSlength(a, b));
	}

	public static int findLUSlength(String a, String b) {
		if(a.equals(b)) {
			//���a��b��ȣ��Ǳ�Ȼû�в���ͬ��������
			return -1;
		}
		//���ȱȽϳ����ַ����ز�����Ϊ�̵������У����ֻҪ���س����ַ������ȼ���
		return Math.max(a.length(), b.length());
		
		//return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
