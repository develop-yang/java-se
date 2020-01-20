package course06_interface.employee;

import course06_interface.person.Person;

public class Employee implements Person {
	
	static {
		Integer employeeNum = 0;
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("employee eat()");
	}
	
	public void active() {
		System.out.println("employee active");
		System.out.println(type);
		Person.personType();
	}
}
