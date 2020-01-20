package course09_proxy.type.staticproxy;

import course09_proxy.type.service.UserManagerService;

public class UserManagerServiceProxy implements UserManagerService {
	
	private UserManagerService userManagerService;
	
	

	public UserManagerServiceProxy(UserManagerService userManagerService) {
		super();
		this.userManagerService = userManagerService;
	}

	@Override
	public void addUser(Integer userId, String userName) {
		// TODO Auto-generated method stub
		try {
			System.out.println("日志开始----------------------------");
			userManagerService.addUser(userId, userName);
			System.out.println("添加成功");
			System.out.println("日志结束");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("添加失败");
		}
	}

	@Override
	public void delUser(Integer userId, String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(Integer userId, String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void queryUser(Integer userId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
