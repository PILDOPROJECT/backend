package com.philDo.stuget.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.philDo.stuget.model.CrewVO;
import com.philDo.stuget.model.testModel;
import com.philDo.stuget.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getCrewList")
	public List<CrewVO> getCrewList(@RequestParam(required = false) String userSq) throws Exception {
		
		System.out.println("getmappling getTestModels2!!!!");
		List<CrewVO> crewList = userService.getCrewList();
		
		return crewList;
	}
	

}
	