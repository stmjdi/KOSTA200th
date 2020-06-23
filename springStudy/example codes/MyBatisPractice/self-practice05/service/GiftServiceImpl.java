package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.GiftDAO;
import com.spring.vo.GiftVO;

@Service("giftService")
public class GiftServiceImpl implements GiftService{
	@Autowired
	GiftDAO giftDAO;
	
	@Override
	public List<GiftVO> showAll() {
		return giftDAO.selectAllList();
	}

}
