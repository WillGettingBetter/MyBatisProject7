package com.it.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import com.it.dao.SmsUserDao;
import com.it.entity.IdInfo;
import com.it.entity.NameInfo;
import com.it.entity.QueryInfo;
import com.it.entity.SmsUser;
import com.it.util.DBUtil;

public class Test {

	// 1、通过id查询相应地用户信息
	public void getUserInfo() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// 得到mapper接口的代理对象
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		SmsUser user = dao.getUserInfo(1001);
		System.out.println(user);
	}

	// 2、获取所有用户信息
	public void getAllUser() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// 得到mapper接口的代理对象
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		List<SmsUser> list = dao.getAllUser();
		for (SmsUser smsUser : list) {
			System.out.println(smsUser);
		}
	}

	// 3、向数据库中插入用户信息
	public void insertUser() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// 得到mapper接口的代理对象
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SmsUser user = null;
		try {
			user = new SmsUser(-1, "林志颖", "123456", "男", "18355096124",
					sdf.parse("1990-09-12"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int temp = dao.insertUser(user);
		System.out.println("插入用户成功+++" + temp);
		// 提交事务
		session.commit();
		// 关闭会话
		session.close();
	}

	// 4、通过userid删除用户信息
	public void deleteUser() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// 得到mapper接口的代理对象
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		int temp = dao.deleteUser(188140);
		System.out.println("删除用户成功+++" + temp);
		// 提交事务
		session.commit();
		// 关闭会话
		session.close();
	}

	// 5、通过smsuser来修改数据库中的用户信息
	public void updateUser() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// 得到mapper接口的代理对象
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		SmsUser user = new SmsUser(188132, "吴双", null, "女", null, null);
		int temp = dao.updateUser(user);
		System.out.println("修改用户成功+++" + temp);
		// 提交事务
		session.commit();
		// 关闭会话
		session.close();
	}

	// 6、通过userid，username，usersex对用户进行信息修改
	public void updateUser1() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// 得到mapper接口的代理对象
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		int temp = dao.updateUser1("征战世界", "女", 188135);
		System.out.println("修改用户信息成功~~~" + temp);
		// 提交事务
		session.commit();
		// 关闭会话
		session.close();
	}

	// 通过userid和username查询用户信息
	public void getUser1() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// 得到mapper接口的代理对象
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		SmsUser user = dao.getUser1(188131, "王小姗");
		System.out.println("查找用户成功~~~~" + user);
		session.close();
	}

	// 模糊查询
	public void findUser() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// 得到mapper接口的代理对象
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		List<SmsUser> list = dao.findUser("娟");
		for (SmsUser smsUser : list) {
			System.out.println(smsUser);
		}
		// 关闭会话
		session.close();
	}

	// 查询userid在A-B之间，username包含name字符串的User信息
	public void findUserByCond() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// 得到mapper接口的代理对象
		SmsUserDao dao = session.getMapper(SmsUserDao.class);

		IdInfo idInfo = new IdInfo(188136, 188139);
		NameInfo nameInfo = new NameInfo("娟");
		QueryInfo queryInfo = new QueryInfo(idInfo, nameInfo);
		List<SmsUser> list = dao.findUserByCond(queryInfo);
		for (SmsUser smsUser : list) {
			System.out.println(smsUser);
		}
		// 关闭会话
		session.close();
	}

	public void getUserByName() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// 得到mapper接口的代理对象
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		HashMap<String, Object> map = dao.getUserByMap("杨幂");
		Set<String> keySet = map.keySet();
		/*
		 * for (String key : keySet) { System.out.println(key + "::" +
		 * map.get(key)); }
		 */
		// 迭代器
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + "::" + map.get(key));
		}
		// 关闭会话
		session.close();
	}

	public static void main(String[] args) {
		Test test = new Test();
		// 1、通过id查询相对应的用户信息
		// test.getUserInfo();

		// 2、得到所有用户信息
		// test.getAllUser();

		// 3、向数据库中插入用户信息学
		// test.insertUser();

		// 4、删除数据库中的用户
		// test.deleteUser();

		// 5、修改用户信息
		// test.updateUser();

		// 6、通过userid，username，usersex对用户进行信息修改
		// test.updateUser1();

		// 7、通过userid，username查找用户信息
		// test.getUser1();

		// 8、模糊查询
		// test.findUser();

		// 9、查询userid在A-B之间，username包含name字符串的User信息
		// test.findUserByCond();

		//通过
		test.getUserByName();

	}

}
