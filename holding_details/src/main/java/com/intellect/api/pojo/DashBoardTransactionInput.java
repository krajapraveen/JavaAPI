package com.intellect.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.ALWAYS)
public class DashBoardTransactionInput {
	private String baseNo;
	private String fromDate;
	private String toDate;
	
	public String getBaseNo() {
		return baseNo;
	}
	public void setBaseNo(String baseNo) {
		this.baseNo = baseNo;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
}
