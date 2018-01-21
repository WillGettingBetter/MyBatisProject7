package com.it.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBUtil {
	
	public SqlSession getSession(){
		//���������ļ�
		String resource="mybatis-config.xml";
		InputStream is=null;
		try {
			is=Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//�����Ự����
		SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);
		//�����Ự
		return sqlSessionFactory.openSession();
	}
}
