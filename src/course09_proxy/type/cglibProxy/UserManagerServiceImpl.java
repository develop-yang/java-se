package course09_proxy.type.cglibProxy;

import course09_proxy.type.service.UserManagerService;

public class UserManagerServiceImpl {
	
	

	public void addUser(Integer userId, String userName) {
		// TODO Auto-generated method stub
		System.out.println("新增用户:" + userId + "===>" + userName);
	}

	
	public void delUser(Integer userId, String userName) {
		// TODO Auto-generated method stub
		System.out.println("删除用户:" + userId + "===>" + userName);
	}


	public void updateUser(Integer userId, String userName) {
		// TODO Auto-generated method stub
		System.out.println("更新用户:" + userId + "===>" + userName);
	}

	public void queryUser(Integer userId) {
		// TODO Auto-generated method stub
		System.out.println("查询用户:" + userId);
	}
	
	
	
	
}
