
public class LazySingleton {

	private static LazySingleton instance;
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance() {  // 线程  不是同步的。
		
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
	
	public static synchronized LazySingleton getInstance_1() {  // 解决方法  同步锁   1
		
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
