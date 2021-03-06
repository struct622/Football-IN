package com.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.domain.Criteria;
import com.spring.domain.MatchVO;
import com.spring.domain.TeamVO;
import com.spring.persistence.MatchDAO;

@Service
public class MatchServiceImpl implements MatchService{
	@Inject
	private MatchDAO dao;

	@Override
	public void registMatch(MatchVO match) throws Exception {
		dao.regist(match);
	}
	
	@Override
	public MatchVO detail(Integer mno) throws Exception {
		return dao.detail(mno);
	}
	
	@Override
	public void updateAway(MatchVO match) throws Exception {
		dao.updateAway(match);
	}

	@Override
	public List<MatchVO> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<MatchVO> listCriteria(Criteria cri) throws Exception {
		return dao.listCriteria(cri);
	}

	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return dao.countPaging(cri);
	}
	
	@Override
	public TeamVO getTeam(String teamname) throws Exception {
		return dao.getTeam(teamname);
	}
}
