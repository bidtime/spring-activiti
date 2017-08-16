package org.bidtime.activiti.server.provider.service.Login.service;

import org.bidtime.activiti.server.api.po.User;
import org.bidtime.activiti.server.api.service.LoginService;
import org.bidtime.activiti.server.provider.service.Login.dao.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT, timeout = 5)
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginMapper loginmapper;

	public String getpwdbyname(String name) {
		User s = loginmapper.getpwdbyname(name);
		if (s != null) {
			return s.getPassword();
		} else {
			return null;
		}
	}

}
