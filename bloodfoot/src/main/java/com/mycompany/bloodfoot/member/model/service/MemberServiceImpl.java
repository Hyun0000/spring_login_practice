package com.mycompany.bloodfoot.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.bloodfoot.member.model.dao.MemberDao;
import com.mycompany.bloodfoot.member.model.vo.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired private MemberDao memberDao;
	@Override
	public int insertMember(Member member) throws Exception {
		return memberDao.insertMember(member);
	}

}
