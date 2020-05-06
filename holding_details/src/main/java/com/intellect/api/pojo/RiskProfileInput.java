package com.intellect.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModelProperty;
@JsonInclude(Include.ALWAYS)
public class RiskProfileInput {
	private String fnaID;
	private String brCd;
	public String getFnaID() {
		return fnaID;
	}
	public void setFnaID(String fnaID) {
		this.fnaID = fnaID;
	}
	public String getBrCd() {
		return brCd;
	}
	public void setBrCd(String brCd) {
		this.brCd = brCd;
	}
}
