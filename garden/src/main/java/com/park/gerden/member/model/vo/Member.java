package com.park.gerden.member.model.vo;

import org.springframework.stereotype.Component;

@Component
public class Member {
//MEMBER_ID VARCHAR2(30) PRIMARY KEY,
//MEMBER_PWD VARCHAR2(100) NOT NULL,
//MEMBER_NM VARCHAR2(15) NOT NULL,
//MEMBER_ENROLL_DT DATE DEFAULT SYSDATE
	private String memberId;
	private String memberPwd;
	private String memberNm;
	private String memberEnrollDt;
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberNm() {
		return memberNm;
	}
	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}
	public String getMemberEnrollDt() {
		return memberEnrollDt;
	}
	public void setMemberEnrollDt(String memberEnrollDt) {
		this.memberEnrollDt = memberEnrollDt;
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberPwd=" + memberPwd + ", memberNm=" + memberNm
				+ ", memberEnrollDt=" + memberEnrollDt + "]";
	}
	
	public Member() {
		// TODO Auto-generated constructor stub
	}
}
