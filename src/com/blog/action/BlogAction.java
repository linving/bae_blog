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
import org.springframework.stereotype.Component;

import com.blog.model.Blog;
import com.blog.model.Comment;
import com.blog.service.BlogService;
import com.blog.service.CommentService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@Component("blogAction")
@Scope("prototype")
public class BlogAction extends ActionSupport implements SessionAware,
		ServletRequestAware, ServletResponseAware, ModelDriven<Blog> {

	ActionContext context = ActionContext.getContext();
	private HttpServletRequest request;
	private HttpServletResponse response;
	private Map<String, Object> session;
	//
	private BlogService blogService;
	private CommentService commentService;

	//
	private Blog blog = new Blog();

	private List<Blog> blogList;

	// 分页起始页
	private Integer index;
	// bolg id
	private Integer blogid;

	/**
	 * 
	 * 某条博客的详细内容
	 * 
	 * @return
	 */

	public String blogDetail() {
		// Blog detail = new Blog();
		// System.out.println(blogid+"xxxx");
		if (blogid != null) {
			blog = blogService.findBlogById(blogid);
			ServletActionContext.getRequest().setAttribute("blog", blog);
			List<Comment> comments = commentService.listBlogComments(blogid, 0,
					6);
			ServletActionContext.getRequest()
					.setAttribute("comments", comments);
		}
		System.out.println(blog.toString());

		return SUCCESS;
	}

	public Blog getBlog() {
		return blog;
	}

	public Integer getBlogid() {
		return blogid;
	}

	public List<Blog> getBlogList() {
		return blogList;
	}

	public BlogService getBlogService() {
		return blogService;
	}

	public CommentService getCommentService() {
		return commentService;
	}

	public Integer getIndex() {
		return index;
	}

	@Override
	public Blog getModel() {
		// TODO Auto-generated method stub
		return this.blog;
	}

	public HttpServletRequest getRequest() {
		return request;
	}

	public HttpServletResponse getResponse() {
		return response;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * 
	 * 列出所有用户的博客
	 * 
	 * @return
	 */

	public String listAllBlogs() {
		if(index==null){
			index =1;
		}
		blogList = blogService.getAllBlogs(index, 6);
		ServletActionContext.getRequest().setAttribute("bloglist", blogList);
		return SUCCESS;
	}

	/**
	 * 分页列出某用户所有博客
	 * 
	 * @return
	 */
	public String listUserBlogs() {
		if (index == null) {
			index = 0;
		}
		blogList = blogService.findBlogByUser(index, 6,
				(HttpSession) request.getSession());
		System.out.println("blogList" + blogList.size());
		ServletActionContext.getRequest().setAttribute("bloglist", blogList);
		return SUCCESS;

	}

	/**
	 * 保存blog
	 * 
	 * @return
	 */
	public String saveBlog() {

		// blogService.saveBlog(blog,(HttpSession)
		// context.get(ActionContext.SESSION));
		blogService.saveBlog(blog, (HttpSession) request.getSession());
		return SUCCESS;

	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	public void setBlogid(Integer blogid) {
		this.blogid = blogid;
	}

	public void setBlogList(List<Blog> blogList) {
		this.blogList = blogList;
	}

	@Resource(name = "blogService")
	public void setBlogService(BlogService blogService) {
		this.blogService = blogService;
	}

	@Resource(name = "commentService")
	public void setCommentService(CommentService commentService) {
		this.commentService = commentService;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		this.request = arg0;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		this.response = arg0;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
