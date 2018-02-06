
/**
 * 饿汉模式
 * @author xushun
 *
 */
//  不足之处 不能对instance 做延时加载。
public class HungurySingleton {

	private static final HungurySingleton mHungruySingleton = new HungurySingleton();  //2  静态
	private HungurySingleton(){ //1 构造方法
		System.out.println("singleton is create");
	}
	private HungurySingleton getHungurySingleton() { //3  静态
		return mHungruySingleton;
	}
	
	public static void createString() {
		System.out.println("create string ");
	}
	public static void main(String[] args) {
		HungurySingleton.createString();
	}
	
}
