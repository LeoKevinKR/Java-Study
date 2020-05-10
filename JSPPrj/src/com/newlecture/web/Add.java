package com.newlecture.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int x = 0, y = 0;
		String x_ = req.getParameter("x").trim();
		String y_ = req.getParameter("y").trim();
		if (x_ != null && !x_.equals("")) x = Integer.parseInt(x_);
		if (y_ != null && !y_.equals("")) y = Integer.parseInt(y_);
		
		int result = x + y;

		resp.getWriter().printf("덧셈 결과 : %d\n", result);

	}

}
