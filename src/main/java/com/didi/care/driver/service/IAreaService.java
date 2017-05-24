package com.didi.care.driver.service;


import com.didi.care.driver.domain.Area;

import java.util.List;

/**
 * Created by didi on 2017/5/23.
 */
public interface IAreaService {
    public List<Area> getAreaList();
    public Area getById(int id);
}
