package course09_proxy.type.cglibProxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @description
 * @author zhangen.yang
 * @date: 2019年12月29日下午12:23:02
 */
public class ProxyTest {
	
	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(UserManagerServiceImpl.class);
		enhancer.setCallback(new UserManagerServiceImplInterceptor());
		UserManagerServiceImpl userManagerServiceImpl = (UserManagerServiceImpl) enhancer.create();
		userManagerServiceImpl.addUser(222, "张三");
	}
}
