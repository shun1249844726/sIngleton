
public class LazySingleton {

	private static LazySingleton instance;
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance() {  // �߳�  ����ͬ���ġ�
		
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	public static void createStirng() {
		System.out.println("craate string");
	}
	
	public static void main(String[] args) {
		LazySingleton.createStirng();
	}
	
	public static synchronized LazySingleton getInstance_1() {  // �������  ͬ����   1
		
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
	
	public static  LazySingleton getInstance_2() {
		synchronized(LazySingleton.class) {
			if (instance == null) {
				instance = new LazySingleton();
			}
		}
		return instance;

	}
}
