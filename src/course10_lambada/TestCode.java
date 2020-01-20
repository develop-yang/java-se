/**
 * 
 */
package course10_lambada;

import course10_lambada.interfa.Ability;

/**
 * @description
 * @author zhangen.yang
 * @date: 2019年12月29日下午4:57:56
 */
public class TestCode {
	public static void main(String[] args) {
		// 使用匿名内部类，可以不通过定义子类或实现类，直接获得子类对象或实现类对象
		Ability ability = new Ability() {

			@Override
			public void doAbility(String token) {
				// TODO Auto-generated method stub
				System.out.println(token);
				System.out.println("我是一只小小鸟啊，我要飞得更高！！！！");
			}
		};
		ability.doAbility("开始使用匿名内部类实现");
		
		// 通过lambada表达式实现接口子类
		Ability ab = (token) -> {
			System.out.println(token);
			System.out.println("我是一只自由的鸟");
		};
		ab.doAbility("开始使用lambada表达式实现");
	}

}
