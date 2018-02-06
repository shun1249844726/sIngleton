/**
 * ��̬�ڲ��෽��ʵ��
 * @author xushun
 *
 */
public class StaticInnerSingleton {

	private StaticInnerSingleton() {
		
	}
	private static StaticInnerSingleton getInstance() {
		return SingletonHolder.sStaticInnerSingle;
	}
	private static class SingletonHolder{
		private static final StaticInnerSingleton sStaticInnerSingle = new StaticInnerSingleton();
	}
}
