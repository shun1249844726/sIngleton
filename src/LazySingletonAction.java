
/**
 * ¿¡∫∫
 * @author xushun
 *
 */
public class LazySingletonAction {

	public static void main(String[] args) {
		MyThread[] threads = new MyThread[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new MyThread();
		}
		for (int i = 0; i < 10; i++) {
			threads[i].start();
		}
		
	}

}
class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println(LazySingleton.getInstance().hashCode());
	}
	
}