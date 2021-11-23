package com.mycompany.bloodfoot.member.model.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.bloodfoot.member.model.vo.Member;

@Repository("memberDao")
public class MemberDao {
	@Autowired private SqlSession sqlSessionTemplate;
	public int insertMember(Member member) throws Exception {
		return sqlSessionTemplate.insert("member.signUp", member);
	}
}
