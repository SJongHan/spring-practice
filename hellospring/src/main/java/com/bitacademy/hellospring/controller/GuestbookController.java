package com.bitacademy.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *  @RequestMapping
 *  클래스 단독 매핑
 *  Spring MVC 4.x 에서만 지원!
 *  Spring MVC 5.x 이상에서는 사용 금지
 */

// 
//@Controller
@RequestMapping("/guestbook/*")
public class GuestbookController {
	
	@ResponseBody
	@RequestMapping
	public String delete() {
		return "Guestbook.list()";
	}

}
