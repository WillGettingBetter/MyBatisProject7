package com.it.entity;

public class QueryInfo {

	private IdInfo idInfo;
	private NameInfo nameInfo;

	public QueryInfo() {
		super();
	}

	public QueryInfo(IdInfo idInfo, NameInfo nameInfo) {
		super();
		this.idInfo = idInfo;
		this.nameInfo = nameInfo;
	}

	public IdInfo getIdInfo() {
		return idInfo;
	}

	public void setIdInfo(IdInfo idInfo) {
		this.idInfo = idInfo;
	}

	public NameInfo getNameInfo() {
		return nameInfo;
	}

	public void setNameInfo(NameInfo nameInfo) {
		this.nameInfo = nameInfo;
	}

}
