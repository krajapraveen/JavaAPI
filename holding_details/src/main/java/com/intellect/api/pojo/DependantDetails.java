package com.intellect.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class DependantDetails {

	private String title;
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateOfBirth;
	private Integer age;
	private String relation;
	private String sequenceId;
	private String existingCifId;
	private String dependentFlag;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getRelation() {
		return relation;
	}
	public void setRelation(String relation) {
		this.relation = relation;
	}
	public String getSequenceId() {
		return sequenceId;
	}
	public void setSequenceId(String sequenceId) {
		this.sequenceId = sequenceId;
	}
	public String getExistingCifId() {
		return existingCifId;
	}
	public void setExistingCifId(String existingCifId) {
		this.existingCifId = existingCifId;
	}
	public String getDependentFlag() {
		return dependentFlag;
	}
	public void setDependentFlag(String dependentFlag) {
		this.dependentFlag = dependentFlag;
	}
	
	
}
