package com.it.dao;

import com.it.entity.FounderUserMVSM;

public interface FounderUserDao {
	// 多对多查询
	public FounderUserMVSM getUMF(int userid);
}
