package com.blog.interceptor;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.blog.model.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
@Component(value="auth")

public class AuthInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		ActionContext ac = invocation.getInvocationContext();
		Map<String, Object> session = ac.getSession();
		User user = (User) session.get("user");
		if (user == null) {
			ac.put("tip", "����û�е�¼!");
			System.out.print("����û�е�¼!");
			return Action.LOGIN;
		}
		return invocation.invoke();
	}

}
