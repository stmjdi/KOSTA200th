package com.spring.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.BoardDAO;
import com.spring.vo.BoardVO;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardDAO bdao;
	
	@Override
	public List<HashMap<String, String>> showList() {
		List<HashMap<String,String>> ret = new ArrayList<HashMap<String,String>>();
		List<BoardVO> temp = bdao.selectAll();
		HashMap<String,String> hm;
		
		for(int i=0;i<temp.size();i++) {
			hm=new HashMap<>();
			hm.put("title",temp.get(i).getTitle());
			hm.put("username",temp.get(i).getUsername());
			hm.put("joinDate",temp.get(i).getJoinDate());
			ret.add(hm);
		}

		return ret;
	}

	@Override
	public BoardVO showDetail(String title, String username) {
		List<BoardVO> brds = bdao.selectAll();
		BoardVO ret=null;
		for(int i=0;i<brds.size();i++) {
			if(brds.get(i).getTitle().equals(title) && brds.get(i).getUsername().equals(username)) {
				ret=brds.get(i);
				break;
			}
		}
		
		return ret;
	}

	@Override
	public void uploadNewBoard(BoardVO bv) {
		bdao.insertNewBoard(bv);
		System.out.println("insert data successfully");
	}

	@Override
	public void deleteBoard(BoardVO bv) {
		// TODO Auto-generated method stub
		bdao.deleteBoard(bv);
		System.out.println("delete data successfully");
	}
	
}
