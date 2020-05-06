package com.intellect.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.ALWAYS)
public class InputDetails {
	private String sal;
	private String first_name;
	private String dob;
	private String local_name;
	private String rmName;
	private String subBrCode;
	private String refUnit;
	private String service_rm1;
	private String srcType;
	private String srcId;
	private String existingLead;
	private String uniqueId;
	private String gender;
	private String maritalStatus;
	private String vip;
	private String prClass;
	private String riskprofile;
	private String riskprofilescore;
	private String riskprofscoreaftdev;
	private String polExposed;
	private String noj;
	private String trv;
	private String trvCurr;
	private String income;
	private String desig;
	private String occStat;
	private String empType;
	private String empName;
	private String nationality;
	private String birthCntry;
	private String us_person;
	private String othPlBirth;
	private String domicile;
	private String residentStatus;
	private String vulnerable_flag;
	private String rpComm;
	private String status1;
	private String lastcontact;
	private String lastUpdate;
	private String userId;
	private String businessDate;
	private String br_cd;
	private String category;
	private String cust_no;
	private String sub_br_cd;
	private String middle_name;
	private String last_name;
	private String stat;
	private String panNo;
	private String kinName;
	private String kinPh;
	private String cCodePhoneNo;
	private String aCodePhoneNo;
	private String extNo;
	private String typeofBus;
	private String overrideReason;
	private String sdnOverrideReason;
	private String isMinor;
	private String lifeStyleSeqId;
	private String otherRefId;
	private String version;
	private String totAsset;
	private String totLiab;
	private String aml;
	private String suffix;
	private String zone;
	private String campid;
	private String leadCreateDate;
	private String leadExpireDate;
	private String aumCumLstDate;
	private String leadSource;
	private String subStat;
	private String custRespUpdate;
	private String remarks;
	private String locale;
	private String prefMemID;
	private String prospectCat;
	private String branchCd;
	private String reqFrom;
	private String hobValues;
	private String cliValues;
	private String entValues;
	private String favFoodValues;
	private String cusValues;
	private String fesValues;
	private String langValues;
	public String getSal() {
		return sal;
	}
	public void setSal(String sal) {
		this.sal = sal;
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
	public String getLocal_name() {
		return local_name;
	}
	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}
	public String getRmName() {
		return rmName;
	}
	public void setRmName(String rmName) {
		this.rmName = rmName;
	}
	public String getSubBrCode() {
		return subBrCode;
	}
	public void setSubBrCode(String subBrCode) {
		this.subBrCode = subBrCode;
	}
	public String getRefUnit() {
		return refUnit;
	}
	public void setRefUnit(String refUnit) {
		this.refUnit = refUnit;
	}
	public String getService_rm1() {
		return service_rm1;
	}
	public void setService_rm1(String service_rm1) {
		this.service_rm1 = service_rm1;
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
	@JsonProperty(value="")
	public void setSrcId(String srcId) {
		this.srcId = srcId;
	}
	public String getExistingLead() {
		return existingLead;
	}
	public void setExistingLead(String existingLead) {
		this.existingLead = existingLead;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
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
	public String getVip() {
		return vip;
	}
	public void setVip(String vip) {
		this.vip = vip;
	}
	public String getPrClass() {
		return prClass;
	}
	public void setPrClass(String prClass) {
		this.prClass = prClass;
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
	public String getNoj() {
		return noj;
	}
	public void setNoj(String noj) {
		this.noj = noj;
	}
	public String getTrv() {
		return trv;
	}
	public void setTrv(String trv) {
		this.trv = trv;
	}
	public String getTrvCurr() {
		return trvCurr;
	}
	public void setTrvCurr(String trvCurr) {
		this.trvCurr = trvCurr;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public String getOccStat() {
		return occStat;
	}
	public void setOccStat(String occStat) {
		this.occStat = occStat;
	}
	public String getEmpType() {
		return empType;
	}
	public void setEmpType(String empType) {
		this.empType = empType;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
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
	public String getUs_person() {
		return us_person;
	}
	public void setUs_person(String us_person) {
		this.us_person = us_person;
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
	public String getVulnerable_flag() {
		return vulnerable_flag;
	}
	public void setVulnerable_flag(String vulnerable_flag) {
		this.vulnerable_flag = vulnerable_flag;
	}
	public String getRpComm() {
		return rpComm;
	}
	public void setRpComm(String rpComm) {
		this.rpComm = rpComm;
	}
	public String getStatus1() {
		return status1;
	}
	public void setStatus1(String status1) {
		this.status1 = status1;
	}
	public String getLastcontact() {
		return lastcontact;
	}
	public void setLastcontact(String lastcontact) {
		this.lastcontact = lastcontact;
	}
	public String getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
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
	public String getProspectCat() {
		return prospectCat;
	}
	public void setProspectCat(String prospectCat) {
		this.prospectCat = prospectCat;
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
