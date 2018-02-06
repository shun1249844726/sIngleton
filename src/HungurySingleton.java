
/**
 * ����ģʽ
 * @author xushun
 *
 */
//  ����֮�� ���ܶ�instance ����ʱ���ء�
public class HungurySingleton {

	private static final HungurySingleton mHungruySingleton = new HungurySingleton();  //2  ��̬
	private HungurySingleton(){ //1 ���췽��
		System.out.println("singleton is create");
	}
	private HungurySingleton getHungurySingleton() { //3  ��̬
		return mHungruySingleton;
	}
	
	public static void createString() {
		System.out.println("create string ");
	}
	public static void main(String[] args) {
		HungurySingleton.createString();
	}
	
}
