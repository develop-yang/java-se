package course09_proxy.type.service;

public interface UserManagerService {
	
	void addUser(Integer userId, String userName);
	
	void delUser(Integer userId, String userName);
	
	void updateUser(Integer userId, String userName);
	
	void queryUser(Integer userId);
	
}
