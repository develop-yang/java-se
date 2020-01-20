package course09_proxy.type.cglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 
 * @description
 * @author zhangen.yang
 * @date: 2019��12��29������12:15:21
 */
public class UserManagerServiceImplInterceptor implements MethodInterceptor {
	
	
	/**
	 * 
	 * @description
	 * @param o			Ҫ��ǿ�Ķ���
	 * @param method	���صķ���
	 * @param objects	�����б�
	 * @param methodProxy	�����Ĵ���
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("--------------��������ǰ����--------------");
		Object object = methodProxy.invokeSuper(o, objects);
		System.out.println("---------���ú���---------");
		return object;
	}
	

	
	
	
}
