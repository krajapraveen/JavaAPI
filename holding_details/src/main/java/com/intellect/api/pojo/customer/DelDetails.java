package com.intellect.api.pojo.customer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class DelDetails {

	private String DELADD;
	private String DELCONT;
	private String DELPERMIT;
	private String DELDEPEN;
	
	public String getDELADD() {
		return DELADD;
	}
	@JsonSetter("DELADD")
	public void setDELADD(String dELADD) {
		DELADD = dELADD;
	}
	public String getDELCONT() {
		return DELCONT;
	}
	@JsonSetter("DELCONT")
	public void setDELCONT(String dELCONT) {
		DELCONT = dELCONT;
	}
	public String getDELPERMIT() {
		return DELPERMIT;
	}
	@JsonSetter("DELPERMIT")
	public void setDELPERMIT(String dELPERMIT) {
		DELPERMIT = dELPERMIT;
	}
	public String getDELDEPEN() {
		return DELDEPEN;
	}
	@JsonSetter("DELDEPEN")
	public void setDELDEPEN(String dELDEPEN) {
		DELDEPEN = dELDEPEN;
	}

}
