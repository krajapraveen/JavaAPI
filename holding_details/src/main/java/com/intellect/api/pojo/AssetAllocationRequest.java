package com.intellect.api.pojo;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class AssetAllocationRequest {
	
	private List<AssetAllocationDetails> assetAllocDetail;
	private String deviatedRiskScore;
	private String  riskScore;
	private String  subBrCd;
	private String  quesCd;
	private String riskSeq;
	private String vulnerabilityFlag;
	private String vulnerabilityReason;
	

	public String getDeviatedRiskScore() {
		return deviatedRiskScore;
	}
	public void setDeviatedRiskScore(String deviatedRiskScore) {
		this.deviatedRiskScore = deviatedRiskScore;
	}
	public String getRiskScore() {
		return riskScore;
	}
	public void setRiskScore(String riskScore) {
		this.riskScore = riskScore;
	}
	public String getSubBrCd() {
		return subBrCd;
	}
	public void setSubBrCd(String subBrCd) {
		this.subBrCd = subBrCd;
	}
	public String getQuesCd() {
		return quesCd;
	}
	public void setQuesCd(String quesCd) {
		this.quesCd = quesCd;
	}
	public String getRiskSeq() {
		return riskSeq;
	}
	public void setRiskSeq(String riskSeq) {
		this.riskSeq = riskSeq;
	}
	public String getVulnerabilityFlag() {
		return vulnerabilityFlag;
	}
	public void setVulnerabilityFlag(String vulnerabilityFlag) {
		this.vulnerabilityFlag = vulnerabilityFlag;
	}
	public String getVulnerabilityReason() {
		return vulnerabilityReason;
	}
	public void setVulnerabilityReason(String vulnerabilityReason) {
		this.vulnerabilityReason = vulnerabilityReason;
	}
	public List<AssetAllocationDetails> getAssetAllocDetail() {
		return assetAllocDetail;
	}
	public void setAssetAllocDetail(List<AssetAllocationDetails> assetAllocDetail) {
		this.assetAllocDetail = assetAllocDetail;
	}

}
