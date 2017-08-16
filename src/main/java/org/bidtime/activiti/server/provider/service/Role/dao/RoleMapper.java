package org.bidtime.activiti.server.provider.service.Role.dao;

import java.util.List;

import org.bidtime.activiti.server.api.po.Role;
import org.bidtime.activiti.server.api.po.Role_permission;
import org.bidtime.activiti.server.api.po.User_role;

public interface RoleMapper {
	
	List<Role> getRoles();

	void adduserrole(User_role ur);

	Role getRoleidbyName(String rolename);

	List<Role> getRoleinfo();

	void addRole(Role role);

	void addRolePermission(Role_permission rp);

	void deleterole(int rid);

	void deleterole_permission(int roleid);

	void deleteuser_role(int roleid);

	Role getRolebyid(int rid);
	
}
