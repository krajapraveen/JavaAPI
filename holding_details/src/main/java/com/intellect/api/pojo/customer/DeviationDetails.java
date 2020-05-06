package com.intellect.api.pojo.customer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class DeviationDetails {
	 private String DEDUPREASON;
	 private String SDNREASON;
	 private String ISMINOR;
	 
	public String getDEDUPREASON() {
		return DEDUPREASON;
	}
	@JsonSetter("DEDUPREASON")
	public void setDEDUPREASON(String dEDUPREASON) {
		DEDUPREASON = dEDUPREASON;
	}
	public String getSDNREASON() {
		return SDNREASON;
	}
	@JsonSetter("SDNREASON")
	public void setSDNREASON(String sDNREASON) {
		SDNREASON = sDNREASON;
	}
	public String getISMINOR() {
		return ISMINOR;
	}
	@JsonSetter("ISMINOR")
	public void setISMINOR(String iSMINOR) {
		ISMINOR = iSMINOR;
	}
}
