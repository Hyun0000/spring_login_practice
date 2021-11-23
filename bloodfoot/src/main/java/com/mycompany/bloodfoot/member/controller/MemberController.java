package com.mycompany.bloodfoot.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycompany.bloodfoot.member.model.service.MemberService;
import com.mycompany.bloodfoot.member.model.vo.Member;

@Controller
@SessionAttributes("msg")
public class MemberController {
	@Autowired private MemberService memberService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String signUp(@RequestParam(value = "msg", defaultValue = "") String msg, Model model) {
		System.out.println("view 진입");
		System.out.println("msg : " + msg);
		model.addAttribute("msg", msg);
		return "index";
	}
	// ===============================================
	@RequestMapping(value = "/signUp", method = RequestMethod.POST)
	// @ModelAttribute("msg")
	public String signUp(RedirectAttributes redirectAttributes, Member member, Model model) {
		System.out.println("컨트롤러 진입");
		int result = 0;
		try {
			result = memberService.insertMember(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (result == 1) {
			redirectAttributes.addAttribute("msg", "회원가입 성공");
			// model.addAttribute("msg", "회원가입 성공");
		} else if (result == 0) {
			redirectAttributes.addAttribute("msg", "회원가입 실패");
			// model.addAttribute("msg", "회원가입 실패");
		} else {
			redirectAttributes.addAttribute("msg", "회원가입 오류 발생");
			// model.addAttribute("msg", "회원가입 과정에서 오류 발생");
		}
		return "redirect:/";
	}
}
