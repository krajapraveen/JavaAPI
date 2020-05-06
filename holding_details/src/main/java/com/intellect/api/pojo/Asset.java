package com.intellect.api.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class Asset {
	private String assetPer;
	private String assetName;
	private String assetRetPer;
	private String color;
	private String assetStDev;
	private String assetGrpCd;
	
	public String getAssetPer() {
		return assetPer;
	}
	public void setAssetPer(String assetPer) {
		this.assetPer = assetPer;
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getAssetRetPer() {
		return assetRetPer;
	}
	public void setAssetRetPer(String assetRetPer) {
		this.assetRetPer = assetRetPer;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getAssetStDev() {
		return assetStDev;
	}
	public void setAssetStDev(String assetStDev) {
		this.assetStDev = assetStDev;
	}
	public String getAssetGrpCd() {
		return assetGrpCd;
	}
	public void setAssetGrpCd(String assetGrpCd) {
		this.assetGrpCd = assetGrpCd;
	}
}
