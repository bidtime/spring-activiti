package org.bidtime.activiti.server.api.pagemodel;

import org.bidtime.activiti.server.api.po.LeaveApply;
import org.bidtime.activiti.server.api.po.PurchaseApply;

public class HistoryProcess {
	
	private String processDefinitionId;
	
	private String businessKey;
	
	private LeaveApply leaveapply;
	
	private PurchaseApply purchaseapply;

	public String getProcessDefinitionId() {
		return processDefinitionId;
	}

	public void setProcessDefinitionId(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public LeaveApply getLeaveapply() {
		return leaveapply;
	}

	public void setLeaveapply(LeaveApply leaveapply) {
		this.leaveapply = leaveapply;
	}

	public PurchaseApply getPurchaseapply() {
		return purchaseapply;
	}

	public void setPurchaseapply(PurchaseApply purchaseapply) {
		this.purchaseapply = purchaseapply;
	}

}
