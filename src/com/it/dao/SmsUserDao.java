package com.it.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.it.entity.QueryInfo;
import com.it.entity.SmsUser;

public interface SmsUserDao {

	// 1��ͨ��id��ѯ�û���Ϣ
	public SmsUser getUserInfo(int userid);
	
	//1.1ͨ��userid��username��ȡ�û���Ϣ
	public SmsUser getUser1(int userid,String username);

	// 2����ȡ�����û���Ϣ
	public List<SmsUser> getAllUser();

	// 3�������ݿ��в����û�
	public int insertUser(SmsUser smsUser);

	// 4��ɾ�����ݿ����û���Ϣ
	public int deleteUser(int userid);

	// 5��ͨ��smsUser���޸����ݿ��е��û���Ϣ
	public int updateUser(SmsUser smsUser);

	// 5��ͨ��ע��ķ������޸����ݿ��е��û���Ϣ
	public int updateUser1(@Param("username") String username,
			@Param("usersex") String usersex, @Param("userid") int userid);
	
	//6��ģ����ѯ��ͨ�������ַ�����Ӧ���ݿ��е��û������ҵ��û���Ϣ
	public List<SmsUser> findUser(String username);
	
	//7����ѯuserid��A-B֮�䣬username����name�ַ�����User��Ϣ
	public List<SmsUser> findUserByCond(QueryInfo queryInfo);
	
	//8��ͨ��username�������û���Ϣ������ֵʱHashMap
	public HashMap<String,Object> getUserByMap(String username);

}
