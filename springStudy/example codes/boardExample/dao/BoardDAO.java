package com.spring.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.vo.BoardVO;

@Mapper
public interface BoardDAO {
	public List<BoardVO> selectAll();
	public void insertNewBoard(BoardVO bv);
	public void deleteBoard(BoardVO bv);
}
