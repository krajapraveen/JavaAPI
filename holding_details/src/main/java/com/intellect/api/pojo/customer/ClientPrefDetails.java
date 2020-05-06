package com.intellect.api.pojo.customer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class ClientPrefDetails {
	private String modeCommnCombo;
	private String preferedDay;
	private String prefTimeFrom;
	private String prefTimeTo;
	private String predfdLang;
	private String predfdLocation;
	private String holdMail;
	private String holdMailFrm;
	private String holdMailTo;
	private String holdCall;
	private String holdCallFrm;
	private String holdCallTo;
	private String delReport;
	
	public String getModeCommnCombo() {
		return modeCommnCombo;
	}
	public void setModeCommnCombo(String modeCommnCombo) {
		this.modeCommnCombo = modeCommnCombo;
	}
	public String getPreferedDay() {
		return preferedDay;
	}
	public void setPreferedDay(String preferedDay) {
		this.preferedDay = preferedDay;
	}
	public String getPrefTimeFrom() {
		return prefTimeFrom;
	}
	public void setPrefTimeFrom(String prefTimeFrom) {
		this.prefTimeFrom = prefTimeFrom;
	}
	public String getPrefTimeTo() {
		return prefTimeTo;
	}
	public void setPrefTimeTo(String prefTimeTo) {
		this.prefTimeTo = prefTimeTo;
	}
	public String getPredfdLang() {
		return predfdLang;
	}
	public void setPredfdLang(String predfdLang) {
		this.predfdLang = predfdLang;
	}
	public String getPredfdLocation() {
		return predfdLocation;
	}
	public void setPredfdLocation(String predfdLocation) {
		this.predfdLocation = predfdLocation;
	}
	public String getHoldMail() {
		return holdMail;
	}
	public void setHoldMail(String holdMail) {
		this.holdMail = holdMail;
	}
	public String getHoldMailFrm() {
		return holdMailFrm;
	}
	public void setHoldMailFrm(String holdMailFrm) {
		this.holdMailFrm = holdMailFrm;
	}
	public String getHoldMailTo() {
		return holdMailTo;
	}
	public void setHoldMailTo(String holdMailTo) {
		this.holdMailTo = holdMailTo;
	}
	public String getHoldCall() {
		return holdCall;
	}
	public void setHoldCall(String holdCall) {
		this.holdCall = holdCall;
	}
	public String getHoldCallFrm() {
		return holdCallFrm;
	}
	public void setHoldCallFrm(String holdCallFrm) {
		this.holdCallFrm = holdCallFrm;
	}
	public String getHoldCallTo() {
		return holdCallTo;
	}
	public void setHoldCallTo(String holdCallTo) {
		this.holdCallTo = holdCallTo;
	}
	public String getDelReport() {
		return delReport;
	}
	public void setDelReport(String delReport) {
		this.delReport = delReport;
	}
}
