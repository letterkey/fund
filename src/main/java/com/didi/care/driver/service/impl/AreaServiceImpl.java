package com.didi.care.driver.service.impl;

import com.didi.care.driver.dao.IAreaDao;
import com.didi.care.driver.service.IAreaService;
import org.springframework.stereotype.Service;
import com.didi.care.driver.domain.Area;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by YMY on 2017/5/23.
 */
@Service("AreaService")
public class AreaServiceImpl implements IAreaService {
    @Resource(name="areaDao")
    private IAreaDao areaDao;

    public List<Area> getAreaList() {
        return areaDao.getList();
    }

    public Area getById(int id) {
        return areaDao.selectByPrimaryKey(id);
    }
}
