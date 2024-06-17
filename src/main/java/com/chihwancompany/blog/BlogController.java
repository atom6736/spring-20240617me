package com.chihwancompany.blog;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.chihwancompany.blog.dto.MemberDto;

@Controller
public class BlogController {
	
	@RequestMapping(value = "/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(value = "/test")
	public String test() {
		return "sample01";
	}
	
	@RequestMapping(value = "/member")
	public String member() {
		return "user/member"; //특정 폴더 내의 jsp파일을 실행할 때
	}
	@RequestMapping(value = "/test2")
	public String test2() {
		return "sample02";
	}
	@RequestMapping(value = "/login")
	public String login() {
		return "login";
	}
//	@RequestMapping(value = "/loginOk")
//	public String loginOk(HttpServletRequest request, Model model) {
//		
//		String mid = request.getParameter("memberid"); //tiger
//		String mpw = request.getParameter("memberpw"); //12345
//		
//		model.addAttribute("loginid", mid);
//		model.addAttribute("loginpw", mpw);
//		model.addAttribute("user", "홍길동"); // 아무거다 여기에 적으면 실어서 보내게 됨.
//		
//		return "loginOk";
//	}
//@RequestMapping(value = "/loginOk")
//public ModelAndView loginOk(HttpServletRequest request, ModelAndView mv) {
//	
//	String mid = request.getParameter("memberid"); //tiger
//	String mpw = request.getParameter("memberpw"); //12345
//	
////	model.addAttribute("loginid", mid);
////	model.addAttribute("loginpw", mpw);
////	model.addAttribute("user", "홍길동"); // 아무거다 여기에 적으면 실어서 보내게 됨.
//	
//	mv.addObject("loginid", mid);
//	mv.addObject("loginpw", mpw);
//	mv.addObject("loginid", mid);
//	
//	mv.setViewName("loginOk");
//	
//	return mv; //반환타입이 string이아니라서 에러. 반환타입은 mv를 만들어준 클래스의 이름.
//   }
	@RequestMapping(value = "/loginOk")
	public String loginOk(@RequestParam("memberid") String mid, @RequestParam("memberpw") String mpw, Model model) {
		
//		String mid = request.getParameter("memberid"); //tiger
//		String mpw = request.getParameter("memberpw"); //12345
//		
		model.addAttribute("loginid", mid);
		model.addAttribute("loginpw", mpw);
		model.addAttribute("user", "홍길동"); 
		
		return "loginOk";
	}

	@RequestMapping(value = "/join")
	public String join() {
		
		return "join";
	}
	
	@RequestMapping(value = "/joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		
		String mid = request.getParameter("memberid");
		String mpw =request.getParameter("memberpw");
		String mname =request.getParameter("membername");
		String mage =request.getParameter("memberage");
		String memail =request.getParameter("memberemail");
		
		
		MemberDto memberDto = new MemberDto(mid, mpw, mname, mage, memail);
		
//		model.addAttribute("mmid", mid);
//		model.addAttribute("mmpw", mpw);
//		model.addAttribute("mmname", mname);
//		model.addAttribute("mmage", mage);
//		model.addAttribute("mmemail", memail);
//
		model.addAttribute("mdto", memberDto);
		
//위와 같이 하나씩 배달하는 것보다 위 다섯개를 한꺼번에 배달하면 좋을 것. 그것이 DTO
		//이것은 별도의 패키지로 만들어 코딩하는 것이 좋다. 테이블당 dto하나씩 만듦.
		
		return "joinOk";
	}
	
}