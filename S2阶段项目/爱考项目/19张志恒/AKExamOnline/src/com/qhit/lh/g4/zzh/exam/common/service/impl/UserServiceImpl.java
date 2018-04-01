/**
 * 
 */
package com.qhit.lh.g4.zzh.exam.common.service.impl;

import com.qhit.lh.g4.zzh.exam.common.bean.User;
import com.qhit.lh.g4.zzh.exam.common.dao.UserDao;
import com.qhit.lh.g4.zzh.exam.common.dao.impl.UserDaoImpl;
import com.qhit.lh.g4.zzh.exam.common.service.UserService;

/**
 * @author 张志恒
 * TODO
 * 2017年12月29日上午11:06:34
 */
public class UserServiceImpl implements UserService {
	private UserDao userDao = new UserDaoImpl();

	/* (non-Javadoc)
	 * @see com.qhit.lh.g4.zzh.exam.common.service.UserService#login(com.qhit.lh.g4.zzh.exam.common.bean.User)
	 */
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.login(user);
	}

}
