package course05_abstract;

public class Dog extends Animal {

	@Override
	String eat() {
		// TODO Auto-generated method stub
		System.out.println("Dog eta()");
		return "eat";
	}

	@Override
	boolean run() {
		// TODO Auto-generated method stub
		System.out.println("Dog run()");
		return false;
	}

	@Override
	boolean stop() {
		// TODO Auto-generated method stub
		System.out.println("Dog stop()");
		return false;
	}
	
	public void active(int age) {
		super.setAge(age);
		System.out.println(this.age);
	}
	
	
	public void dogActive(int age) {
		setAge(age);
		System.out.println(this.age);
	}

	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
