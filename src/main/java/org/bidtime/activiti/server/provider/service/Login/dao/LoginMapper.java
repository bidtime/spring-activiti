package org.bidtime.activiti.server.provider.service.Login.dao;

import org.bidtime.activiti.server.api.po.User;

public interface LoginMapper {
	User getpwdbyname(String name);
}
