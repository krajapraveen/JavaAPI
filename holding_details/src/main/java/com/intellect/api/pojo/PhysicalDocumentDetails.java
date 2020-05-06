package com.intellect.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class PhysicalDocumentDetails {

	private String docGroup;
	private String text;
	private String status;
	private String file;
	public String getDocGroup() {
		return docGroup;
	}
	public void setDocGroup(String docGroup) {
		this.docGroup = docGroup;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
}
