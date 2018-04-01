/**
 * 
 */
package com.qhit.lh.g4.zzh.exam.common.dao;

import com.qhit.lh.g4.zzh.exam.common.bean.User;

/**
 * @author 张志恒
 * TODO
 * 2017年12月29日上午11:07:21
 */
public interface UserDao {
	/**
	 * @param user
	 * @return
	 * 登录
	 */
	public User login(User user);
}
