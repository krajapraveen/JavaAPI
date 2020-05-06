package com.intellect.api.pojo.customer;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class CustomerOnboardRequest {
	private String mode;
	private String flag;
	private String custNo;
	private String diffMode;
	private InputDetails inputDetJSONObject;
	private List<DependantDetails> dependantJSONArray;
	private List<AddressDetails> addressJSONArray;
	private List<ContactDetails> contactsJSONArray;
	private List<IdentificationDetails> identificationDetJsonArr;
	private List<DocDetails> docDetJSONArray;
	private ClientPrefDetails clientPrefObj;
	private List<ReportingDetails> reportingArray;
	private List<LisenceDetails> lisencejsonArray;
	private List<PassportDetails> passportjsonArray;
	private DelDetails delJSONObject;
	private UdfDetails udfObject;
	private ExisitngLeadDetails exisitngLeadObj;
	private DynamicudDetails DynamicudfObj;
	private DeviationDetails deviationDetObj;
	private ExisitngLeadDetails extistProsjObj;
	private GuardianDetails guardianJSONObj;
	
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getDiffMode() {
		return diffMode;
	}
	public void setDiffMode(String diffMode) {
		this.diffMode = diffMode;
	}
	public InputDetails getInputDetJSONObject() {
		return inputDetJSONObject;
	}
	public void setInputDetJSONObject(InputDetails inputDetJSONObject) {
		this.inputDetJSONObject = inputDetJSONObject;
	}
	public List<DependantDetails> getDependantJSONArray() {
		return dependantJSONArray;
	}
	public void setDependantJSONArray(List<DependantDetails> dependantJSONArray) {
		this.dependantJSONArray = dependantJSONArray;
	}
	public List<AddressDetails> getAddressJSONArray() {
		return addressJSONArray;
	}
	public void setAddressJSONArray(List<AddressDetails> addressJSONArray) {
		this.addressJSONArray = addressJSONArray;
	}
	public List<ContactDetails> getContactsJSONArray() {
		return contactsJSONArray;
	}
	public void setContactsJSONArray(List<ContactDetails> contactsJSONArray) {
		this.contactsJSONArray = contactsJSONArray;
	}
	public List<IdentificationDetails> getIdentificationDetJsonArr() {
		return identificationDetJsonArr;
	}
	public void setIdentificationDetJsonArr(List<IdentificationDetails> identificationDetJsonArr) {
		this.identificationDetJsonArr = identificationDetJsonArr;
	}
	public List<DocDetails> getDocDetJSONArray() {
		return docDetJSONArray;
	}
	public void setDocDetJSONArray(List<DocDetails> docDetJSONArray) {
		this.docDetJSONArray = docDetJSONArray;
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
	public UdfDetails getUdfObject() {
		return udfObject;
	}
	public void setUdfObject(UdfDetails udfObject) {
		this.udfObject = udfObject;
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
	public DeviationDetails getDeviationDetObj() {
		return deviationDetObj;
	}
	public void setDeviationDetObj(DeviationDetails deviationDetObj) {
		this.deviationDetObj = deviationDetObj;
	}
	public ExisitngLeadDetails getExtistProsjObj() {
		return extistProsjObj;
	}
	public void setExtistProsjObj(ExisitngLeadDetails extistProsjObj) {
		this.extistProsjObj = extistProsjObj;
	}
	public GuardianDetails getGuardianJSONObj() {
		return guardianJSONObj;
	}
	public void setGuardianJSONObj(GuardianDetails guardianJSONObj) {
		this.guardianJSONObj = guardianJSONObj;
	}
	public void setClientPrefObj(ClientPrefDetails clientPrefObj) {
		this.clientPrefObj = clientPrefObj;
	}
	public ClientPrefDetails getClientPrefObj() {
		return clientPrefObj;
	}
	public DelDetails getDelJSONObject() {
		return delJSONObject;
	}
	public void setDelJSONObject(DelDetails delJSONObject) {
		this.delJSONObject = delJSONObject;
	}
	public List<LisenceDetails> getLisencejsonArray() {
		return lisencejsonArray;
	}
	public void setLisencejsonArray(List<LisenceDetails> lisencejsonArray) {
		this.lisencejsonArray = lisencejsonArray;
	}
	
}
