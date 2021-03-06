package com.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.domain.MemberVO;
import com.spring.persistence.MemberDAO;
import com.spring.persistence.TeamDAO;
import com.spring.persistence.UserDAO;

@Service
public class MemberServiceImpl implements MemberService {
	@Inject
	private MemberDAO memberDao;
	@Inject
	private TeamDAO teamDao;
	@Inject
	private UserDAO userDao;
	
	@Override
	@Transactional
	public void joinTeam(MemberVO member) throws Exception {
		memberDao.joinTeam(member);
		userDao.updateUserTeam(member.getUid(), member.getTname());
		teamDao.updatePeople(member.getTname(), 1);
	}
	
	@Override
	public List<MemberVO> listMembers(String tname) throws Exception {
		return memberDao.list(tname);
	}

	@Override
	public void exitTeam(String uid) throws Exception {
		String tname = memberDao.getTname(uid);
		teamDao.updatePeople(tname, -1);
		memberDao.exitTeam(uid);
	}

}
