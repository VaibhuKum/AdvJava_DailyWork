package com.cdac.web;

import java.io.IOException;

import com.cdac.dao.UserDao;





@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDao loginDao;

	public void init() {
		loginDao = new UserDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			authenticate(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void authenticate(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (loginDao.validate(username, password)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("login-success");
			dispatcher.forward(request, response);
		}else {
			throw new Exception("Login not successful..");
		}
	}
}