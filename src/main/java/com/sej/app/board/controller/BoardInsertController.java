package com.sej.app.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sej.app.board.service.BoardService;
import com.sej.app.board.vo.BoardVo;

@WebServlet("/board/insert")
public class BoardInsertController extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/view/board/boardInsert.jsp").forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String title = req.getParameter("title");
			String content = req.getParameter("content");
			String writer = req.getParameter("writer");
			
			BoardVo vo = new BoardVo();
			vo.setBoardTitle(title);
			vo.setBoardContent(content);
			vo.setBoardImg(writer);

			BoardService bs = new BoardService();
			int result = bs.write(vo);
			
			PrintWriter out = resp.getWriter();
			out.write("result: " + result);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
