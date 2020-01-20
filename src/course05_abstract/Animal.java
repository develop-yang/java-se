package course05_abstract;

public abstract class Animal {

	protected int age;

	protected float weight;

	// ���󷽷������ܰ�����������
	abstract String eat();

	abstract boolean run();

	abstract boolean stop();

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	
}
