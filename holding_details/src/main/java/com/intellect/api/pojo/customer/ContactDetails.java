package com.intellect.api.pojo.customer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class ContactDetails {
	private String seq_id;
	private String conType;
	private String conCC;
	private String conAC;
	private String conVal;
	private String extNo;
	public String getSeq_id() {
		return seq_id;
	}
	public void setSeq_id(String seq_id) {
		this.seq_id = seq_id;
	}
	public String getConType() {
		return conType;
	}
	public void setConType(String conType) {
		this.conType = conType;
	}
	public String getConCC() {
		return conCC;
	}
	public void setConCC(String conCC) {
		this.conCC = conCC;
	}
	public String getConAC() {
		return conAC;
	}
	public void setConAC(String conAC) {
		this.conAC = conAC;
	}
	public String getConVal() {
		return conVal;
	}
	public void setConVal(String conVal) {
		this.conVal = conVal;
	}
	public String getExtNo() {
		return extNo;
	}
	public void setExtNo(String extNo) {
		this.extNo = extNo;
	}
}
