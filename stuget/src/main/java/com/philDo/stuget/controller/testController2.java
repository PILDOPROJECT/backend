package com.philDo.stuget.controller;

import java.util.Iterator;
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

import com.philDo.stuget.model.CrewVO;
//import com.philDo.stuget.mapper.testDAO;
import com.philDo.stuget.model.testModel;
import com.philDo.stuget.service.UserService;
import com.philDo.stuget.service.testService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/test")
public class testController2 {
	
	@Autowired
	private testService testService;
	private UserService userService;
	

	@GetMapping("/test")
	public ModelAndView getTestModels() throws Exception {
		
		System.out.println("getmapping test!");		

		ModelAndView mv = new ModelAndView("/user/test");
		
		List<testModel> list = testService.seleTestModels();
		
		System.out.println("list : " + list);		
		
		mv.addObject("list",list);
		
		return mv;
	}
	
	
//	@GetMapping("/test")
//	public ModelAndView getTestModels() throws Exception {
//		
//		System.out.println("getmapping test!");		
//
//		ModelAndView mv = new ModelAndView("/user/test");
//		
//		List<CrewVO> list = userService.getCrewList();
//		
//		System.out.println("list : " + list);		
//		
//		mv.addObject("list",list);
//		
//		return mv;
//	}
	
	@GetMapping("/test2")
	public List<testModel> getTestModels2() throws Exception {
		
		System.out.println("getmappling test2!!!!");
		List<testModel> testlist = testService.seleTestModels();
		
		for(int i = 0; i < testlist.size(); i++) {
			System.out.println("testVO = " + testlist.get(i));
		}
		
		return testlist;
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
	