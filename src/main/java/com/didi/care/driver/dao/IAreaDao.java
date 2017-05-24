package com.didi.care.driver.dao;


import com.didi.care.driver.domain.Area;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value="areaDao")
public interface IAreaDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Integer id);

    List<Area> getList();

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);
}