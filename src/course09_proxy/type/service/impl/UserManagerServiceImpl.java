package course09_proxy.type.service.impl;

import course09_proxy.type.service.UserManagerService;

public class UserManagerServiceImpl implements UserManagerService {
	
	

	@Override
	public void addUser(Integer userId, String userName) {
		// TODO Auto-generated method stub
		System.out.println("�����û�:" + userId + "===>" + userName);
	}

	@Override
	public void delUser(Integer userId, String userName) {
		// TODO Auto-generated method stub
		System.out.println("ɾ���û�:" + userId + "===>" + userName);
	}

	@Override
	public void updateUser(Integer userId, String userName) {
		// TODO Auto-generated method stub
		System.out.println("�����û�:" + userId + "===>" + userName);
	}

	@Override
	public void queryUser(Integer userId) {
		// TODO Auto-generated method stub
		System.out.println("��ѯ�û�:" + userId);
	}
	
	
	
	
}
