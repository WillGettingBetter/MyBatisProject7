package com.it.entity;

import java.util.Date;
import java.util.List;

public class FounderUserMVSM {
	private int user_id;
	private String user_name;
	private String user_sex;
	private String user_tel;
	private Date user_birth;
	private String user_psw;
	private List<FounderMessage> msgList;

	@Override
	public String toString() {
		return "FounderUserMVSM [user_id=" + user_id + ", user_name="
				+ user_name + ", user_sex=" + user_sex + ", user_tel="
				+ user_tel + ", user_birth=" + user_birth + ", user_psw="
				+ user_psw + ", msgList=" + msgList + "]";
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	public String getUser_tel() {
		return user_tel;
	}

	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}

	public Date getUser_birth() {
		return user_birth;
	}

	public void setUser_birth(Date user_birth) {
		this.user_birth = user_birth;
	}

	public String getUser_psw() {
		return user_psw;
	}

	public void setUser_psw(String user_psw) {
		this.user_psw = user_psw;
	}

	public List<FounderMessage> getMsgList() {
		return msgList;
	}

	public void setMsgList(List<FounderMessage> msgList) {
		this.msgList = msgList;
	}

}
