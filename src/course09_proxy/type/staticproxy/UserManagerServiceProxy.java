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
			System.out.println("��־��ʼ----------------------------");
			userManagerService.addUser(userId, userName);
			System.out.println("��ӳɹ�");
			System.out.println("��־����");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ʧ��");
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
