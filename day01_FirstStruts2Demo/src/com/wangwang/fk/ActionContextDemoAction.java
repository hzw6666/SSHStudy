package com.wangwang.fk;

import java.io.UnsupportedEncodingException;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class ActionContextDemoAction {
	private String name;

	public String getName() {

		try {
			if (name == null)
				return null;
			return new String(name.getBytes("ISO-8859-1"), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException(e);
		}
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute() {
		ActionContext context = ActionContext.getContext();
		// Map<String,Object> parameters=context.getParameters();
		// System.out.println("name:"+parameters.get("name"));
		System.out.println("name:" + getName());
		return "ok";
	}
}
