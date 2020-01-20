package course09_proxy.type.cglibProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 
 * @description
 * @author zhangen.yang
 * @date: 2019年12月29日下午12:15:21
 */
public class UserManagerServiceImplInterceptor implements MethodInterceptor {
	
	
	/**
	 * 
	 * @description
	 * @param o			要增强的对象
	 * @param method	拦截的方法
	 * @param objects	参数列表
	 * @param methodProxy	方法的代理
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("--------------方法调用前处理--------------");
		Object object = methodProxy.invokeSuper(o, objects);
		System.out.println("---------调用后处理---------");
		return object;
	}
	

	
	
	
}
