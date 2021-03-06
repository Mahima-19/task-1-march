package com.example.retrofitdemo.domain;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class EmployeeResponse {

	@SerializedName("data")
	private List<DataItem> data;

	@SerializedName("status")
	private String status;

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"EmployeeResponse{" +
			"data = '" + data + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}