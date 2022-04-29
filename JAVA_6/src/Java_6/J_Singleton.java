package Java_6;

public class J_Singleton {
	private static J_Singleton m_1=new J_Singleton();
	private static J_Singleton m_2=new J_Singleton();
	
	private J_Singleton(){}
	
	public static J_Singleton mb_get1() {
		return m_1;
	}
	public static J_Singleton mb_get2() {
		return m_2;
	}
	public static void main(String args[]) {
		
	}
}
