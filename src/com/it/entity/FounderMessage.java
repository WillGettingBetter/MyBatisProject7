package com.it.entity;

import java.util.Date;

/**
 * 实体类，使用protected修饰属性，是为了方便子类继承
 * 
 * @author SJF18
 * 
 */
public class FounderMessage {

	private int messageid;
	private int userid;
	private String username;
	private int fildid;
	private String messagecontent;
	private Date messagedate;
	private FounderFile founderFile;

	@Override
	public String toString() {
		return "FounderMessage [messageid=" + messageid + ", userid=" + userid
				+ ", username=" + username + ", fildid=" + fildid
				+ ", messagecontent=" + messagecontent + ", messagedate="
				+ messagedate + ", founderFile=" + founderFile + "]";
	}

	public int getMessageid() {
		return messageid;
	}

	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getFildid() {
		return fildid;
	}

	public void setFildid(int fildid) {
		this.fildid = fildid;
	}

	public String getMessagecontent() {
		return messagecontent;
	}

	public void setMessagecontent(String messagecontent) {
		this.messagecontent = messagecontent;
	}

	public Date getMessagedate() {
		return messagedate;
	}

	public void setMessagedate(Date messagedate) {
		this.messagedate = messagedate;
	}

	public FounderFile getFounderFile() {
		return founderFile;
	}

	public void setFounderFile(FounderFile founderFile) {
		this.founderFile = founderFile;
	}

}
