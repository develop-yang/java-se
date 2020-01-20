package course09_proxy.type.staticproxy;

import course09_proxy.type.service.impl.UserManagerServiceImpl;

public class ProxyTest {
	
	public static void main(String[] args) {
		
		UserManagerServiceProxy userManagerServiceProxy = new UserManagerServiceProxy(new UserManagerServiceImpl());
		userManagerServiceProxy.addUser(123, "ÀîËÄ");
	}
	
}
