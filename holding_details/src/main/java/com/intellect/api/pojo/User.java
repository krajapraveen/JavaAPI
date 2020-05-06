package com.intellect.api.pojo;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.beans.factory.annotation.Value;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiModelProperty.AccessMode;

public class User {

	@Min(2)
	@Positive
	private int id;
	@NotEmpty(message = "should not be null or empty")	//throws error while deserializing/serializing if empty	
	@NotNull
	private String country;
	@NotEmpty(message = "should not be null or empty")
	@NotNull
	@JsonProperty(value="sandeep_name")	//while deserializing and serializing
	private String name;
	//@JsonIgnore
	private String dept;

	public User(){
		id=0;
	}
	public User(int id, String name, String country){
		this.id = id;
		this.name = name;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@ApiModelProperty(value = "name of person", allowableValues = "name1,name2", required=true)  //just for description not logical
	//@JsonProperty("sandeep_reddy")   //while serializing
	public String getName() {
		return name;		//set default value while serializing
	}
	//@JsonProperty("pakanaty_reddy")    //while deserializing
	public void setName(String name) {
		this.name = name;		//set non modifiable value while deserializing
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	//@ApiModelProperty(value = "dept name readonly",accessMode = ApiModelProperty.AccessMode.READ_ONLY)
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
