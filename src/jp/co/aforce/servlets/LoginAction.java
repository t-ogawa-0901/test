package jp.co.aforce.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.bean.Members;
import jp.co.aforce.dao.MembersDAO;
import jp.co.aforce.tool.Action;

public class LoginAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		HttpSession session=request.getSession();

		String login=request.getParameter("login");
		String password=request.getParameter("password");

		MembersDAO dao=new MembersDAO();
		Members members=dao.search(login, password);
		
		if (members!=null) {
			session.setAttribute("members", members);
			return "login-out.jsp";
		}
		
		return "login-error.jsp";
	}
}
