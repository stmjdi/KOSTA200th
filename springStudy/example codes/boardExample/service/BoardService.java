package com.spring.service;

import java.util.HashMap;
import java.util.List;

import com.spring.vo.BoardVO;

public interface BoardService {
	public List<HashMap<String,String>> showList();
	public BoardVO showDetail(String title, String username);
	public void uploadNewBoard(BoardVO bv);
	public void deleteBoard(BoardVO bv);
}
