package course06_interface.person;

/**
 * �ӿڿ��԰�����̬�����;�̬������Ĭ��Ϊpublic static
 * �ӿڿ��԰�������  �������󷽷��;�̬����
 * @author 18856
 *
 */
public interface Person {
	
	String type = "��";
	static void personType() {
		System.out.println("����" + type + "!");
	}
	
	public static Integer age = 3;

	/**
	 * jdk8����default���εķ����������з�������
	 * @return
	 */
//	defalut abstract void eat();
	
	default Integer testMethod () {
		return null;
	}
	
	default Integer testMethod1() {
		return null;
	}
	
	public abstract void eat();
	
	
}
