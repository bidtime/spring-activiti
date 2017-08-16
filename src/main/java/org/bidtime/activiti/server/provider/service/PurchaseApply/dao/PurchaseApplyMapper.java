package org.bidtime.activiti.server.provider.service.PurchaseApply.dao;

import org.bidtime.activiti.server.api.po.PurchaseApply;

public interface PurchaseApplyMapper {
	
	void save(PurchaseApply apply);

	PurchaseApply get(int id);

	void update(PurchaseApply apply);
	
}
