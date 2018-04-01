package com.qhit.lh.g4.zzh.exam.common.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.qhit.lh.g4.zzh.exam.common.bean.User;
import com.qhit.lh.g4.zzh.exam.common.service.UserService;
import com.qhit.lh.g4.zzh.exam.common.service.impl.UserServiceImpl;

public class UserAction extends ActionSupport {
	private User user;
	private UserService userService = new UserServiceImpl();
	
	public String login(){
		user = userService.login(user);
		if (user != null) {
			//登录成功
			ServletActionContext.getRequest().getSession().setAttribute("user", user);
			return "loginSuccess";
		}else{
			//登录失败
			super.addActionError("用户名或密码错误！");
			return "loginFail";
		}
	}
	/**
	 * @return
	 * 退出
	 */
	public String logout(){
		//获取session对象，并销毁
		ServletActionContext.getRequest().getSession().invalidate();
		return "logout";
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
