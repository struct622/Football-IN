package com.spring.persistence;

import java.util.List;

import com.spring.domain.Criteria;
import com.spring.domain.SearchCriteria;
import com.spring.domain.UserVO;
import com.spring.dto.LoginDTO;

public interface UserDAO {
	UserVO login(LoginDTO dto) throws Exception;
	void create(UserVO vo)throws Exception;
	UserVO read(String uid) throws Exception;
	void update(UserVO vo) throws Exception; //미구현
	void delete(String uid) throws Exception; //미구현
	List<UserVO> listAll() throws Exception;
	
	//페이징
	List<UserVO> listCriteria(Criteria cri) throws Exception;
	int countPaging(Criteria cri) throws Exception;
	
	//검색
	List<UserVO> listSearch(SearchCriteria cri) throws Exception;
	int listSearchCount(SearchCriteria cri) throws Exception;
	
	//소속팀 업데이트
	void updateUserTeam(String uid, String teamname) throws Exception;
	
	void manager(String uid) throws Exception;
}
