package com.philDo.stuget.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
//import com.philDo.stuget.mapper.testDAO;
import com.philDo.stuget.model.testModel;
import com.philDo.stuget.service.testService;

import jakarta.servlet.http.HttpServletRequest;

//@RestController
@RestController
@RequestMapping("/api")
public class testController {
	
	@Autowired
	private testService testService;
	
	@PostMapping("/ip")
	public ResponseEntity<String> ip (HttpServletRequest request) {
		// 요청을 보낸 클라이언트의 IP주소를 반환합니다.
		return ResponseEntity.ok(request.getRemoteAddr());
	}
	
	//index 보여주기
//	@GetMapping("/")
//	    public String home() {
//	        return "/index";
//	    }

	@GetMapping("/test")
	public ModelAndView getTestModels() throws Exception {
		
		System.out.println("getmapping test!");		

		ModelAndView mv = new ModelAndView("/user/test");
		
		List<testModel> list = testService.seleTestModels();
		
		System.out.println("list : " + list);		
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	
//	
//	@PostMapping("/test")
//	public String testPost(testModel testModel) {
//		System.out.println("postMapping!");		
//		
//		return "redirect:/";
//	}
//	
//	
//	@ResponseBody
//    @RequestMapping("/valueTest")
//    public String valueTest(){
//        String value = "테스트 String";
//        return value;
//	
//	}
}
	