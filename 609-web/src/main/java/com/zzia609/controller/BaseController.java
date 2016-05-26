package com.zzia609.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.zzia609.service.TestService;

@Controller
@RequestMapping("/base")
public class BaseController extends MultiActionController {
	
	@Autowired
	private TestService testService;
	
	@ResponseBody
	@RequestMapping("/test.html")
	public Object test (HttpServletRequest request, HttpServletResponse response) {
		testService.test();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("key1", "abc");
		map.put("key2", "def");
		return map;
	}
}
