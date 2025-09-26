package com.philDo.stuget.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.philDo.stuget.mapper.UserMapper;
import com.philDo.stuget.model.CrewVO;
import com.philDo.stuget.model.UserVO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public List<CrewVO> getCrewList() throws Exception {
		List<CrewVO> list = userMapper.getCrewList();
		return list;
	}


}
