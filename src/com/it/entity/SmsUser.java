package com.it.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 用户实体类，对应Oracle数据库中的sms_user表
 * 
 * @author SJF18
 * 
 */
public class SmsUser {

	// 实体类的属性和表的字段名称一一对应
	private int userid;
	private String username;
	private String userpsw;
	private String usersex;
	private String usertel;
	private Date userbirth;

	public SmsUser() {
		super();
	}

	public SmsUser(int userid, String username, String userpsw, String usersex,
			String usertel, Date userbirth) {
		super();
		this.userid = userid;
		this.username = username;
		this.userpsw = userpsw;
		this.usersex = usersex;
		this.usertel = usertel;
		this.userbirth = userbirth;
	}

	// 添加toString方法
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return "SmsUser [userid=" + userid + ", username=" + username
				+ ", userpsw=" + userpsw + ", usersex=" + usersex
				+ ", usertel=" + usertel + ", userbirth="
				+ sdf.format(userbirth) + "]";
	}

	// 对属性进行封装
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

	public String getUserpsw() {
		return userpsw;
	}

	public void setUserpsw(String userpsw) {
		this.userpsw = userpsw;
	}

	public String getUsersex() {
		return usersex;
	}

	public void setUsersex(String usersex) {
		this.usersex = usersex;
	}

	public String getUsertel() {
		return usertel;
	}

	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}

	public Date getUserbirth() {
		return userbirth;
	}

	public void setUserbirth(Date userbirth) {
		this.userbirth = userbirth;
	}

}
