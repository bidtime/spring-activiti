package org.bidtime.activiti.server.provider.service.LeaveApply.dao;

import org.bidtime.activiti.server.api.po.LeaveApply;

public interface LeaveApplyMapper {
	void save(LeaveApply apply);
	LeaveApply get(int id);
	void update(LeaveApply app);
}
