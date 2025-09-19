package com.philDo.stuget.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.philDo.stuget.mapper.testMapper;
import com.philDo.stuget.model.testModel;

@Service
public class testServiceImpl implements testService {

	@Autowired
	private testMapper testMapper;

	@Override
	public List<testModel> seleTestModels() throws Exception {
		List<testModel> list = testMapper.selectTestModelList();
		testModel testVo = list.get(0);
		System.out.println("testVo : " + testVo);
		return testMapper.selectTestModelList();
	}


}
