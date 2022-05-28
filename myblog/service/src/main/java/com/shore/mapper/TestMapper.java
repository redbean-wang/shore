package com.shore.mapper;

import com.shore.model.CityDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper {
     CityDO getById(@Param("id") int id);
}
