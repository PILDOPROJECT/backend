package com.philDo.stuget.service;

import java.util.List;

import com.philDo.stuget.model.CrewVO;
import com.philDo.stuget.model.UserVO;


public interface UserService {
	
	List<CrewVO> getCrewList() throws Exception;

}
