package test.IDao;

import test.domain.DriverCareRuleCheck;

public interface DriverCareRuleCheckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DriverCareRuleCheck record);

    int insertSelective(DriverCareRuleCheck record);

    DriverCareRuleCheck selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DriverCareRuleCheck record);

    int updateByPrimaryKey(DriverCareRuleCheck record);
}