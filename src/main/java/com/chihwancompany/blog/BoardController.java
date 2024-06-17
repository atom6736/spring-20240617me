package com.chihwancompany.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/board") // annotation코드이고 정식자바코드가 아니라 세미콜론은 불요. 그리고 회색으로 표시됨.
public class BoardController {
	@RequestMapping(value = "/gallery")
	public String gallery() {
		return "board/gallery";
	}
	@RequestMapping(value = "/free")
	public String free() {
		return "board/free";
	}
}
