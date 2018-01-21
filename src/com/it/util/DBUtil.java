package com.it.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBUtil {
	
	public SqlSession getSession(){
		//加载配置文件
		String resource="mybatis-config.xml";
		InputStream is=null;
		try {
			is=Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//创建会话工厂
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
		//建立会话
		return sqlSessionFactory.openSession();
	}
}
