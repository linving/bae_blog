package com.blog.action;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.blog.model.User;
import com.blog.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Component("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport implements SessionAware,
		ServletRequestAware, ServletResponseAware, ModelDriven<User> {

	/**
	 * 
	 */
	ActionContext context = ActionContext.getContext();
	private HttpServletRequest request;
	private HttpServletResponse response;
	private Map<String, Object> session;

	/**
      * 
      * 
        */
	private static final long serialVersionUID = 1L;

	private UserService userService;

	private User user = new User();

	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	private List<User> userList;

	/**
	 * 注册
	 * 
	 * @return
	 */
	public String addUser() {

		Logger.getAnonymousLogger().info("add action");

		if (user.getBlogDescription().isEmpty() || user.getBlogName().isEmpty()
				|| user.getEmail().isEmpty() || user.getPassword().isEmpty()
				|| user.getUsername().isEmpty()) {
			ServletActionContext.getRequest().setAttribute("error_msg",
					"请填写完整信息！");
			Logger.getAnonymousLogger().info("信息不完整！");
			return "login";
		}

		else if (userService.userExits(user.getUsername())) {
			ServletActionContext.getRequest().setAttribute("error_msg",
					"用户名存在！");
			Logger.getAnonymousLogger().info("用户名存在！");
			return "login";
		} else {
			Logger.getAnonymousLogger().info("保存用户信息！");
			user.setRegisterTime(new Date());
			userService.saveUser(user);
			session.put("user", user);
			Logger.getAnonymousLogger().info(user.toString());
			return SUCCESS;
		}

	}

	public String signUser() {

		if (!userService.userExits(user.getUsername())) {
			ServletActionContext.getRequest().setAttribute("error_msg",
					"用户不存在！");
			return "sign";
		} else {
			User u = userService.findUserByName(user.getUsername());
			if (u.getPassword().equals(user.getPassword())) {
				session.put("user", u);
				return SUCCESS;
			} else {
				ServletActionContext.getRequest().setAttribute("error_msg",
						"密码有误！");
				return "sign";
			}

		}

	}

	public User getUser() {
		return user;
	}

	public List<User> getUserList() {
		return userList;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	@Resource(name = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		this.response = arg0;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}

}
