package com.philDo.stuget.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.philDo.stuget.model.CrewVO;

@Repository
@Mapper
public interface UserMapper {
	
//	crew_tb 리스트 조회
	public List<CrewVO> getCrewList();
}