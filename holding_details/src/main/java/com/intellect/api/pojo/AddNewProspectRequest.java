package com.intellect.api.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonSetter;

public class AddNewProspectRequest {

	private String custNo;
	private String mode;
	private String diffMode;
	private InputDetails inputDet;
	private List<DependantDetails> dependantjsonArray;
	private List<AddressDetails> addressjsonArray;
	private List<Contact> contactsjsonArray;
	private List<Permitions> permitjsonArray;
	private List<PhysicalDocumentDetails> docDetjsonArray;
	private ClientPref clientPrefObj;
	private List<ReportingDetails> reportingArray;
	private List<PassportDetails> passportjsonArray;
	private List<LicenceDetails> lisencejsonArray;
	
	private DelOperationDetails delJSONObject;
	private ExisitngLeadDetails exisitngLeadObj;
	private DynamicudDetails DynamicudfObj;

	public String getCustNo() {
		return custNo;
	}

	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getDiffMode() {
		return diffMode;
	}

	public void setDiffMode(String diffMode) {
		this.diffMode = diffMode;
	}

	public InputDetails getInputDet() {
		return inputDet;
	}

	public void setInputDet(InputDetails inputDet) {
		this.inputDet = inputDet;
	}

	public List<DependantDetails> getDependantjsonArray() {
		return dependantjsonArray;
	}

	public void setDependantjsonArray(List<DependantDetails> dependantjsonArray) {
		this.dependantjsonArray = dependantjsonArray;
	}

	public List<AddressDetails> getAddressjsonArray() {
		return addressjsonArray;
	}

	public void setAddressjsonArray(List<AddressDetails> addressjsonArray) {
		this.addressjsonArray = addressjsonArray;
	}

	public List<Contact> getContactsjsonArray() {
		return contactsjsonArray;
	}

	public void setContactsjsonArray(List<Contact> contactsjsonArray) {
		this.contactsjsonArray = contactsjsonArray;
	}

	public List<PhysicalDocumentDetails> getDocDetjsonArray() {
		return docDetjsonArray;
	}

	public void setDocDetjsonArray(List<PhysicalDocumentDetails> docDetjsonArray) {
		this.docDetjsonArray = docDetjsonArray;
	}

	public ClientPref getClientPrefObj() {
		return clientPrefObj;
	}

	public void setClientPrefObj(ClientPref clientPrefObj) {
		this.clientPrefObj = clientPrefObj;
	}

	public DelOperationDetails getDelJSONObject() {
		return delJSONObject;
	}

	public void setDelJSONObject(DelOperationDetails delJSONObject) {
		this.delJSONObject = delJSONObject;
	}

	public List<Permitions> getPermitjsonArray() {
		return permitjsonArray;
	}

	public void setPermitjsonArray(List<Permitions> permitjsonArray) {
		this.permitjsonArray = permitjsonArray;
	}

	public List<ReportingDetails> getReportingArray() {
		return reportingArray;
	}

	public void setReportingArray(List<ReportingDetails> reportingArray) {
		this.reportingArray = reportingArray;
	}

	public List<PassportDetails> getPassportjsonArray() {
		return passportjsonArray;
	}

	public void setPassportjsonArray(List<PassportDetails> passportjsonArray) {
		this.passportjsonArray = passportjsonArray;
	}

	public List<LicenceDetails> getLisencejsonArray() {
		return lisencejsonArray;
	}

	public void setLisencejsonArray(List<LicenceDetails> lisencejsonArray) {
		this.lisencejsonArray = lisencejsonArray;
	}

	public ExisitngLeadDetails getExisitngLeadObj() {
		return exisitngLeadObj;
	}

	public void setExisitngLeadObj(ExisitngLeadDetails exisitngLeadObj) {
		this.exisitngLeadObj = exisitngLeadObj;
	}

	public DynamicudDetails getDynamicudfObj() {
		return DynamicudfObj;
	}
	@JsonSetter("DynamicudfObj")
	public void setDynamicudfObj(DynamicudDetails dynamicudfObj) {
		DynamicudfObj = dynamicudfObj;
	}
	
//	private PersonalDetails personalDetails;		
//	
//	private List<LifestyleDetails> lifestyleDetails;
//	private List<LogicalDocumentDetails> logicalDocumentDetails;
//	private List<ReportingDocumentDetails> reportingDocumentDetails;
	
	
	
}
