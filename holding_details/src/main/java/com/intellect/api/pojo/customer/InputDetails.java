package com.intellect.api.pojo.customer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class InputDetails {
	private String  salutn;
	private String     first_name;
	private String     dob;
	private String     shortName;
	private String     rmID;
	private String     subBrCd;
	private String     refUnit;
	private String     csmUserId;
	private String     srcType;
	private String     srcId;
	private String     prospectId;
	private String     relationCustNo;
	private String     gender;
	private String     maritalStatus;
	private String     ecraf;
	private String     clientType;
	private String     riskprofile;
	private String     riskprofilescore;
	private String     riskprofscoreaftdev;
	private String     polExposed;
	private String     natureOfJob;
	private String     sourceOfFunds;
	private String     cifRefCcy;
	private String     annualSal;
	private String     designation;
	private String     typeOfBsnz;
	private String     empType;
	private String     nameOfEmporBsnz;
	private String     nationality;
	private String     birthCntry;
	private String     usPerson;
	private String     othPlBirth;
	private String     domicile;
	private String     residentStatus;
	private String     nameUnitEmp;
	private String     relToEmp;
	private String     status1;
	private String     lastUpdate;
	private String     lastcontact;
	private String     userId;
	private String     businessDate;
	private String     br_cd;
	private String     category;
	private String     cust_no;
	private String     sub_br_cd;
	private String     middle_name;
	private String     last_name;
	private String     stat;
	private String     panNo;
	private String     kinName;
	private String     kinPh;
	private String     cCodePhoneNo;
	private String     aCodePhoneNo;
	private String     extNo;
	private String     typeofBus;
	private String     overrideReason;
	private String     sdnOverrideReason;
	private String     CIFNUMBER;
	private String     branchCode;
	private String     oprMode;
	private String     isMinor;
	private String     lifeStyleSeqId;
	private String     otherRefId;
	private String     version;
	private String     totAsset;
	private String     totLiab;
	private String     aml;
	private String     suffix;
	private String     zone;
	private String     campid;
	private String     leadCreateDate;
	private String     leadExpireDate;
	private String     aumCumLstDate;
	private String     leadSource;
	private String     subStat;
	private String     custRespUpdate;
	private String     remarks;
	private String     locale;
	private String     prefMemID;
	private String     CIFCat;
	private String     cifCategory;
	private String     branchCd;
	private String     reqFrom;
	private String     customerOpenDate;
	private String     staffFlag;
	private String     idNo;
	private String     idType;
	private String     isRMExistsFlag;
	private String     jointCust;
	private String     nxtRevDate;
	private String     UID;
	private String     hnw_status;
	private String     isMap;
	private String     lstRvDt;
	private String     hobValues;
	private String     cliValues;
	private String     entValues;
	private String     favFoodValues;
	private String     cusValues;
	private String     fesValues;
	private String     langValues;
	
	public String getSalutn() {
		return salutn;
	}
	public void setSalutn(String salutn) {
		this.salutn = salutn;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getRmID() {
		return rmID;
	}
	public void setRmID(String rmID) {
		this.rmID = rmID;
	}
	public String getSubBrCd() {
		return subBrCd;
	}
	public void setSubBrCd(String subBrCd) {
		this.subBrCd = subBrCd;
	}
	public String getRefUnit() {
		return refUnit;
	}
	public void setRefUnit(String refUnit) {
		this.refUnit = refUnit;
	}
	public String getCsmUserId() {
		return csmUserId;
	}
	public void setCsmUserId(String csmUserId) {
		this.csmUserId = csmUserId;
	}
	public String getSrcType() {
		return srcType;
	}
	public void setSrcType(String srcType) {
		this.srcType = srcType;
	}
	public String getSrcId() {
		return srcId;
	}
	public void setSrcId(String srcId) {
		this.srcId = srcId;
	}
	public String getProspectId() {
		return prospectId;
	}
	public void setProspectId(String prospectId) {
		this.prospectId = prospectId;
	}
	public String getRelationCustNo() {
		return relationCustNo;
	}
	public void setRelationCustNo(String relationCustNo) {
		this.relationCustNo = relationCustNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getEcraf() {
		return ecraf;
	}
	public void setEcraf(String ecraf) {
		this.ecraf = ecraf;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public String getRiskprofile() {
		return riskprofile;
	}
	public void setRiskprofile(String riskprofile) {
		this.riskprofile = riskprofile;
	}
	public String getRiskprofilescore() {
		return riskprofilescore;
	}
	public void setRiskprofilescore(String riskprofilescore) {
		this.riskprofilescore = riskprofilescore;
	}
	public String getRiskprofscoreaftdev() {
		return riskprofscoreaftdev;
	}
	public void setRiskprofscoreaftdev(String riskprofscoreaftdev) {
		this.riskprofscoreaftdev = riskprofscoreaftdev;
	}
	public String getPolExposed() {
		return polExposed;
	}
	public void setPolExposed(String polExposed) {
		this.polExposed = polExposed;
	}
	public String getNatureOfJob() {
		return natureOfJob;
	}
	public void setNatureOfJob(String natureOfJob) {
		this.natureOfJob = natureOfJob;
	}
	public String getSourceOfFunds() {
		return sourceOfFunds;
	}
	public void setSourceOfFunds(String sourceOfFunds) {
		this.sourceOfFunds = sourceOfFunds;
	}
	public String getCifRefCcy() {
		return cifRefCcy;
	}
	public void setCifRefCcy(String cifRefCcy) {
		this.cifRefCcy = cifRefCcy;
	}
	public String getAnnualSal() {
		return annualSal;
	}
	public void setAnnualSal(String annualSal) {
		this.annualSal = annualSal;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getTypeOfBsnz() {
		return typeOfBsnz;
	}
	public void setTypeOfBsnz(String typeOfBsnz) {
		this.typeOfBsnz = typeOfBsnz;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getNameOfEmporBsnz() {
		return nameOfEmporBsnz;
	}
	public void setNameOfEmporBsnz(String nameOfEmporBsnz) {
		this.nameOfEmporBsnz = nameOfEmporBsnz;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getBirthCntry() {
		return birthCntry;
	}
	public void setBirthCntry(String birthCntry) {
		this.birthCntry = birthCntry;
	}
	public String getUsPerson() {
		return usPerson;
	}
	public void setUsPerson(String usPerson) {
		this.usPerson = usPerson;
	}
	public String getOthPlBirth() {
		return othPlBirth;
	}
	public void setOthPlBirth(String othPlBirth) {
		this.othPlBirth = othPlBirth;
	}
	public String getDomicile() {
		return domicile;
	}
	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}
	public String getResidentStatus() {
		return residentStatus;
	}
	public void setResidentStatus(String residentStatus) {
		this.residentStatus = residentStatus;
	}
	public String getNameUnitEmp() {
		return nameUnitEmp;
	}
	public void setNameUnitEmp(String nameUnitEmp) {
		this.nameUnitEmp = nameUnitEmp;
	}
	public String getRelToEmp() {
		return relToEmp;
	}
	public void setRelToEmp(String relToEmp) {
		this.relToEmp = relToEmp;
	}
	public String getStatus1() {
		return status1;
	}
	public void setStatus1(String status1) {
		this.status1 = status1;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getLastcontact() {
		return lastcontact;
	}
	public void setLastcontact(String lastcontact) {
		this.lastcontact = lastcontact;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getBusinessDate() {
		return businessDate;
	}
	public void setBusinessDate(String businessDate) {
		this.businessDate = businessDate;
	}
	public String getBr_cd() {
		return br_cd;
	}
	public void setBr_cd(String br_cd) {
		this.br_cd = br_cd;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCust_no() {
		return cust_no;
	}
	public void setCust_no(String cust_no) {
		this.cust_no = cust_no;
	}
	public String getSub_br_cd() {
		return sub_br_cd;
	}
	public void setSub_br_cd(String sub_br_cd) {
		this.sub_br_cd = sub_br_cd;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getKinName() {
		return kinName;
	}
	public void setKinName(String kinName) {
		this.kinName = kinName;
	}
	public String getKinPh() {
		return kinPh;
	}
	public void setKinPh(String kinPh) {
		this.kinPh = kinPh;
	}
	public String getcCodePhoneNo() {
		return cCodePhoneNo;
	}
	public void setcCodePhoneNo(String cCodePhoneNo) {
		this.cCodePhoneNo = cCodePhoneNo;
	}
	public String getaCodePhoneNo() {
		return aCodePhoneNo;
	}
	public void setaCodePhoneNo(String aCodePhoneNo) {
		this.aCodePhoneNo = aCodePhoneNo;
	}
	public String getExtNo() {
		return extNo;
	}
	public void setExtNo(String extNo) {
		this.extNo = extNo;
	}
	public String getTypeofBus() {
		return typeofBus;
	}
	public void setTypeofBus(String typeofBus) {
		this.typeofBus = typeofBus;
	}
	public String getOverrideReason() {
		return overrideReason;
	}
	public void setOverrideReason(String overrideReason) {
		this.overrideReason = overrideReason;
	}
	public String getSdnOverrideReason() {
		return sdnOverrideReason;
	}
	public void setSdnOverrideReason(String sdnOverrideReason) {
		this.sdnOverrideReason = sdnOverrideReason;
	}
	public String getCIFNUMBER() {
		return CIFNUMBER;
	}
	@JsonSetter("CIFNUMBER")
	public void setCIFNUMBER(String cIFNUMBER) {
		CIFNUMBER = cIFNUMBER;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getOprMode() {
		return oprMode;
	}
	public void setOprMode(String oprMode) {
		this.oprMode = oprMode;
	}
	public String getIsMinor() {
		return isMinor;
	}
	public void setIsMinor(String isMinor) {
		this.isMinor = isMinor;
	}
	public String getLifeStyleSeqId() {
		return lifeStyleSeqId;
	}
	public void setLifeStyleSeqId(String lifeStyleSeqId) {
		this.lifeStyleSeqId = lifeStyleSeqId;
	}
	public String getOtherRefId() {
		return otherRefId;
	}
	public void setOtherRefId(String otherRefId) {
		this.otherRefId = otherRefId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getTotAsset() {
		return totAsset;
	}
	public void setTotAsset(String totAsset) {
		this.totAsset = totAsset;
	}
	public String getTotLiab() {
		return totLiab;
	}
	public void setTotLiab(String totLiab) {
		this.totLiab = totLiab;
	}
	public String getAml() {
		return aml;
	}
	public void setAml(String aml) {
		this.aml = aml;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getCampid() {
		return campid;
	}
	public void setCampid(String campid) {
		this.campid = campid;
	}
	public String getLeadCreateDate() {
		return leadCreateDate;
	}
	public void setLeadCreateDate(String leadCreateDate) {
		this.leadCreateDate = leadCreateDate;
	}
	public String getLeadExpireDate() {
		return leadExpireDate;
	}
	public void setLeadExpireDate(String leadExpireDate) {
		this.leadExpireDate = leadExpireDate;
	}
	public String getAumCumLstDate() {
		return aumCumLstDate;
	}
	public void setAumCumLstDate(String aumCumLstDate) {
		this.aumCumLstDate = aumCumLstDate;
	}
	public String getLeadSource() {
		return leadSource;
	}
	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
	}
	public String getSubStat() {
		return subStat;
	}
	public void setSubStat(String subStat) {
		this.subStat = subStat;
	}
	public String getCustRespUpdate() {
		return custRespUpdate;
	}
	public void setCustRespUpdate(String custRespUpdate) {
		this.custRespUpdate = custRespUpdate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getPrefMemID() {
		return prefMemID;
	}
	public void setPrefMemID(String prefMemID) {
		this.prefMemID = prefMemID;
	}
	public String getCIFCat() {
		return CIFCat;
	}
	@JsonSetter("CIFCat")
	public void setCIFCat(String cIFCat) {
		CIFCat = cIFCat;
	}
	public String getCifCategory() {
		return cifCategory;
	}
	public void setCifCategory(String cifCategory) {
		this.cifCategory = cifCategory;
	}
	public String getBranchCd() {
		return branchCd;
	}
	public void setBranchCd(String branchCd) {
		this.branchCd = branchCd;
	}
	public String getReqFrom() {
		return reqFrom;
	}
	public void setReqFrom(String reqFrom) {
		this.reqFrom = reqFrom;
	}
	public String getCustomerOpenDate() {
		return customerOpenDate;
	}
	public void setCustomerOpenDate(String customerOpenDate) {
		this.customerOpenDate = customerOpenDate;
	}
	public String getStaffFlag() {
		return staffFlag;
	}
	public void setStaffFlag(String staffFlag) {
		this.staffFlag = staffFlag;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIsRMExistsFlag() {
		return isRMExistsFlag;
	}
	public void setIsRMExistsFlag(String isRMExistsFlag) {
		this.isRMExistsFlag = isRMExistsFlag;
	}
	public String getJointCust() {
		return jointCust;
	}
	public void setJointCust(String jointCust) {
		this.jointCust = jointCust;
	}
	public String getNxtRevDate() {
		return nxtRevDate;
	}
	public void setNxtRevDate(String nxtRevDate) {
		this.nxtRevDate = nxtRevDate;
	}
	public String getUID() {
		return UID;
	}
	@JsonSetter("UID")
	public void setUID(String uID) {
		UID = uID;
	}
	public String getHnw_status() {
		return hnw_status;
	}
	public void setHnw_status(String hnw_status) {
		this.hnw_status = hnw_status;
	}
	public String getIsMap() {
		return isMap;
	}
	public void setIsMap(String isMap) {
		this.isMap = isMap;
	}
	public String getLstRvDt() {
		return lstRvDt;
	}
	public void setLstRvDt(String lstRvDt) {
		this.lstRvDt = lstRvDt;
	}
	public String getHobValues() {
		return hobValues;
	}
	public void setHobValues(String hobValues) {
		this.hobValues = hobValues;
	}
	public String getCliValues() {
		return cliValues;
	}
	public void setCliValues(String cliValues) {
		this.cliValues = cliValues;
	}
	public String getEntValues() {
		return entValues;
	}
	public void setEntValues(String entValues) {
		this.entValues = entValues;
	}
	public String getFavFoodValues() {
		return favFoodValues;
	}
	public void setFavFoodValues(String favFoodValues) {
		this.favFoodValues = favFoodValues;
	}
	public String getCusValues() {
		return cusValues;
	}
	public void setCusValues(String cusValues) {
		this.cusValues = cusValues;
	}
	public String getFesValues() {
		return fesValues;
	}
	public void setFesValues(String fesValues) {
		this.fesValues = fesValues;
	}
	public String getLangValues() {
		return langValues;
	}
	public void setLangValues(String langValues) {
		this.langValues = langValues;
	}
}
