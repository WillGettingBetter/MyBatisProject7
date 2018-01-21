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

	// 1��ͨ��id��ѯ��Ӧ���û���Ϣ
	public void getUserInfo() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// �õ�mapper�ӿڵĴ������
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		SmsUser user = dao.getUserInfo(1001);
		System.out.println(user);
	}

	// 2����ȡ�����û���Ϣ
	public void getAllUser() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// �õ�mapper�ӿڵĴ������
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		List<SmsUser> list = dao.getAllUser();
		for (SmsUser smsUser : list) {
			System.out.println(smsUser);
		}
	}

	// 3�������ݿ��в����û���Ϣ
	public void insertUser() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// �õ�mapper�ӿڵĴ������
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SmsUser user = null;
		try {
			user = new SmsUser(-1, "��־ӱ", "123456", "��", "18355096124",
					sdf.parse("1990-09-12"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int temp = dao.insertUser(user);
		System.out.println("�����û��ɹ�+++" + temp);
		// �ύ����
		session.commit();
		// �رջỰ
		session.close();
	}

	// 4��ͨ��useridɾ���û���Ϣ
	public void deleteUser() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// �õ�mapper�ӿڵĴ������
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		int temp = dao.deleteUser(188140);
		System.out.println("ɾ���û��ɹ�+++" + temp);
		// �ύ����
		session.commit();
		// �رջỰ
		session.close();
	}

	// 5��ͨ��smsuser���޸����ݿ��е��û���Ϣ
	public void updateUser() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// �õ�mapper�ӿڵĴ������
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		SmsUser user = new SmsUser(188132, "��˫", null, "Ů", null, null);
		int temp = dao.updateUser(user);
		System.out.println("�޸��û��ɹ�+++" + temp);
		// �ύ����
		session.commit();
		// �رջỰ
		session.close();
	}

	// 6��ͨ��userid��username��usersex���û�������Ϣ�޸�
	public void updateUser1() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// �õ�mapper�ӿڵĴ������
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		int temp = dao.updateUser1("��ս����", "Ů", 188135);
		System.out.println("�޸��û���Ϣ�ɹ�~~~" + temp);
		// �ύ����
		session.commit();
		// �رջỰ
		session.close();
	}

	// ͨ��userid��username��ѯ�û���Ϣ
	public void getUser1() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// �õ�mapper�ӿڵĴ������
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		SmsUser user = dao.getUser1(188131, "��С�");
		System.out.println("�����û��ɹ�~~~~" + user);
		session.close();
	}

	// ģ����ѯ
	public void findUser() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// �õ�mapper�ӿڵĴ������
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		List<SmsUser> list = dao.findUser("��");
		for (SmsUser smsUser : list) {
			System.out.println(smsUser);
		}
		// �رջỰ
		session.close();
	}

	// ��ѯuserid��A-B֮�䣬username����name�ַ�����User��Ϣ
	public void findUserByCond() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// �õ�mapper�ӿڵĴ������
		SmsUserDao dao = session.getMapper(SmsUserDao.class);

		IdInfo idInfo = new IdInfo(188136, 188139);
		NameInfo nameInfo = new NameInfo("��");
		QueryInfo queryInfo = new QueryInfo(idInfo, nameInfo);
		List<SmsUser> list = dao.findUserByCond(queryInfo);
		for (SmsUser smsUser : list) {
			System.out.println(smsUser);
		}
		// �رջỰ
		session.close();
	}

	public void getUserByName() {
		DBUtil dbUtil = new DBUtil();
		SqlSession session = dbUtil.getSession();
		// �õ�mapper�ӿڵĴ������
		SmsUserDao dao = session.getMapper(SmsUserDao.class);
		HashMap<String, Object> map = dao.getUserByMap("����");
		Set<String> keySet = map.keySet();
		/*
		 * for (String key : keySet) { System.out.println(key + "::" +
		 * map.get(key)); }
		 */
		// ������
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + "::" + map.get(key));
		}
		// �رջỰ
		session.close();
	}

	public static void main(String[] args) {
		Test test = new Test();
		// 1��ͨ��id��ѯ���Ӧ���û���Ϣ
		// test.getUserInfo();

		// 2���õ������û���Ϣ
		// test.getAllUser();

		// 3�������ݿ��в����û���Ϣѧ
		// test.insertUser();

		// 4��ɾ�����ݿ��е��û�
		// test.deleteUser();

		// 5���޸��û���Ϣ
		// test.updateUser();

		// 6��ͨ��userid��username��usersex���û�������Ϣ�޸�
		// test.updateUser1();

		// 7��ͨ��userid��username�����û���Ϣ
		// test.getUser1();

		// 8��ģ����ѯ
		// test.findUser();

		// 9����ѯuserid��A-B֮�䣬username����name�ַ�����User��Ϣ
		// test.findUserByCond();

		//ͨ��
		test.getUserByName();

	}

}
