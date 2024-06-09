package com.sej.app.board.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sej.app.board.dao.BoardDao;
import com.sej.app.board.vo.BoardVo;
import com.sej.app.board.vo.SearchVo;
import com.sej.app.db.SqlSessionTemplate;

public class BoardService {
	
	private final BoardDao dao;
	
	public BoardService() {
		this.dao =  new BoardDao();
	}
	

	//게시글 작성
	public int write(BoardVo vo) throws Exception {
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		
		int result = dao.write(ss, vo);
		if(result == 1) {
			ss.commit();
		}else {
			ss.rollback();
		}
		ss.close();
		return result;
	}
	//게시글 목록 조회
	public List<BoardVo> getBoardList(SearchVo vo) throws Exception{
		SqlSession ss = SqlSessionTemplate.getSqlSession();
		List<BoardVo> voList = dao.getBoardList(ss, vo);
		ss.close();
		return voList;
	}
	
}
