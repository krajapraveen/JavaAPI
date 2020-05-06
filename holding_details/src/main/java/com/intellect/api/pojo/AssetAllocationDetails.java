package com.intellect.api.pojo;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class AssetAllocationDetails {
	private List<?> listValues = new ArrayList<>(3);
	private List<Asset> asset;
	
	
	public List<Asset> getAsset() {
		return asset;
	}
	public void setAsset(List<Asset> asset) {
		this.asset = asset;
	}
	public List<?> getListValues() {
		return listValues;
	}
	public void setListValues(List<?> listValues) {
		this.listValues = listValues;
	
	}
}
