/**
 * 
 */
package course10_lambada;

import course10_lambada.interfa.Ability;

/**
 * @description
 * @author zhangen.yang
 * @date: 2019��12��29������4:57:56
 */
public class TestCode {
	public static void main(String[] args) {
		// ʹ�������ڲ��࣬���Բ�ͨ�����������ʵ���ֱ࣬�ӻ����������ʵ�������
		Ability ability = new Ability() {

			@Override
			public void doAbility(String token) {
				// TODO Auto-generated method stub
				System.out.println(token);
				System.out.println("����һֻСС�񰡣���Ҫ�ɵø��ߣ�������");
			}
		};
		ability.doAbility("��ʼʹ�������ڲ���ʵ��");
		
		// ͨ��lambada���ʽʵ�ֽӿ�����
		Ability ab = (token) -> {
			System.out.println(token);
			System.out.println("����һֻ���ɵ���");
		};
		ab.doAbility("��ʼʹ��lambada���ʽʵ��");
	}

}
