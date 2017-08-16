package org.bidtime.activiti.server.provider.service.User.dao;

import java.util.List;

import org.bidtime.activiti.server.api.po.User;

public interface UserMapper {
	
	List<User> getusers();

	User getUserByid(int id);

	void deleteuser(int uid);

	void deleteuserrole(int uid);

	void adduser(User user);

	void updateuser(User user);

	int getUidByusername(String username);
	
}
