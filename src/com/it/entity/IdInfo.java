package com.it.entity;

/**
 * ��minID��maxID֮���userid�����ж�
 * 
 * @author SJF18
 * 
 */
public class IdInfo {

	private int minID;
	private int maxID;

	public IdInfo() {
		super();
	}

	public IdInfo(int minID, int maxID) {
		super();
		this.minID = minID;
		this.maxID = maxID;
	}

	public int getMinID() {
		return minID;
	}

	public void setMinID(int minID) {
		this.minID = minID;
	}

	public int getMaxID() {
		return maxID;
	}

	public void setMaxID(int maxID) {
		this.maxID = maxID;
	}

}
