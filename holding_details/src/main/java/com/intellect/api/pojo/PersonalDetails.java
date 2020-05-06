package com.intellect.api.pojo;

public class PersonalDetails {

	private String first_name;
	private String rmName;
	private String maritalStatus;
	private String userId;
	private String branchCd;
	private String prospectCat;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getRmName() {
		return rmName;
	}
	public void setRmName(String rmName) {
		this.rmName = rmName;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBranchCd() {
		return branchCd;
	}
	public void setBranchCd(String branchCd) {
		this.branchCd = branchCd;
	}
	public String getProspectCat() {
		return prospectCat;
	}
	public void setProspectCat(String prospectCat) {
		this.prospectCat = prospectCat;
	}
	@Override
	public String toString() {
		return "PersonalDetails [first_name=" + first_name + ", rmName=" + rmName + ", maritalStatus=" + maritalStatus
				+ ", userId=" + userId + ", branchCd=" + branchCd + ", prospectCat=" + prospectCat + "]";
	}
	
}
