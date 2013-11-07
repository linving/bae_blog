package com.blog.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.blog.model.Comment;
import com.blog.service.CommentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Controller(value = "commentAction")
@Scope("prototype")
public class CommentAction extends ActionSupport implements SessionAware,
		ServletRequestAware, ServletResponseAware, ModelDriven<Comment> {
	private Comment comment = new Comment();
	private Integer blogid;
	//
	ActionContext context = ActionContext.getContext();
	private HttpServletRequest request;
	private HttpServletResponse response;
	private Map<String, Object> session;

	//
	private CommentService commentService;

	/**
	 * ±£¥Ê∆¿¬€
	 * 
	 * @return
	 */
	public String saveComment() {
		if (blogid != null) {
			commentService.saveComment(comment,
					(HttpSession) request.getSession(), blogid);
		}

		return SUCCESS;
	}

	public String listBlogComments() {
		if (blogid != null) {
			List<Comment> c = commentService.listBlogComments(blogid, 0, 6);
			ServletActionContext.getRequest().setAttribute("blogcomments", c);
		}
		return SUCCESS;

	}

	public Integer getBlogid() {
		return blogid;
	}

	public void setBlogid(Integer blogid) {
		this.blogid = blogid;
	}

	public CommentService getCommentService() {

		return commentService;
	}

	@Resource(name = "commentService")
	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

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

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	@Override
	public Comment getModel() {
		// TODO Auto-generated method stub
		return this.comment;
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
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = arg0;
	}

}
