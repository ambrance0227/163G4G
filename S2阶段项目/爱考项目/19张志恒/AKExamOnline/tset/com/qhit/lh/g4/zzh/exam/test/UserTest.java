/**
 * 
 */
package com.qhit.lh.g4.zzh.exam.test;

import org.junit.Test;

import com.qhit.lh.g4.zzh.exam.common.action.UserAction;
import com.qhit.lh.g4.zzh.exam.common.bean.User;

/**
 * @author 张志恒
 * TODO
 * 2017年12月29日上午11:47:31
 */
public class UserTest {
	@Test
	public void login(){
		UserAction userAction = new UserAction();
		User user = new User();
		user.setName("admin");
		user.setPwd("123456");
		user.setRole(4);
		
		userAction.setUser(user);
		System.out.println(userAction.login());
	}
}
