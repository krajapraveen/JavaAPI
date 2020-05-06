package com.intellect.api.pojo.risk;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class QuestionAns {
	private String ansCeiling;
	private String ansCeilingFlag;
	private String ceilingValue;
	private String scoringFlag;
	private String quesCode;
	private String vulnerable;
	private String computationType;
	private String multiSelectFlag;
	private String scoringType;
	private String weight;
	
	public String getAnsCeiling() {
		return ansCeiling;
	}
	public void setAnsCeiling(String ansCeiling) {
		this.ansCeiling = ansCeiling;
	}
	public String getAnsCeilingFlag() {
		return ansCeilingFlag;
	}
	public void setAnsCeilingFlag(String ansCeilingFlag) {
		this.ansCeilingFlag = ansCeilingFlag;
	}
	public String getCeilingValue() {
		return ceilingValue;
	}
	public void setCeilingValue(String ceilingValue) {
		this.ceilingValue = ceilingValue;
	}
	public String getScoringFlag() {
		return scoringFlag;
	}
	public void setScoringFlag(String scoringFlag) {
		this.scoringFlag = scoringFlag;
	}
	public String getQuesCode() {
		return quesCode;
	}
	public void setQuesCode(String quesCode) {
		this.quesCode = quesCode;
	}
	public String getVulnerable() {
		return vulnerable;
	}
	public void setVulnerable(String vulnerable) {
		this.vulnerable = vulnerable;
	}
	public String getComputationType() {
		return computationType;
	}
	public void setComputationType(String computationType) {
		this.computationType = computationType;
	}
	public String getMultiSelectFlag() {
		return multiSelectFlag;
	}
	public void setMultiSelectFlag(String multiSelectFlag) {
		this.multiSelectFlag = multiSelectFlag;
	}
	public String getScoringType() {
		return scoringType;
	}
	public void setScoringType(String scoringType) {
		this.scoringType = scoringType;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
}
