package com.park.gerden.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.park.gerden.member.model.service.MemberService;
import com.park.gerden.member.model.vo.Member;

@Controller
@SessionAttributes("msg")
@RequestMapping("/")
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/")
	public String signUp() {
		return "redirect:/";
	}
	
	@PostMapping("/signUp")
	public String insertMember(Member member, Model model) {
		int result = 0;
		try {
			result = memberService.insertMember(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if (result == 1) {
			model.addAttribute("msg", "회원가입 성공");
		} else if(result == 0) {
			model.addAttribute("msg", "회원가입 실패");
		} else {
			model.addAttribute("msg", "회원가입 과정에서 오류 발생");
		}
		return "redirect:/";
	}
}
