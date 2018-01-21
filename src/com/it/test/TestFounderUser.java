package com.it.test;

import org.apache.ibatis.session.SqlSession;
import com.it.dao.FounderUserDao;
import com.it.entity.FounderUserMVSM;
import com.it.util.DBUtil;

public class TestFounderUser {

	public static void main(String[] args) {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// 获取mapper接口的代理对象
		FounderUserDao dao = session.getMapper(FounderUserDao.class);
		FounderUserMVSM fumm = dao.getUMF(1002);
		System.out.println(fumm);
		session.close();
	}

}
