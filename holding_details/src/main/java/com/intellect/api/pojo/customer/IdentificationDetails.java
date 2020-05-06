package com.intellect.api.pojo.customer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class IdentificationDetails {
	private String docType;
	private String docRegNo;
	private String docName;
	private String docPlIssue;
	private String docIssueDate;
	private String docExpDate;
	private String seq_id;
	
	public String getDocType() {
		return docType;
	}
	public void setDocType(String docType) {
		this.docType = docType;
	}
	public String getDocRegNo() {
		return docRegNo;
	}
	public void setDocRegNo(String docRegNo) {
		this.docRegNo = docRegNo;
	}
	public String getDocName() {
		return docName;
	}
	public void setDocName(String docName) {
		this.docName = docName;
	}
	public String getDocPlIssue() {
		return docPlIssue;
	}
	public void setDocPlIssue(String docPlIssue) {
		this.docPlIssue = docPlIssue;
	}
	public String getDocIssueDate() {
		return docIssueDate;
	}
	public void setDocIssueDate(String docIssueDate) {
		this.docIssueDate = docIssueDate;
	}
	public String getDocExpDate() {
		return docExpDate;
	}
	public void setDocExpDate(String docExpDate) {
		this.docExpDate = docExpDate;
	}
	public String getSeq_id() {
		return seq_id;
	}
	public void setSeq_id(String seq_id) {
		this.seq_id = seq_id;
	}
}
