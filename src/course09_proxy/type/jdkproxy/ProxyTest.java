package course09_proxy.type.jdkproxy;


import course09_proxy.type.service.UserManagerService;
import course09_proxy.type.service.impl.UserManagerServiceImpl;

public class ProxyTest {
	
	public static void main(String[] args) {
		LogHandler logHandler = new LogHandler();
		UserManagerService userManagerService = (UserManagerService)logHandler.newProxyInstance(new UserManagerServiceImpl());
		userManagerService.addUser(111, "уехЩ");
	}
	
}
