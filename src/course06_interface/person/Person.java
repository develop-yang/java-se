package course06_interface.person;

/**
 * 接口可以包含静态变量和静态方法，默认为public static
 * 接口可以包含方法  包括抽象方法和静态方法
 * @author 18856
 *
 */
public interface Person {
	
	String type = "人";
	static void personType() {
		System.out.println("我是" + type + "!");
	}
	
	public static Integer age = 3;

	/**
	 * jdk8新增default修饰的方法，必须有方法主体
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
