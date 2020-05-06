package com.intellect.api.pojo.risk;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.ALWAYS)
public class QuestionAnsRequest {
	private List<QuestionAns> questionAns;
	private List<String> questInfo;
	private List<String> newQuesVersion;
	private List<String> uploadDocs;
	private String reqFrom;
	private String riskChangeFlag;
	private String riskSeq;
	private String quesCode;
	private String newRiskProfile;
	private String branchCode;
	private String vulnerabilityReason;
	private String vulnerabilityFlag;
	private String rangeScore;
	
	public List<QuestionAns> getQuestionAns() {
		return questionAns;
	}
	public void setQuestionAns(List<QuestionAns> questionAns) {
		this.questionAns = questionAns;
	}
	public List<String> getQuestInfo() {
		return questInfo;
	}
	public void setQuestInfo(List<String> questInfo) {
		this.questInfo = questInfo;
	}
	public List<String> getNewQuesVersion() {
		return newQuesVersion;
	}
	public void setNewQuesVersion(List<String> newQuesVersion) {
		this.newQuesVersion = newQuesVersion;
	}
	public List<String> getUploadDocs() {
		return uploadDocs;
	}
	public void setUploadDocs(List<String> uploadDocs) {
		this.uploadDocs = uploadDocs;
	}
	public String getReqFrom() {
		return reqFrom;
	}
	public void setReqFrom(String reqFrom) {
		this.reqFrom = reqFrom;
	}
	public String getRiskChangeFlag() {
		return riskChangeFlag;
	}
	public void setRiskChangeFlag(String riskChangeFlag) {
		this.riskChangeFlag = riskChangeFlag;
	}
	public String getRiskSeq() {
		return riskSeq;
	}
	public void setRiskSeq(String riskSeq) {
		this.riskSeq = riskSeq;
	}
	public String getQuesCode() {
		return quesCode;
	}
	public void setQuesCode(String quesCode) {
		this.quesCode = quesCode;
	}
	public String getNewRiskProfile() {
		return newRiskProfile;
	}
	public void setNewRiskProfile(String newRiskProfile) {
		this.newRiskProfile = newRiskProfile;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getVulnerabilityReason() {
		return vulnerabilityReason;
	}
	public void setVulnerabilityReason(String vulnerabilityReason) {
		this.vulnerabilityReason = vulnerabilityReason;
	}
	public String getVulnerabilityFlag() {
		return vulnerabilityFlag;
	}
	public void setVulnerabilityFlag(String vulnerabilityFlag) {
		this.vulnerabilityFlag = vulnerabilityFlag;
	}
	public String getRangeScore() {
		return rangeScore;
	}
	public void setRangeScore(String rangeScore) {
		this.rangeScore = rangeScore;
	}
}
