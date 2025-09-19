package com.philDo.stuget.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.philDo.stuget.model.testModel;

@Repository
@Mapper
public interface testMapper {

	List<testModel> selectTestModelList() throws Exception;
}