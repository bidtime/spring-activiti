package org.bidtime.activiti.server.provider.service.Permission.dao;

import java.util.List;

import org.bidtime.activiti.server.api.po.Permission;

public interface PermissionMapper {
	
	List<Permission> getPermissions();

	Permission getPermissionByname(String permissionname);

	void addpermission(String permissionname);

	void deletepermission(int pid);

	void deleteRole_permission(int permissionid);
	
}
