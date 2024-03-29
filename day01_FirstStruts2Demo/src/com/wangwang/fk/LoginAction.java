package com.wangwang.fk;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = -310127467807300117L;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		if(getUsername()==null&&getPassword()==null) return "input";
		
		ActionContext ctx=ActionContext.getContext();
		//获得ServletContext的值
		Integer counter=(Integer) ctx.getApplication().get("counter");
		if(counter==null) counter=1;
		else {
			counter++;
		}
		//设置ServletContext的值
		ctx.getApplication().put("counter",counter);
		if (getUsername().equals("wangwang") && getPassword().equals("123456")) {
			ActionContext.getContext().getSession().put("user", "wangwang");
			ctx.put("tip", "服务器提示：你已经登录成功!!");
			return SUCCESS;
		} else {
			ctx.put("tip", "服务器提示:登录失败!!!");
			return ERROR;
		}
		
	}
	/**
	 * 用户注册测试
	 * @return
	 */
	public String register()
	{
		 
		 ActionContext ctx=ActionContext.getContext();
		 ctx.getSession().put("user",getUsername());
		 ctx.put("tip", "服务器提示：注册成功!!");
		 return SUCCESS;
	}
}
