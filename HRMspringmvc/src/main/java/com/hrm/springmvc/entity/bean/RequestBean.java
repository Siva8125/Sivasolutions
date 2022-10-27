package com.hrm.springmvc.entity.bean;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "responsebean")
public class RequestBean {

	@Id
	private String textArea;
	private String senderMail;
	private String recieverMail;
	private String reasonName;
	private String reasonId;
	private String status;
	private String managerReason;
	private String reAssignMailId;
	
	public String getTextArea() {
		return textArea;
	}
	public void setTextArea(String textArea) {
		this.textArea = textArea;
	}
	public String getSenderMail() {
		return senderMail;
	}
	public void setSenderMail(String senderMail) {
		this.senderMail = senderMail;
	}
	public String getRecieverMail() {
		return recieverMail;
	}
	public void setRecieverMail(String recieverMail) {
		this.recieverMail = recieverMail;
	}
	public String getReasonName() {
		return reasonName;
	}
	public void setReasonName(String reasonName) {
		this.reasonName = reasonName;
	}
	public String getReasonId() {
		return reasonId;
	}
	public void setReasonId(String reasonId) {
		this.reasonId = reasonId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getManagerReason() {
		return managerReason;
	}
	public void setManagerReason(String managerReason) {
		this.managerReason = managerReason;
	}
	public String getReAssignMailId() {
		return reAssignMailId;
	}
	public void setReAssignMailId(String reAssignMailId) {
		this.reAssignMailId = reAssignMailId;
	}
	
}