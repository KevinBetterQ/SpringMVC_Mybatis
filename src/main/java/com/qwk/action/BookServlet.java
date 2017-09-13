package com.qwk.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.qwk.service.BookService;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("/BookServlet.do")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BookService bookService;
	
	@Override
	public void init() throws ServletException {
		//在当前上下文中获得Spring容器
	    WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
	    //从容器中获得bean
	    bookService = ctx.getBean(BookService.class);
	    
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
        writer.print(bookService.getAllBook().size());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
