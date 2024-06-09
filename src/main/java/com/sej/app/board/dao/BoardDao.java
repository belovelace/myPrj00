package com.sej.app.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.sej.app.board.vo.BoardVo;
import com.sej.app.board.vo.SearchVo;

public class BoardDao {
	
	//게시글
	public int write(SqlSession ss, BoardVo vo) {
		return ss.insert("BoardMapper.write", vo);
	}
	//게시글 목록 조회
	public List<BoardVo> getBoardList(SqlSession ss, SearchVo vo){
		return ss.selectList("BoardMapper.getBoardList");
	}
	

}
