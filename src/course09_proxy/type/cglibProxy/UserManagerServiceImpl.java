package course09_proxy.type.cglibProxy;

import course09_proxy.type.service.UserManagerService;

public class UserManagerServiceImpl {
	
	

	public void addUser(Integer userId, String userName) {
		// TODO Auto-generated method stub
		System.out.println("�����û�:" + userId + "===>" + userName);
	}

	
	public void delUser(Integer userId, String userName) {
		// TODO Auto-generated method stub
		System.out.println("ɾ���û�:" + userId + "===>" + userName);
	}


	public void updateUser(Integer userId, String userName) {
		// TODO Auto-generated method stub
		System.out.println("�����û�:" + userId + "===>" + userName);
	}

	public void queryUser(Integer userId) {
		// TODO Auto-generated method stub
		System.out.println("��ѯ�û�:" + userId);
	}
	
	
	
	
}
