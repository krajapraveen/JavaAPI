package com.intellect.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;
@JsonInclude(Include.ALWAYS)
public class Contact {

	private String conType;
	private String conCC;
	private String conAC;
	private String conVal;
	private String extNo;
	private String seq_id;
	
	@ApiModelProperty(value = "communication type", allowableValues = "EMAIL,MOBILE")
	public String getConType() {
		return conType;
	}
	public void setConType(String conType) {
		this.conType = conType;
	}
	public String getConCC() {
		return conCC;
	}
	@JsonProperty(value="")
	public void setConCC(String conCC) {
		this.conCC = conCC;
	}
	
	public String getConAC() {
		return conAC;
	}
	@JsonProperty(value="")
	public void setConAC(String conAC) {
		this.conAC = conAC;
	}
	public String getConVal() {
		return conVal;
	}
	public void setConVal(String conVal) {
		this.conVal = conVal;
	}
	@JsonProperty(value="")
	public String getExtNo() {
		return extNo;
	}
	public void setExtNo(String extNo) {
		this.extNo = extNo;
	}
	public String getSeq_id() {
		return seq_id;
	}
	public void setSeq_id(String seq_id) {
		this.seq_id = seq_id;
	}
	
}
