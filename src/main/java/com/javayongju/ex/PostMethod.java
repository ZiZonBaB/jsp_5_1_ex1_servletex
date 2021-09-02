package com.javayongju.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostMethod
 */
@WebServlet({ "/PostMethod", "/Post" })
public class PostMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostMethod() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		// 기본값은 doget method값을 post로 넣어주어야 한다
		System.out.println("doPost~~!!~!~!~!");
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<head>");

		writer.println("</head>");
		writer.println("<body>");
		writer.println("<h1>Post 방식입니다. 이 페이지는 getPost 메소드가 호출된 것 입니다.</h1>");
		
		writer.println("</body>");
		writer.println("</html>");

	}

}
