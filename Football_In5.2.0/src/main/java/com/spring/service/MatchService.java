package com.spring.service;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.MatchVO;
import com.spring.domain.TeamVO;

public interface MatchService {
	void registMatch(MatchVO match) throws Exception;
	MatchVO detail(Integer mno) throws Exception;
	void updateAway(MatchVO match) throws Exception;
	List<MatchVO> listAll() throws Exception;
	
	//페이징
	List<MatchVO> listCriteria(Criteria cri) throws Exception;
	int listCountCriteria(Criteria cri) throws Exception;
	
	TeamVO getTeam(String teamname) throws Exception;
}
