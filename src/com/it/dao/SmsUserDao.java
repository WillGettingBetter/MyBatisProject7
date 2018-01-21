package com.it.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.it.entity.QueryInfo;
import com.it.entity.SmsUser;

public interface SmsUserDao {

	// 1、通过id查询用户信息
	public SmsUser getUserInfo(int userid);
	
	//1.1通过userid，username获取用户信息
	public SmsUser getUser1(int userid,String username);

	// 2、获取所有用户信息
	public List<SmsUser> getAllUser();

	// 3、向数据库中插入用户
	public int insertUser(SmsUser smsUser);

	// 4、删除数据库中用户信息
	public int deleteUser(int userid);

	// 5、通过smsUser来修改数据库中的用户信息
	public int updateUser(SmsUser smsUser);

	// 5、通过注解的方法来修改数据库中的用户信息
	public int updateUser1(@Param("username") String username,
			@Param("usersex") String usersex, @Param("userid") int userid);
	
	//6、模糊查询，通过部分字符串对应数据库中的用户名，找到用户信息
	public List<SmsUser> findUser(String username);
	
	//7、查询userid在A-B之间，username包含name字符串的User信息
	public List<SmsUser> findUserByCond(QueryInfo queryInfo);
	
	//8、通过username来查找用户信息，返回值时HashMap
	public HashMap<String,Object> getUserByMap(String username);

}
